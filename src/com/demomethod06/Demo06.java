package demomethod06;
//顺序表
import java.util.Arrays;
class MyArrayList {
    public int[] elem;
    public int usedSize;
    //设置默认容量
    public static final int DEFAULT_SIZE = 10;
    //带参构造方法
    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }
    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
    }
    //扩容,给elem扩大到原来的2倍
    public void grow(){
        this.elem=Arrays.copyOf(this.elem,this.elem.length*2);
    }
    //在某个位置新增元素
    public void add(int pos, int data) {
        if (isFull()) {
            System.out.println("顺序表是满的");
            return;
        }
        if (pos < 0 || pos > usedSize) {
            return;
        }
        //挪数据
        for (int i = usedSize - 1; i >= pos; i--) {
            this.elem[i + 1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
    public boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }
    //是否包含某个元素
    public boolean contains(int toFind) {
        if (isEmpty()) {
            System.out.println("顺序表为空");
        }
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }
    //顺序表是否为空
    public boolean isEmpty() {
        if(this.usedSize==0){
            return true;
        }
        return false;
    }

    //查找某个元素对应的位置
    public int search(int toFind) {
        if (isEmpty()) {
            System.out.println("顺序表为空");
        }
        for (int i = 0; i < this.usedSize; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }// 获取 pos 位置的元素
    public int getPos(int pos) {
        if (isEmpty()) {
            System.out.println("顺序表为空");
        }
        if (pos < 0 || pos > this.usedSize) {
            return -1;
        }
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
    if(pos<0 ||pos>this.usedSize){
        System.out.println("pos位置不合法");
    }
    this.elem[pos]=value;
    }
    //删除第一次出现的关键字key
    public void remove(int key) {
        int index=search(key);
        if (index != -1) {
            for (int i = index; i < this.usedSize - 1; i++) {
                    this.elem[i] = this.elem[i + 1];
                }
                this.usedSize--;
            }
        }

    // 获取顺序表长度
    public int size() {
         return this.usedSize;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize=0;
    }
}
   public class Demo06 {
            public static void main(String[] args) {
                MyArrayList m = new MyArrayList();
                m.add(0,5);
                m.add(1,3);
                m.add(2,8);
                System.out.println("插入元素之后顺序表是");
                m.display();//5 3 8
                System.out.println();
                System.out.println("是否包含元素：");
                System.out.println(m.contains(5));//true
                System.out.println("得到某个位置的元素");
                System.out.println(m.getPos(0));//5
                System.out.println("找到某个元素的位置");
                System.out.println(m.search(0));//-1
                System.out.println("线性表长度为");
                System.out.println(m.size());//3
                System.out.println("设置某个位置的元素");
                m.setPos(0,10);
                m.display();//10 3 8
                System.out.println();
                System.out.println("删除某个元素");
                m.remove(8);
                m.display();//10 3
                System.out.println();
                System.out.println("扩容");
                m.grow();
                m.add(1,9);//10 9 3
                m.display();
            }
        }
