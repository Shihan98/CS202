public class Node {
    private int data;
    private Node next,previous;

    Node(int data){
        this.data = data;
        this.previous = null;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public void display(){System.out.println("Number : " + this.data);}
}
