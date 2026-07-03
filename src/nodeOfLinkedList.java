public class nodeOfLinkedList {

    private Node head;
    private Node tail;
    private int size;
    //constructor
    public nodeOfLinkedList(){
        this.size=0;
    }
//========================================= Insertion ================================================
     void insertAtHead(int val){
        Node node=new Node(val);
        if(head==null){
            head=tail=node;
        }else{
            node.next=head;
            head=node;
        }
        size++;
    }

     void insertAtTail(int val){
        Node node=new Node(val);
        if(tail==null) {
          head=tail=node;
        }else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

     void insertAnyWhere(int val, int index){
        //if index=0, node will be added to the head
        if(index==0){
            insertAtHead(val);
            return;
        }
        //if index=size, node will be added to the tail
        if(index==size){
            insertAtTail(val);
            return;
        }
        //when we wanna place anywhere middle
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }

//==================================== Deletion ========================================
     void deleteFirst(){
        if(head==null)return;
        head=head.next;
        if(head==null){
            tail=null;
        }
      size--;
  }
     void deleteLast(){
        if(head==null||head.next==null)return;
        Node temp=head;
        while(temp.next.next !=null){
            temp=temp.next;
        }
        temp.next=null;
        size--;
  }
     void deleteAnywhere(int index){
        if(size==0||index>=size){
            System.out.println("Error");
            return;
        }
        Node temp=head;
        for(int i=1;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        if(index==size-1)tail=temp;
  }
//================================ Display Method ======================================
     void display(){
        if(head==null){
            System.out.println("null");
            return;
        }
        //create temp to go from head to tail
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

//========================= Node Class =================================================
    private  class Node {
        private int val;
        private Node next;

        Node(int val) {
            //val parameterized constructor
            this.val = val;
            this.next = null;
        }

        Node(int val, Node next) {
            //val+next parameterized constructor
            this.val = val;
            this.next = next;
        }
    }

//========================= Main Method ==================================================
    public static void main(String[] args) {
        nodeOfLinkedList list1=new nodeOfLinkedList();

        list1.display();

        list1.insertAtTail(6);
        list1.insertAtTail(7);
        list1.insertAtTail(8);
        list1.insertAtTail(9);
        list1.insertAtTail(54);

        //list1.insertAnyWhere(69,5);
        list1.display();
        list1.insertAtHead(222);
        list1.display();
        //list1.deleteFirst();
       // list1.display();

        //list1.deleteLast();
        //list1.display();
        System.out.println(list1.size);
    }

}
