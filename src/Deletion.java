public class Deletion {
    private Node head;
    private Node tail;
    private static class Node {
        int val;
        Node next;
        Node(){}
        Node(int val) {
            this.val = val;
            this.next = null;
        }

        Node(int val, Node next1) {
            this.val = val;
            this.next = next1;
        }
    }
    private int size;
    public Deletion(){
        size=0;
    }
    public Node deleteHead(){
        if(head==null)return head;
        head=head.next;
        return head;
    }

    public Node deleteTail(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
       return head;
    }
    public Node insertHead(){
        Node node=new Node();
        node.next=head;
        head=node;
        return head;
    }

    public static void main(String[] args) {

    }
}
