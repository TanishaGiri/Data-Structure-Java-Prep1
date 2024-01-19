public class FindMiddleElementInALinkedList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;

    public static void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public static void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){// not used currNode.next cause last node print nhi hoga to fir
            System.out.print(currNode.data+" --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void findMiddle(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element: " + slow.data);
    }
    public static void main(String[] args) {
        FindMiddleElementInALinkedList list = new FindMiddleElementInALinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println("Original Linked List:");
        list.printList();
        list.findMiddle();
    }
}
