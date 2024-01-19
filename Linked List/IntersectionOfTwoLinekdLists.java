import com.sun.security.jgss.GSSUtil;

public class IntersectionOfTwoLinekdLists {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node head;
    public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public static void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +"-->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        IntersectionOfTwoLinekdLists list1 = new IntersectionOfTwoLinekdLists();
        list1.add(9);
        list1.add(6);
        list1.add(4);
        list1.add(2);
        list1.add(3);
        list1.add(8);
        IntersectionOfTwoLinekdLists list2 = new IntersectionOfTwoLinekdLists();
        list2.add(1);
        list2.add(2);
        list2.add(8);
        list2.add(6);


    }
}
