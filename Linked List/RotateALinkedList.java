public class RotateALinkedList {
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
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void rotateList(int k){
        if(head == null || head.next == null || k == 0){
            return;
        }

        int length = 1;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }

        if(k > length){
            return;
        }

        Node prevNode = null;
        Node currNode = head;

        for(int i=0; i<k; i++){
            prevNode = currNode;
            currNode = currNode.next;
        }

        // rotate the linked list
        temp.next = head;
        head = currNode;
        prevNode.next = null;
    }
    public static void main(String[] args) {
        RotateALinkedList list = new RotateALinkedList();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        int k = 3;

        System.out.println("Regular list:" + " ");
        printList();
        rotateList(k);
        System.out.println("Rotated list:" + " ");
        printList();



    }

}
