package demomethod06;

import java.util.Arrays;

//实现Comparable接口
class Student implements Comparable<Student>{
    public String name;
    public int age;

    public Student(String name,int age) {
        this.name=name;
        this.age=age;
    }
    //重写toString方法，如果不重写的话，直接打印对象数组的名称就会得到对象+地址
    @Override
    public String toString() {
        return "{"+this.name+":"+this.age+"}";
    }
   @Override
    public int compareTo(Student o) {
        //return this.age-o.age;//当前对象的引用的age-传进来的参数的age1  升序
        return o.age-this.age;//降序
    }
}
public class Demo10 {
    public static void main(String[] args) {
        //创建对象数组
        Student[] students=new Student[]{new Student("王慧敏",65),
                new Student("张三",99),
                new Student("李四",52)};
        Arrays.sort(students);//调用排序方法，因为数组里面放的是对象，因此不知道该用什么标准进行排序，需要重写omparable方法
        System.out.println(Arrays.toString(students));
    }
}
