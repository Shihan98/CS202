public class Queue {
    QueueNode front;
    QueueNode back;

    Queue(){
        this.front = this.back = null;
    }

    public void enqueue(int data){
        QueueNode newNode = new QueueNode(data);
        if (front == null){
            this.front = newNode;
            this.back =  newNode;
        }else {
            this.back.next = newNode;
            this.back = newNode;
        }
    }

    public void dequeue(){

        if(front == null){
            System.out.printf("Empty !");
        }else {
            QueueNode temp = this.front;
            this.front = this.front.next;
            temp.next =null;

        }
    }

    public void display(){
        QueueNode temp = this.front;

        while (temp != null){
            System.out.print(temp.data + "\t");
            temp = temp.next;
        }
    }
}
