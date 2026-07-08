public class Swap_Head_Mid {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode swapHeadMid(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        int temp=head.val;
        head.val=slow.val;
        slow.val=temp;
        return head;
    }
}
