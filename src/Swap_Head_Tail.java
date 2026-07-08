public class Swap_Head_Tail {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapHeadTail(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        int temp=head.val;
        head.val=tail.val;
        tail.val=temp;
        return head;
    }
}
