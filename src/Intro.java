public class Intro {
    public static class Node{
        Object elem;
        Node next;

        Node(Object elem){
            this.elem=elem;
        }
    }
    public static void main(String[] args) {
        Node n1=new Node("Hello");
        Node n2=new Node(324);
        Node n3=new Node(8.97);
        Node n4=new Node("Python");
        Node n5=new Node("Java");
        n1.next=n5;
        n4.next=n5;
        n5.next=n2;
        n2.next=n3;
        n3.next=n1;

        System.out.println( n1 );
        System.out.println( n3.next );
        System.out.println( n3.next.elem );
        Node x = n4.next;
        System.out.println( (String)n1.elem + x.elem );
        x.next = n3;
        System.out.println((String)n2.next.next.elem + (Double)n5.next.elem);
        n5 = null;
        System.out.println( n4.next.elem );
        x.next.next = null;
        n3.elem = 321;
        n4.next.elem = 532;
        System.out.println(n4.next.elem);


    }
}
