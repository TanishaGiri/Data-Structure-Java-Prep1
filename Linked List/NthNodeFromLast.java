//import java.util.LinkedList;
//public class NthNodeFromLast {
//    public class Node{
//        int data;
//        Node next;
//
//        public Node(int data){
//            this.data = data;
//        }
//    }
//    public static Node nthEndNode(Node head,int n){
//        Node slow = head;
//        Node fast = head;
//
//        for(int i=1; i<=n; i++){
//            fast = fast.next;
//        }
//        //if n is equal to m that is to delete nth node from last, where m is no. of nodes
//        // for deleting we will check fast.next and due to the above condition the below while loop will thorugh the error
//        // so, the below if condition is written.
//
//        // the below while condition is because of finding nth node from last, not for removing it.
//        if(fast == null){
//            head = head.next;
//            return head;
//        }
//        while(fast != null){
//            slow = slow.next;
//            fast = fast.next;
//        }
//
//        slow.next = slow.next.next;// only and only used for deleting m=not for finding.
//
//        return slow;//for finding
//
//        return head;// for deletion
//    }
//    public static void main(String[] args) {
//        LinkedList<Integer> list = new LinkedList<>();
//        Node head = list.add(10);
//        list.add(5);
//        list.add(7);
//        list.add(3);
//        list.add(8);
//
//        for(int i=0; i<list.size(); i++){
//            System.out.print(list.get(i) +" -> ");
//        }
//        System.out.println();
//    }
//}
