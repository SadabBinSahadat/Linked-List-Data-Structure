import java.util.Scanner;

public class displayRec{

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
    public static void displayRecursion(Node head){
        if (head==null)return;
        System.out.print(head.val);
        displayRecursion(head.next);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node a=new Node(sc.nextInt());//{Head Node}
        Node b=new Node(sc.nextInt());
        Node c=new Node(sc.nextInt());
        Node d=new Node(sc.nextInt());
        Node e=new Node(sc.nextInt());
        Node f=new Node(sc.nextInt());//{Tail Node}

        a.next=b;b.next=c;
        c.next=d;d.next=e;
        e.next=f;
        displayRecursion(a);
    }
}