public class HashTable {

    LinkedList indexes[] = new LinkedList[5];

    public int hashCode(int data){

        return data%indexes.length;
    }

    public void insertHash(int data){
        int index = hashCode(data);

        if (indexes[index]==null){
            LinkedList list = new LinkedList();
            list.insert(data);
            indexes[index]=list;
        }else {
            LinkedList temp = indexes[index];
            temp.insert(data);
        }
    }

    public void removeHash(int data){
        int index = hashCode(data);

        if (indexes[index]==null){
            System.out.printf("Item not found");
        }else {
            LinkedList temp = indexes[index];
            temp.remove(data);
        }
    }

    public void searchHash(int data){
        int index = hashCode(data);

        if (indexes[index]==null){
            System.out.printf("Item not found");
        }else {
            LinkedList list = indexes[index];
            Node temp = list.head;

            while (temp != null){
                if (temp.data == data){
                    System.out.printf("Found " + data);
                    return;
                }
                temp =  temp.next;
            }
            System.out.printf(" Item Not found");
        }
    }

    public void print(){
        for (LinkedList i : indexes){
            if (i != null){
                i.print();
                System.out.printf("\n");
            }
        }
    }
}
