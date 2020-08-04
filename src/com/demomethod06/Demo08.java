package demomethod06;


abstract class Animal{//抽象类
    public int a;//普通成员变量
    public void method(){//普通成员方法

    }
    public abstract void draw();//抽象方法
}
class Cat extends Animal{
    @Override
    public void draw(){
        System.out.println("猫");
    }
}
class Dog extends Animal {
    @Override
    public void draw() {
        System.out.println("狗");
    }
}
public class Demo08 {
    public static void walk(Cat cat){
        cat.draw();
    }
    public static void main(String[] args) {
        Cat cat=new Cat();
        walk(cat);


    }
}
