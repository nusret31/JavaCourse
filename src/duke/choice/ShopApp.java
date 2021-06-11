package duke.choice;

import java.util.Arrays;

public class ShopApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Duke Choice Shop!");

        //Customer c1 = new Customer();

        Customer c1 = new Customer("Pinky", 9);

        System.out.println("Hi there " + c1.getName());

        double tax = 0.2;
        double total = 0.0;

        System.out.println("Min price " + Clothing.MIN_PRICE);

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, new Clothing("Green Scarf", 5.0, "S"), new Clothing("Blue TShirt", 10.5, "S")};

//        System.out.println("Item 1" + " " + item1.description + " " + item1.price + " " + item1.size);
//        System.out.println("Item 2" + " " + item2.description + " " + item2.price + " " + item2.size);
//        System.out.println("Item 3" + " " + item3.description + " " + item3.price + " " + item3.size);

        //total = (item1.price + item2.price + item3.price * 2) * 1 + tax;

        int measurement = 3;

        c1.addItems(items);
        c1.setSize(measurement);
        System.out.println("Customer is "+ c1.getName() + "," + c1.getSize() + " " + c1.getTotalClothingCost());

        for(Clothing item: c1.getItems()){
            System.out.println("Item stuff " + item);
        }

        int average = 0;
        int count = 0;

        for(Clothing item : c1.getItems()) {
            if(item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }
        try {
            average = (count == 0) ? 0 : average / count;
            System.out.println("Average price " + average + ", Count " + count);
        } catch (ArithmeticException e){
            System.out.println("Don't divide by 0");
        }

        Arrays.sort(c1.getItems());
        for(Clothing item : c1.getItems()) {
            System.out.println("Item stuff " + item);
        }
    }
}
