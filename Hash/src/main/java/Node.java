public class Node {
    int data;
    Node next;

    Node(int data){
        this.data =data;
        next =null;
    }

    public void printDetails() {
        System.out.print(data + "\t");
    }

}
