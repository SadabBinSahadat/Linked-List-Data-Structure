public class LoopChecker {
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
        head.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=c;
        System.out.println(loopChecker(head));
    }

    //Loop checker
    public static boolean loopChecker(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)return true;
        }
        return false;
    }

    public static int loopCounter(Node head){
        int count=0;
        return count;
    }
}
