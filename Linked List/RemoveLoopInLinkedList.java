public class RemoveLoopInLinkedList {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = next;
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
    public static boolean findLoop(){
        if(head == null || head.next == null){
            return false;
        }
        Node slow = head;
        Node fast = head;
        Node prevNode = null;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }
        if(slow == fast){
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
                prevNode = prevNode.next;
            }
            if(prevNode == null){
                while(fast.next != null){
                    fast = fast.next;
                }
                fast.next = null;
            }else{
                prevNode.next = null;
            }
        }
        return true;
    }
    public static void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while(current != null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        RemoveLoopInLinkedList list = new RemoveLoopInLinkedList();
        list.addFirst(9);
        list.addFirst(8);
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(9);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        printList();
        System.out.println(findLoop());
    }
}
