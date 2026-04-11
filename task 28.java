public class CartTester{
public static void main(String [] args){
Cart c1 = new Cart ();
Cart c2 = new Cart ();
Cart c3 = new Cart ();
c1.create_cart(1);
c2.create_cart(2);
c3.create_cart(3);
System.out.println("====1====");
c1.addItem("Table", 3900.5);
c1.addItem("Chair", 1400.76);
c1.addItem(5400.87, "Television");
c1.addItem(5000.0, "Refrigerator");
System.out.println("====2====");
c2.addItem("Stove",439.90);
System.out.println("====3====");
c3.addItem("Chair",1400.5);
c3.addItem(3400.0, "Chair");
System.out.println("====4====");
c1.cartDetails();
System.out.println("====5====");
c2.cartDetails();
System.out.println("====6====");
c3.cartDetails();
c1.giveDiscount(10);
System.out.println("====7====");
c1.cartDetails();
}
}

public class Cart {
    int cartNumber;
    String[] items = new String[3];
    double[] prices = new double[3];
    int itemCount = 0;
    double discount = 0.0;

    public void create_cart(int number) {
        cartNumber = number;
    }

    public void addItem(String item, double price) {
        if (itemCount < 3) {
            items[itemCount] = item;
            prices[itemCount] = price;
            itemCount++;
            System.out.println(item + " added to cart " + cartNumber + ".");
            System.out.println("You have " + itemCount + " item(s) in your cart now.");
        } else {
            System.out.println("You already have 3 items on your cart");
        }
    }

    public void addItem(double price, String item) {
        addItem(item, price);
    }

    public void cartDetails() {
        System.out.println("Your cart(c" + cartNumber + ") : ");
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i] + " - " + prices[i]);
            total += prices[i];
        }
        total = total - (total * discount / 100);
        System.out.println("Discount Applied: " + discount + "%");
        System.out.println("Total price: " + total);
    }

    public void giveDiscount(double percent) {
        discount = percent;
    }
}