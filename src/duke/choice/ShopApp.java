package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer();
        c1.setName("Pinky");
        c1.setSize("S");
        System.out.println("Hi there " + c1.getName());

        double tax = 0.2;
        double total = 0.0;

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();

        Clothing[] items = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        items[2].setDescription("Green Scarf");
        items[2].setPrice(5.0);
        items[2].setSize("S");

        items[3].setDescription("Blue TShirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");


//        System.out.println("Item 1" + " " + item1.description + " " + item1.price + " " + item1.size);
//        System.out.println("Item 2" + " " + item2.description + " " + item2.price + " " + item2.size);
//        System.out.println("Item 3" + " " + item3.description + " " + item3.price + " " + item3.size);

        //total = (item1.price + item2.price + item3.price * 2) * 1 + tax;

        int measurement = 3;
        c1.addItems(items);
        c1.setSize(measurement);
        System.out.println("Customer is "+ c1.getName() + "," + c1.getSize() + " " + c1.getTotalClothingCost());

        for(Clothing item: c1.getItems()){
            System.out.println("Items " + item.getDescription());
        }
    }
}
