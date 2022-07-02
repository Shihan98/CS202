public class LinkedList {
    Node head;
    Node tail;

    public void insert(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next =newNode;
            tail = newNode;
        }
    }

    public void remove(int data){
        Node temp = head;
        Node prev = null;

        while (temp != null){
            if (temp.data == data){
                break;
            }else {
                prev = temp;
                temp = temp.next;
            }
        }

        if (temp == head){

            head =temp.next;
            temp.next = null;
            System.out.println(data+" successfully removed");

        }else if (temp == tail){

            prev.next = null;
            tail = prev;
            System.out.println(data+" successfully removed");

        }else {

            prev.next = temp.next;
            temp.next = null;
            System.out.println(data+" successfully removed");
        }

    }

    public void print(){
        Node temp = head;

        while (temp != null){

            temp.printDetails();
            temp = temp.next;

        }
    }
}
