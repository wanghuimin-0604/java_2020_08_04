package demomethod06;
//节点类
class Node{
    public int data;//数据域
    public Node next;//引用，Node类型的next

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
//单链表
public class MyLinkedList {
    public Node head;//头节点

    public MyLinkedList() {
        this.head = null;
    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {//第一次插入节点
            this.head = node;
            return;//代码完成
        }
        node.next = this.head;
        this.head = node;

    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (this.head == null) {
            this.head = node;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index, int data) {
        Node node = new Node(data);
        if (index < 0 || index > size()) {
            throw new RuntimeException("插入位置不合法");
            //System.out.println("插入位置不合法");
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size()) {
            addLast(data);
            return;
        }
        Node prev = findIndex(index);
        node.next = prev.next;
        prev.next = node;
    }


    public Node findIndex(int index){
        Node cur=this.head;
        int count=0;
        while(count < index-1){
            count++;
        }
        return cur;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;

    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        //删除头节点
        if (this.head.data == key) {
            this.head = this.head.next;
            return;
        }
        Node prev = findPrev(key);
        if (prev == null) {
            return;//没有这个节点
        }
        Node del = prev.next;
        prev.next = del.next;
    }
         public Node findPrev(int key) {
             Node prev = this.head;
             while (prev.next != null) {
                 if (prev.next.data == key) {
                     return prev;
                 }
                 prev = prev.next;
             }
             return null;
         }

    //删除所有值为key的节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = this.head.next;
        while (cur != null) {
            if (cur.data == key) {
                prev.next = cur.next;//prev=prev.next;
                cur = cur.next;
            } else {
                prev = cur;
                cur = cur.next;
            }
        }
        if(this.head.data==key){
            this.head=this.head.next;
        }
    }
    //得到单链表的长度
    public int size() {
        Node cur=this.head;
        int count=0;
        while(cur!=null){
            cur=cur.next;
            count++;

        }
        return count;
    }

    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }

    }

    public void clear() {
        this.head=null;
    }

    public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp =  newHead;
        //1、当两个单链表都不为空的时候
        while(headA!=null&&headB!=null){
            if(headA.data<=headB.data) {
                tmp.next = headA;
                headA = headA.next;
                tmp = tmp.next;
            }else{
                tmp.next=headB;
                headB=headB.next;
                tmp=tmp.next;
            }
        }
        //2、第一步完成后   其中一个单链表不为空  一个为空
        if(headA!=null){
            tmp.next=headA;//拼起来就好了
        }
        if(headB!=null){
            tmp.next=headB;
        }
        return newHead.next;
    }

}
