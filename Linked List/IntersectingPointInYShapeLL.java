public class IntersectingPointInYShapeLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    static Node head;
    static Node head2;
    public static void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static int intersect(Node head, Node head2){
        if(head == null || head2 == null){
            return -1;
        }
        Node currNode1 = head;
        Node currNode2 = head2;

        while(currNode1 != currNode2){// this while loop is used for traversing both the linked list till end
            currNode1 = (currNode1 == null) ? head2 : currNode1.next;
            currNode2 = (currNode2 == null) ? head : currNode2.next;
        }

        return (currNode1 != null && currNode2 != null) ? currNode1.data : -1;
    }

    public static void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        while(curr.next != null){
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        IntersectingPointInYShapeLL list = new IntersectingPointInYShapeLL();
        IntersectingPointInYShapeLL list2 = new IntersectingPointInYShapeLL();

        list.addFirst(9);
        list.addFirst(8);
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);

        list2.addFirst(6);
        list2.addFirst(5);
        list2.addFirst(4);
        list2.addFirst(10);

        printList();

        System.out.println(intersect(head, head2));

    }
}
