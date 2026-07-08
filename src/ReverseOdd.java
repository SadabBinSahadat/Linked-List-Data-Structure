public class ReverseOdd {
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
    public static Node reverse_Odd(Node head){
        if(head==null)return null;
        Node curr=head;
        Node tempHead=null;
        Node tempTail=tempHead;

        do{
            if(curr.val%2!=0){
                Node newNode=new Node(curr.val);
                if(tempHead==null) {
                    tempHead = newNode;
                    tempTail=newNode;
                }
                else {
                    tempTail.next=newNode;
                    tempTail=tempTail.next;
                }
            }
            curr=curr.next;
        }while(curr!=head);

        Node prev=null;
        Node tempCurr=tempHead;
        Node front=tempHead.next;

        while(tempCurr!=null){
            tempCurr.next=prev;
            prev=tempCurr;
            tempCurr=front;
        }
        curr=head;
        tempCurr=tempHead;
        do{
            if(curr.val%2!=0){
                curr.val = tempCurr.val;
                tempCurr=tempCurr.next;
            }
            curr=curr.next;
        }while(curr!=head);

        return head;
    }
}
