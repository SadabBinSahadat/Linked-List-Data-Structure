package SinglyLinkedList;

public class DeleteMid {

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

    public static Node deleteMidBrute(Node head){
        if(head==null||head.next==null)return null;

        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int b_Mid=size/2;

        temp=head;
        while(temp!=null){
            b_Mid--;
            if(b_Mid==0){
                temp.next=temp.next.next;
            }
        }
        return head;
    }

    public static int deleteMidOpt(Node head){
        if(head==null||head.next==null)return -1;
        Node slow=head;
        Node fast=head;
        fast=fast.next.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return slow.next.val;
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
        System.out.println(deleteMidOpt(head));
    }
}
