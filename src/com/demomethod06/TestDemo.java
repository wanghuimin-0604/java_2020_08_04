package demomethod06;

public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(1);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(4);
        /*myLinkedList.addLast(1);
        myLinkedList.addLast(2);*/
        myLinkedList.addIndex(2,5);
        myLinkedList.display();
        System.out.println("#############");
        System.out.println(myLinkedList.contains(3));
        System.out.println("##############");
        System.out.println(myLinkedList.size());
        System.out.println("################");
        myLinkedList.remove(5);
        myLinkedList.display();
        System.out.println("##############");
        myLinkedList.removeAllKey(4);
        myLinkedList.display();
    }
}
