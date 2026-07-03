public class ReverseList {

    //Node Class
    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        Node(int val, Node next1) {
            this.val = val;
            this.next = next1;
        }
    }
    //main method
    public static void main(String[] args) {
        Node head=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(40);
        Node e=new Node(50);
        Node f=new Node(60);

    }
    //Reverse
    public static void reverseList(Node head){

    }
}
