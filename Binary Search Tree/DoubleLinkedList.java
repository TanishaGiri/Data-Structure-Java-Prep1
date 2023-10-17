public class DoubleLinkedList {
    static class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
            this.next = null;
            this.prev = null;
        }

    }
    static Node head = null;
    public static void addFirst(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // when tail node is not mentioned
    public static void addLast(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }
    public static void printList(){
        if(head == null){
            System.out.println("list is empty");
//            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addFirst(5);
        printList();
        list.addLast(7);
        printList();
    }
}
