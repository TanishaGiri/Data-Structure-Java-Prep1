public class addInLinkedList {

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head; // to traverse the linked List
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode; // the required node is added
    }
    public static void printList(){// for printing the linkedlist
        if(head == null){
            System.out.println("Linked List is empty");
        }
        Node currNode = head; // to traverse the linkedList
        while(currNode != null){
            System.out.print(currNode.data +" -->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }
    public static void main(String[] args) {
        addInLinkedList list = new addInLinkedList();
        list.addFirst(2);
        list.addFirst(1);
        printList();
    }
}
