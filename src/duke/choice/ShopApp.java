package duke.choice;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer();
        c1.name = "Pinky";
        System.out.println("Hi there " + c1.name);

        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();

        double tax = 0.2;
        double total;

        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";

        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";

        item3.description = "Orange T-Shirt";
        item3.price = 10.5;
        item3.size = "S";

        System.out.println("Item 1" + " " + item1.description + " " + item1.price + " " + item1.size);
        System.out.println("Item 2" + " " + item2.description + " " + item2.price + " " + item2.size);
        System.out.println("Item 3" + " " + item3.description + " " + item3.price + " " + item3.size);

        total = (item1.price + item2.price + item3.price * 2) * 1 + tax;
        System.out.println("Total = " + total);

        c1.size = "S";
        int measurement = 3;

        switch (measurement){
            case 123:
                c1.size = "S";
                break;
            case 456:
                c1.size = "L";
                break;
            case 789:
                c1.size = "M";
                break;
            default:
                c1.size = "X";
        }

        System.out.println(c1.size);
        
    }
}
