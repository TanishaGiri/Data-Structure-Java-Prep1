public class deleteInLinkedList {

    static Node head;// head node declaration
    private  static int size; // to trace the size of the linked list

    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    deleteInLinkedList(){
        this.size = 0;
    }

    // now for deletion of node, firstly we will be adding some node to the linked list

    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // function to delete list node in two different fashion
    public static void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }
    public static void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    // print of list
    public static void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +"-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        deleteInLinkedList list = new deleteInLinkedList();
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        printList();
        list.deleteFirst();
        printList();
        list.deleteLast();
        printList();
        System.out.println(list.getSize());
        list.addFirst(1);
        printList();
        System.out.println(list.getSize());

    }
}
