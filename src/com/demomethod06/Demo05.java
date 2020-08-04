package demomethod06;
/*
编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘
除四种运算
 */
class Calculator {
    public int num1;
    public int num2;

    public int add() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - this.num2;
    }

    public int mut() {
        return this.num1 * this.num2;
    }

    public double div() {
        double ret = this.num1 / this.num2;
        return ret;
    }
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;

    }
}
public  class Demo05 {
    public static void main(String[] args) {
        Calculator c=new Calculator(6,2);//通过构造方法进行初始化
        System.out.println("加"+c.add());
        System.out.println("减"+c.sub());
        System.out.println("乘"+c.mut());
        System.out.println("除"+c.div());

    }
}

