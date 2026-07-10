package SinglyLinkedList;

import java.util.*;

public class displayList {

    private static class Node {
        private int val;
        private Node next;

        Node(int val) {
            //val parameterized constructor
            this.val = val;
            this.next = null;
        }

        Node(int val, Node next1) {
            //val+next parameterized constructor
            this.val = val;
            this.next = next1;
        }
    }

    public static void display(Node head){
        Node temp=head;
        System.out.println("Displaylist class");
        System.out.println(head.val);
        System.out.println(head.next.val);
        System.out.println(head.next.next.val);
        System.out.println(head.next.next.next.val);
        System.out.println(head.next.next.next.next.val);
        System.out.println(head.next.next.next.next.next.val);

        System.out.println("Traversing Linked List with loop and only head");

        while(temp!=null){
            System.out.println(temp.val+" ");
            temp=temp.next;
        }

        System.out.println("With for loop:");

        for(temp=head;temp!=null;temp=temp.next){
            System.out.println(temp.val+" ");
        }
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

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        display(a);
    }
}
