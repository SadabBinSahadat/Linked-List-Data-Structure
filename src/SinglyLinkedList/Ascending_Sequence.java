package SinglyLinkedList;

import java.util.*;
public class Ascending_Sequence {
    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
        }
    }

    public static boolean sequenceChecker(Node head){
        Node temp=head;
        while(temp!=null&&temp.next!=null){
            if(temp.val>temp.next.val)return false;
            temp=temp.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(40);
        Node d=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        Node head=a;
        System.out.println(sequenceChecker(head));
    }
}
