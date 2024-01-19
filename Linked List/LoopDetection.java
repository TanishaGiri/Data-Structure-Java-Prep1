public class LoopDetection {
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
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public static boolean detectLoop(Node head){
        if(head == null || head.next == null){
            return false;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while(current.next!= null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        LoopDetection list = new LoopDetection();
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);
        list.addLast(7);

        printList();

        System.out.println(detectLoop(head));
    }
}
