package demomethod06;

 class Person{
     private String name;
     private int age;

     public Person(String name, int age) {
         this.name=name;
         this.age=age;

     }

     public int getAge() {
         return age;
     }
     public void setAge(int age) {
         this.age = age;
     }

     public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

 }
public class Demo02 {
    public static void main(String[] args) {
        Person person=new Person("王慧敏",22);
        //person.setAge(19);
       // person.setName("王慧敏");
        System.out.println("姓名"+person.getName()+"姓名"+person.getAge());

    }


}
