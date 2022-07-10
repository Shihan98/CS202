public class Queue {
    QueueNode front;
    QueueNode back;

        Queue(){
            this.front = this.back = null;
        }

        boolean isEmpty(){
            if (front == null){
                return true;
            }else {
                return false;
            }
        }

        public void enqueue(TreeNode node){
            QueueNode newNode = new QueueNode(node);

            if (isEmpty()){
                this.front = newNode;
                this.back  = newNode;
            }else {
                this.back.next = newNode;
                this.back = newNode;
            }
        }

        public TreeNode dequeue(){
            if (isEmpty()){
                return null;
            }else {
                QueueNode tem = this.front;
                this.front = tem.next;
                tem.next = null;
                return tem.node;

            }
        }

       public TreeNode peek(){
            if (isEmpty()){
                return null;
            }else {
                return this.front.node;
            }
       }
}
