public class Driver {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(9);
        q.enqueue(4);
        q.enqueue(1);
        q.display();
        q.dequeue();
        System.out.printf("\n");
        q.display();
    }
}
