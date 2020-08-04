package demomethod06;
//实现克隆接口
class Money implements Cloneable {
    public int money = 19;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

    class Persons implements Cloneable {
        public int age;

        public Money m;//Money类型的变量

        public Persons() {
            this.age = age;
            m = new Money();
        }

        @Override
        public String toString() {
            return "Persons{" +
                    "age=" + age +
                    '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Persons person = (Persons) super.clone();//创建一个对象
            person.m = (Money) this.m.clone();
            return person;

        }
    }

    public class Demo09 {

        public static void main(String[] args) throws CloneNotSupportedException {
            Persons persons = new Persons();
            Persons persons1 = (Persons) persons.clone();
            persons.age = 5;
            System.out.println(persons.age);

            System.out.println("################");
            persons1.age = 66;
            System.out.println(persons1.age);
            System.out.println(persons.age);

            System.out.println("_________________");
            System.out.println(persons.m.money);
            persons1.m.money=29;
            System.out.println(persons1.m.money);
        }
    }
