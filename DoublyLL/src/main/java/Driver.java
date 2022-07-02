public class Driver {
    public static void main(String[] args) {
        ProductPrime list = new ProductPrime();

        list.insertFront(12);
        list.insertFront(14);
        list.insertFront(17);
        list.insertRear(9);
        list.insertRear(7);
        list.insertRear(3);

        list.displayForward();
        list.displayBackward();
    }
}
