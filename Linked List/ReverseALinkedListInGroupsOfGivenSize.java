//import java.util.LinkedList;
//public class ReverseALinkedListInGroupsOfGivenSize {
//    static class Node{
//        int data;
//        Node next;
//        public Node(int data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//    static Node head;
//    public static Node rotateGroup(Node head, int k){
//        if(head == null || head.next == null || k <= 1){
//            return head;
//        }
//
//        int length = 0;
//        Node temp = head;
//        while(temp != null){
//            temp = temp.next;
//            length++;
//        }
//
//        if(k > length){
//            return null;
//        }
//
//        Node prevGroupEnd = null;
//        Node currGroupStart = head;
//
//        for(int i=0; i<length/k; i++){
//            Node prev = null;
//            Node curr = currGroupStart;
//            Node next = null;
//
//            for(int j=0; j<k; j++){
//                next = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = next;
//            }
//
//            if(prevGroupEnd == null){
//                head = prev;
//            }else{
//                prevGroupEnd.next = prev;
//            }
//
//            currGroupStart.next = curr;
//            prevGroupEnd = currGroupStart;
//            currGroupStart = curr;
//
//        }
//
//        return head;
//    }
//
//    public static void printList(){
//        if(head == null){
//            System.out.println("List is empty");
//            return;
//        }
//
//        Node currNode = head;
//        while(currNode != null){
//            System.out.print(currNode.data + "-->");
//            currNode = currNode.next;
//        }
//        System.out.println("NULL");
//    }
//    public static void main(String[] args) {
//        ReverseALinkedListInGroupsOfGivenSize list = new ReverseALinkedListInGroupsOfGivenSize();
//        list.head = new Node('a');
//        list.head.next = new Node('b');
//        list.head.next.next = new Node('c');
//        list.head.next.next.next = new Node('d');
//
//        int k = 2;
//        System.out.println("Real list:");
//        printList();
//        rotateGroup(head, k);
//        System.out.println("List after reverse in group:");
//        printList();
//    }
//}

public class ReverseALinkedListInGroupsOfGivenSize {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head;

    public static Node reverseGroup(Node head, int k) {
        if (head == null || head.next == null || k <= 1) {
            return head;
        }

        int length = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            length++;
        }

        if (k > length) {
            return head;
        }

        Node prevGroupEnd = null;
        Node currGroupStart = head;

        for (int i = 0; i < length / k; i++) {
            Node prev = null;
            Node curr = currGroupStart;//linked list(small) ko join karegi
            Node next = null;

            for (int j = 0; j < k; j++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            if (prevGroupEnd == null) {
                head = prev;
            } else {
                prevGroupEnd.next = prev;
            }

            currGroupStart.next = curr;
            prevGroupEnd = currGroupStart;
            currGroupStart = curr;
        }

        return head;
    }

    public static void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ReverseALinkedListInGroupsOfGivenSize list = new ReverseALinkedListInGroupsOfGivenSize();
        list.head = new Node('a');
        list.head.next = new Node('b');
        list.head.next.next = new Node('c');
        list.head.next.next.next = new Node('d');

        int k = 2;
        System.out.println("Original list:");
        printList();

        head = reverseGroup(head, k);

        System.out.println("List after reverse in groups of " + k + ":");
        printList();
    }
}
