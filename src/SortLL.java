public class SortLL {
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
    public void bubbleSort(Node head){
        Node temp=head;
        boolean swapped;
        do{
            swapped=false;
            while(temp!=null) {
                if (temp.val > temp.next.val) {
                    int t = temp.val;
                    temp.val = temp.next.val;
                    temp.next.val = t;
                    swapped = true;
                }
                temp=temp.next;
            }
        }while(swapped);
    }
}
