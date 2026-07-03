public class Midpoint {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }

        Node(int val, Node next1) {
            this.val = val;
            this.next = next1;
        }
    }

    static void midPointBrute(Node head){

       //==== Brute force
        //TC- O(N+N/2)
        //SC- O(1)
        //step-1
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        //step-2
        int mid=size/2+1;
        temp=head;
        while(temp!=null){
            mid-=1;
            if(mid==0)break;
            temp=temp.next;
        }
        Node midNode=temp;
        System.out.println(midNode.val);
    }

    static void midPointOptimal(Node head) {

        //==== optimal approach
        //step-1
        int size = 0;

        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.val);
    }
    public static void main(String[] args) {

        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node head=a;

        midPointBrute(head);
        midPointOptimal(head);
    }
}
