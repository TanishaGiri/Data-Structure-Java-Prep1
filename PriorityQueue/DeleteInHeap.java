import java.util.ArrayList;
import java.util.PriorityQueue;

public class DeleteInHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            // insert all last
            arr.add(data);
            // fix heap
            int x = arr.size()-1;
            int par = (x-1)/2;
            while(arr.get(x)<arr.get(par)){
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }
        public int remove(){
            int data = arr.get(0); // assume that i have to remove first node element in the heap

            // swap last anh first element

            int temp = data;
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //heapify call
            heapify(arr, arr.size(), 0);
            return data;
        }
        public void heapify(ArrayList<Integer> arr, int n, int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;
            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
                minIdx = left;
            }
            if(right<arr.size() && arr.get(minIdx)> arr.get(right)){
                minIdx = right;
            }
            while(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
            }
            heapify(arr, n, minIdx);
        }
        public boolean isEmpty(){
            return arr.size() == 0;
        }
        public int peek(){
            return arr.get(0);
        }

        public static void main(String[] args) {
            Heap h = new Heap();
            h.add(3);
            h.add(4);
            h.add(1);
            h.add(5);
            while(!h.isEmpty()){
                System.out.println(h.peek());
                h.remove();
            }
        }
    }
}
