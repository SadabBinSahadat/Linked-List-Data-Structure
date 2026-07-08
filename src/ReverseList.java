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
        // Creating a linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node newHead=reverseList(head);

        // Printing the reversed list
        while (newHead != null) {
            System.out.print(newHead.val + " -> ");
            newHead = newHead.next;
        }
        System.out.println();
    }
    //Reverse
    //TC- O(n) SC- O(1)
    public static Node reverseList(Node head){
        if(head==null ||head.next==null)return head;
        Node newHead=reverseList(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
        }
}
