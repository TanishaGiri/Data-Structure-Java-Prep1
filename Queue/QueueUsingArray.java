public class QueueUsingArray {
    static class Queue {
        static int[] arr;
        static int size;
        static int rear = -1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;

        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        public static boolean isFull(){
            return rear == arr.length-1;
        }

        public static void add(int data){ // o(1)
            if(isFull()){
                System.out.println("Queue is Full");
            }

            rear++;
            arr[rear] = data;
        }

        public static int peek(){
            return arr[0];
        }
        public static int remove(){//o(n)
            if(isEmpty()){
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        public static void main(String[] args) {
            Queue q = new Queue(5); // object created will have the size of array
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
           while(!q.isEmpty()) {
               System.out.println(q.peek());
               q.remove();
           }

        }
    }
}
