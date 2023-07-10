import java.util.Comparator;
import java.util.PriorityQueue;
//import java.util.Comparable;
public class PriorityQueueObject implements Comparable<PriorityQueueObject>{
    String name;
    int rank;
    public PriorityQueueObject(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    @Override
    public int compareTo(PriorityQueueObject p){
        return this.rank - p.rank;
    }
    public static void main(String[] args) {
        PriorityQueue<PriorityQueueObject> pq = new PriorityQueue<>();
        pq.add(new PriorityQueueObject("A", 5));
        pq.add(new PriorityQueueObject("B", 6));
        pq.add(new PriorityQueueObject("E", 7));
        pq.add(new PriorityQueueObject("C", 10));
        pq.add(new PriorityQueueObject("F", 9));

        while (!pq.isEmpty()) {

            System.out.println(pq.peek().name + "-->" +pq.peek().rank);
            pq.remove();
        }


    }
}
