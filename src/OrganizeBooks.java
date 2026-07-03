public class OrganizeBooks {
    private static class Node{
        String val;
        Node next;
        Node(String val){
            this.val=val;
        }
    }

    public static Node organizeBooks(Node head,int[]popularity){

        if(head==null||head.next==null)return head;
        boolean swapped;
        do{
            int i=0;
            swapped=false;
            Node current=head;
            while(current!=null){
                if(popularity[i+1]>popularity[i]) {
                    String tempTitle=current.val;
                    current.val=current.next.val;
                    current.next.val=current.val;

                    int temp=popularity[i];
                    popularity[i]=popularity[i+1];
                    popularity[i+1]=temp;
                    swapped=true;
                }
                current=current.next;
                i++;
            }
        }while(swapped);

        return head;
    }
    public static void main(String[] args) {
        int[]popularity={8,10,5,10,6};
    }
}