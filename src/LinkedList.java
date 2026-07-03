import java.util.Scanner;

public class LinkedList {

    private static class Node {
        private int val;
        private Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        Node(int val, Node next1) {
            this.val = val;
            this.next = next1;
        }
    }
    private static Node arrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover=head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover=temp;
        }
        return head;
    }
//==============================================================================================
        public static int lengthOfLL(Node head){
            int count=0;
            Node temp=head;

            while(temp!=null){
                temp=temp.next;
                count++;
            }
            return count;
        }
//==============================================================================================
        public static boolean checkIfPresent(Node head, int ele) {
            Node temp = head;

            while (temp != null) {
                if (temp.val == ele) return true;
                temp=temp.next;
            }
            return false;
        }
//===================================Main Method===========================================================
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int[] arr = {1, 2, 3, 4, 5};
            Node head= arrayToLinkedList(arr);
            Node temp=head;

            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }

            System.out.println("Size of LL: "+lengthOfLL(head));
            System.out.println("Enter element:");
            int element=sc.nextInt();
            boolean present=checkIfPresent(head,element);
            if(present){
                System.out.println("Its present in the Linked List");
            }else{
                System.out.println("Its not present");
            }
        }
    }
