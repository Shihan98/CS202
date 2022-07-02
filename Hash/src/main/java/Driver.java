public class Driver {
    public static void main(String[] args) {
        HashTable hh = new HashTable();

        hh.insertHash(10);
        hh.insertHash(22);
        hh.insertHash(6);
        hh.insertHash(1);
        hh.insertHash(3);
        hh.insertHash(13);
        hh.insertHash(11);
        hh.insertHash(12);
        hh.insertHash(14);
        hh.insertHash(24);
        hh.insertHash(36);

        hh.print();
        hh.searchHash(10);
        System.out.printf("\n");
        hh.removeHash(22);

        hh.print();
    }
}
