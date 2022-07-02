public class ShoppingCart {
    private ItemNode head;
    private ItemNode tail;

   public ShoppingCart(){
        this.head = null;
        this.tail = null;
    }

    public void insertItem(String userID,String itemName,double unitPrice,int quantity){
        ItemNode newItemNode = new ItemNode(userID,itemName,unitPrice,quantity);


        if(this.head==null){
            this.head = newItemNode;
            this.tail = newItemNode;
        }else {
            newItemNode.next = this.head;
            this.head = newItemNode;
        }
    }

    public ItemNode searchItem(String userID,String itemName){
        ItemNode current = this.head;

        while(current != null){
            if(current.getUserID() == userID && current.getItemName() == itemName){
                return current;
            }
            current.next = current;
        }
        return null;
    }
    public void update(String userID, String itemName, int newQuantity){
        ItemNode updateNode = searchItem(userID,itemName);
        if(updateNode!=null){
            updateNode.setQuantity(newQuantity);
            System.out.printf("User Id "+ updateNode.getUserID()+ " Sucessfuly Updated");
        }
        else{
            System.out.printf("Item not found");
        }
    }
   public void remove(String userID,String itemName){
        ItemNode removeItemNode = searchItem(userID,itemName);

        if(removeItemNode != null){
            ItemNode current = this.head;
            ItemNode pre = null;
             while (current!=null){
                 if (current.getUserID() == userID && current.getItemName() == itemName){
                     break;
                 }
                 pre = current;
                 current = current.next;
             }
             if (current.equals(this.head)){
                 this.head = current.next;
                 System.out.printf("head remove");
             }
             else if (current.equals(this.tail)){
                 pre.next = null;
                // System.out.printf("tail remove");
             }
             else {
                 pre.next = current.next;
                // System.out.printf("mid remove");
             }
        }
        else {
            System.out.printf("Item not found...");
        }
    }
}


