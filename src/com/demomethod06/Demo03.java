package demomethod06;


    //        static int cnt = 6;
//        static{
//            cnt += 9;
//        }
//        public static void main(String[] args){
//            System.out.println("cnt =" + cnt);
//        }
//        static{
//            cnt /=3;
//        };
//    }
    class Test {
        public String toString(){
            System.out.print("aaa");
            return "bbb";
        }
    }
public class Demo03 {
    public static void main(String[] args) {

        System.out.println(new Test());//匿名对象
    }
}


