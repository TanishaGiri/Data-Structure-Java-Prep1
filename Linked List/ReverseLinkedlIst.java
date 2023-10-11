public class ReverseLinkedlIst {
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
    public static void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void reverse(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            return;
        }
        Node prev = head;
        Node currNode = prev.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prev;

            // update
            prev = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLinkedlIst list = new ReverseLinkedlIst();

        addFirst(4);
        addFirst(3);
        addFirst(2);
        addFirst(1);
        printList();
        // now
        reverse();
        printList();
    }
}
