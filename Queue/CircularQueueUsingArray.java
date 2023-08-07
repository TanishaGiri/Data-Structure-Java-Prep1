public class CircularQueueUsingArray {
    static class CircularQueue{
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        CircularQueue(int n){
            arr = new int[n];
            this .size = n;
        }
        public static boolean isEmpty(){//o(1)
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){ // o(1)
            return (rear +1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is Full");
            }

            if(front == -1){
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];
            if(front == rear){
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }
            return result;
        }

        public static int peek(){
            return arr[front];
        }

        public static void main(String[] args) {
            CircularQueue q = new CircularQueue(5);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }

        }
    }
}
