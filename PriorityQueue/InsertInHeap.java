import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class InsertInHeap {
    static class Heap{
      ArrayList<Integer> arr = new ArrayList<>();
      public void add(int data){
          // add at last idx
          arr.add(data); // by default last mai add hoga
          // fix heap
          int x = arr.size()-1; // children by default last element is always a child node
          int par = (x-1)/2;    // parent node of the child node
          while(arr.get(x)< arr.get(par)) // ---> o(logn)
          {
              // swap(x, par)
              int temp = arr.get(x);
              arr.set(x, arr.get(par));
              arr.set(par, temp);
              // updation in the value of x  and par
              x = par;
              par = (x-1)/2;
          }

      }
        public static void main(String[] args) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            pq.add(2);
            pq.add(3);
            pq.add(6);
            pq.add(4);
            pq.add(10);
            while(!pq.isEmpty()){
                System.out.println(pq.peek());
                pq.remove();
            }

        }
    }
}
