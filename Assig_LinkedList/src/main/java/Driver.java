public class Driver {
    public static void main(String[] args) {
        ShoppingCart cart1 = new ShoppingCart();

        cart1.insertItem("001","Milk",90.00,10);
        //cart1.insertItem("002","Car",40.00,13);
       // cart1.insertItem("003","Bike",90.00,10);
       //cart1.searchItem("001","Milk");
        cart1.update("001","Milk",20);
        System.out.printf("\n");
        cart1.remove("008","Milk");
    }
}
