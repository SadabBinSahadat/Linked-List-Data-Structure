public class Remove_Last_nth {
    private static class ListNode {
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }

        ListNode(int val, ListNode next1) {
            this.val = val;
            this.next = next1;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        if(head==null)return null;
        ListNode dummy=new ListNode();
        dummy.next=head;

        ListNode fast=dummy;
        ListNode slow=dummy;

        for(int i=1;i<=n;++i){
            fast=fast.next;
        }

        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return dummy.next;
    }
}

