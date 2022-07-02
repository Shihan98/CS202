public class ProductPrime {
    private Node head;
    private Node tail;

    ProductPrime(){
        this.head = null;
        this.tail = null;
    }

    public void insertFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
            newNode.setPrevious(null);
        }
    }

    public void insertRear(int data){
        Node newNode = new Node(data);

        if(head == null){
           head = newNode;
           tail = newNode;
        }
        else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;

        }
    }

    public Node search(int data){
        Node temp =  head;

        while(temp!= null){
            if (temp.getData()== data){
                break;
            }
            else{
                temp = temp.getNext();
            }
        }
        return temp;
    }

    public void delete(int data){
        Node current = search(data);

        if(current == null){
            System.out.printf("Node not found");
        }
        else{
            if (current == head){
                head.getNext().setPrevious(null);
                head = head.getNext();
                current.setNext(null);
            }
            else if (current == tail){
                tail = tail.getPrevious();
                tail.setNext(null);
                current.setPrevious(null);
            }
            else {
              current.getPrevious().setNext(current.getNext());
              current.getNext().setPrevious(current.getPrevious());
              current.setPrevious(null);
              current.setNext(null);
            }

        }
    }
     public void displayForward(){
        Node temp  = head;
        if (temp == null){
            System.out.printf("Empty List");
            return;
        }
        while (temp != null){
            temp.display();
            temp = temp.getNext();
        }
     }

    public void displayBackward(){
        Node temp  = tail;
        if (temp == null){
            System.out.printf("Empty List");
            return;
        }
        while (temp != null){
            temp.display();
            temp = temp.getPrevious();
        }
    }

}
