public class MergeTwoSortedLinkedList {
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

    public static void printList(Node mergeList){
        if(mergeList == null){
            System.out.println("List is Empty");
            return;
        }

        Node currNode = mergeList;
        while(currNode != null){
            System.out.print(currNode.data + "-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public static Node merge(Node head, Node head2){
        if(head2 == null){
            return head;
        }
        if(head == null){
            return head2;
        }

        Node mergeHead; // the head of the merged list
        if(head.data < head2.data){
            mergeHead = head;
            head = head.next;
        }else{
            mergeHead = head2;
            head2 = head2.next;
        }

        Node current = mergeHead; // pointer of current node in the merged list
        while(head != null && head2 != null){
            if(head.data < head2.data){
                current.next = head;
                head = head.next;
            }else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        // if any list remaining nodes, append them to the merged list
        if(head != null){
            current.next = head;
        }
        if(head2 != null){
            current.next = head2;
        }

        return mergeHead;

    }

    public static void main(String[] args) {
        MergeTwoSortedLinkedList list = new MergeTwoSortedLinkedList();
        MergeTwoSortedLinkedList list2 = new MergeTwoSortedLinkedList();
        list.addLast(5);
        list.addLast(10);
        list.addLast(15);
        list.addLast(40);

        list2.addLast(2);
        list2.addLast(3);
        list2.addLast(20);

        Node mergeList = merge(list.head, list2.head);
        printList(mergeList);
    }
}
