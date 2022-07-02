public class Stack {
    StackNode top;

    Stack(){
        this.top = null;
    }

    boolean isEmpty(){
        if (top== null){
           return true;
        }else {
            return false;
        }
    }
    public void push(int data){
        StackNode newNode = new StackNode(data);
        if (isEmpty()){
            top = newNode;
        }else {
            newNode.setNext(top);
            top = newNode;
        }
    }

    public  void peek(){
        if (isEmpty()){
            System.out.printf("Empty");
        }else {
            System.out.printf("peek : "+top.getData());
        }
    }

    public void pop(){
        if (isEmpty()){
            System.out.printf("Empty");
        }else {
            StackNode temp = top;
            top = top.getNext();
            System.out.printf("pop  : " + temp.getData());
        }
    }

    public void display(){
        StackNode temp = top;

        while (temp!= null){
            System.out.printf(" " + temp.getData());

            temp = temp.getNext();
        }
    }


}
