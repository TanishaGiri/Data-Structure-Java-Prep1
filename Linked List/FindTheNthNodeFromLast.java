public class FindTheNthNodeFromLast {

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
    public static Node deleteNth(int n){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return null;
        }
        int size = 0;
        Node currNode = head;
        while(currNode != null){
            currNode = currNode.next;
            size++;
        }
        Node prev = head;
        int indexToSearch = size - n;
        int i = 0;
        while(i<indexToSearch){
            prev = prev.next;
            i++;
        }
        prev = prev.next.next;
        return head;
    }
    public static void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        FindTheNthNodeFromLast list = new FindTheNthNodeFromLast();
        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);
        printList();
        int n = 3;
        System.out.println( deleteNth(n));
        printList();

    }
}
