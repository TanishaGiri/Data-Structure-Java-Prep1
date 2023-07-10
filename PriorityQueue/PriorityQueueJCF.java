import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueJCF {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// using Comparator.reverseOrder()--print in decreasing order
        pq.add(4);
        pq.add(5);
        pq.add(7);
        pq.add(3);
        while(!pq.isEmpty()){
            // by default print in increasing order
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
