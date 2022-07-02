class LinkedList{
  Node head;
  Node tail;
  
  public static LinkedList insertFront(LinkedList list, int data){
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
    return list;
  }
  
  public static LinkedList insertRear(LinkedList list, int data){
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
    
    return list;
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
    LinkedList.insertRear(list,30);
    LinkedList.insertRear(list,89);
    display(list);
  }
}