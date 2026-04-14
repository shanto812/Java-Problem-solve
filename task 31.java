public class ToyTester{
public static void main(String[] args){
Toy t1 = new Toy("Car", 230);
System.out.println("1=================");
t1.updatePrice(250);
System.out.println("2=================");
System.out.println(t1.name);
t1.showPrice();
System.out.println("3=================");
Toy t2 = new Toy("Robot", 450);
System.out.println("4=================");
t2.updateName("Autobot");
System.out.println("5=================");
System.out.println(t2.name);
t2.showPrice();
}
}
public class Toy {
    String name;
    int price;

    public Toy(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("A new toy has been made!");
    }

    public void updatePrice(int newPrice) {
        this.price = newPrice;
    }

    public void updateName(String newName) {
        System.out.println("Changing old name: " + this.name);
        System.out.println("new name: " + newName);
        this.name = newName;
    }

    public void showPrice() {
        System.out.println("price: " + price + " Taka");
    }
}