public class Deletion {
    private Node head;
    private Node tail;
    private int size;
    public Deletion(){
        size=0;
    }
    public Node deleteHead(int val){
        if(head==null)return head;
        head=head.next;
        return head;
    }
    public Node insertHead(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        return head;
    }
    private class Node{
        int val;
        private Node next;
        Node(int val){
            this.val=val;
        }
        Node(int val, Node next){
            this.val=val;
            this.next=next;
            size++;
        }
    }

    public static void main(String[] args) {

    }
}
