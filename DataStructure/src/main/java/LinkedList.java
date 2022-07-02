public class LinkedList {
    Node head;
    Node tail;

    public static void insertFront(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next = null;

        if(list.head == null){
            list.head=newNode;
            list.tail=newNode;
        }
        else{
            newNode.next = list.head;
            list.head = newNode;
        }
    }

    public static void insertRear(LinkedList list, int data){
        Node newNode = new Node(data);
        newNode.next=null;

        if(list.head == null){
            list.head=newNode;
            list.tail=newNode;
        }
        else{
            list.tail.next = newNode;
            list.tail = newNode;
        }
    }

    public static Node search(LinkedList list,int data){
        Node current = list.head;
        while (current != null){
            if (current.data==data){
                return current;
            }
            current=current.next;
        }
        return null;
    }

    public static boolean nodeExist(LinkedList list,int data){
        Node current = list.head;
        while (current != null){
            if (current.data==data){
                return true;
            }
            current=current.next;
        }
        return false;
    }

    public static void delete(LinkedList list,int data){
        Node currentNode = list.head;
        Node previousNode = list.head;

        if (nodeExist(list,data)){
            while (currentNode!=null){
                if (currentNode.data ==data){
                    break;
                }
                previousNode = currentNode;
                currentNode = currentNode.next;
            }
            if (currentNode == list.head){
                list.head = currentNode.next;
            }
            else if (currentNode == list.tail){
                 previousNode.next= null;
            }
            else {
                previousNode.next = currentNode.next;
            }
        }
        else {
            System.out.println("does not exist");
        }
    }

    public static void insertNext(LinkedList list, int prevNodeData,int newData){
        Node prevNode = search(list,prevNodeData);

        if (prevNode!=null){
            Node newNode = new Node(newData);
            newNode.next =prevNode.next;
            prevNode.next = newNode;
        }else {
            System.out.println("previous node is not exist ");
        }
    }



    public static void display(LinkedList list){
        Node temp = list.head;
        System.out.print("LinkedList : ");
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        LinkedList list = new LinkedList();

        LinkedList.insertFront(list,22);
        LinkedList.insertFront(list,10);
        LinkedList.insertFront(list,18);
        LinkedList.insertRear(list,30);
        LinkedList.insertRear(list,89);
        Node temNode = LinkedList.search(list,22);
        boolean tem1Node = LinkedList.nodeExist(list,89);
        System.out.println(temNode.data);
        System.out.println(tem1Node);
        display(list);
        LinkedList.delete(list,89);
        LinkedList.insertNext(list,10,36);
        display(list);
    }
}
