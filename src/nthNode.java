import java.util.*;
public class nthNode {

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
    public static void nth(Node head,int idx){
        Node temp=head;
        for(int i=2;i<=idx;i++){
            temp=temp.next;
        }
        System.out.println(temp.val);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter idx:");
        int idx=sc.nextInt();
        Node a=new Node(sc.nextInt()); //{Head Node}
        Node b=new Node(sc.nextInt());
        Node c=new Node(sc.nextInt());
        Node d=new Node(sc.nextInt());
        Node e=new Node(sc.nextInt());
        Node f=new Node(sc.nextInt()); //{Tail Node}

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        nth(a,idx);
    }

}
