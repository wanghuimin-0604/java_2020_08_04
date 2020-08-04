package demomethod06;

/**
 * Created with IntelliJ IDEA.
 * Description:聚合关系
 * User:wanghuimin
 * Date:2020-05-15
 * Time:8:21
 * 一万年太久，只争朝夕，加油
 */
//学生类
class Students{
    public String num;
    public String name;
    public int age;
    public String grade;

    public Students(String num, String name, int age, String grade) {
        this.num = num;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void start(){
        System.out.println(name+"开始上学了...");
    }
}

//学校类
class School{

    public String name;	//学校的名字
    //类是实例变量
    Students s1; //学生1

    Students s2; //学生2

    Students s3; //学生3


    public School(String name, Students s1, Students s2, Students s3){
        this.name = name;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }


    //学校开学
    public void startStudy(){
        System.out.println(name+"开学啦！");
    }
}
public class Demo11{
    public static void main(String[] args) {
        //创建了三个学生
        Students s1 = new Students("17060213129","舒佳蕊",24,"大三");
        Students s2 = new Students("17060213130","王慧敏",23,"大三");
        Students s3 = new Students("17060213131","王昱璐",22,"大三");

        //创建一个学校
        School s = new School("西安工业大学", s1,s2,s3);
        s.startStudy();
        //
        System.out.println("2号学生的名字：" + s.s2.name+" 学号:"+s.s2.num+" 年龄:"+s.s2.age+" 年级:"+s.s2.grade);
        s2.start();
    }
}
