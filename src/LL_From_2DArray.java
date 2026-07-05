public class LL_From_2DArray {
    public static class Node {
        int value;
        int row_index;
        int column_index;
        Node next;
        Node(){};
        Node(int value, int row_index, int column_index){
            this.value = value;
            this.row_index = row_index;
            this.column_index = column_index;
            this.next = null;  }  }

    public static void main(String[] args) {
        int[][] mat={{4,-1,3},{0,3,-2},{6,-3,1}};
        for(int[]a:mat){
            for(int ele:a){
                System.out.println();
            }
        }
        int threshold=6;
        Node dh=new Node();
        buildAndRearrange(mat, threshold, dh);
        Node temp=dh;
        while(temp!=null){
            if(temp==dh){
                System.out.print("dh -> ");
                temp=temp.next;
            }
            else{
                System.out.print("("+temp.value+","+temp.row_index+","+temp.column_index+") -> ");
                temp=temp.next;
            }
        }
    }
    public static Node buildAndRearrange(int[][] M, int threshold, Node dh){
        int n=M.length;
        Node satisfyTail=dh;
        Node unsatisfyHead=null, unsatisfyTail=null;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                Node node = new Node(M[i][j], i, j);
                if (M[i][j] > 0) {
                    if (M[i][j] + i + j > threshold) {
                        satisfyTail.next=node;
                        satisfyTail=node;
                    }
                }else{
                    if(unsatisfyHead==null){
                        unsatisfyHead=node;
                        unsatisfyTail=node;
                    }
                    unsatisfyTail.next=node;
                    unsatisfyTail=node;
                }
            }
        }
        return dh;
    }
}
