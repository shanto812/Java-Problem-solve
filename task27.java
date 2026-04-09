public class TaxiTester{
public static void main(String[] args) {
TaxiLagbe taxi1 = new TaxiLagbe();
taxi1.storeInfo("1010-01", "Dhaka");
System.out.println("1-------------");
taxi1.printDetails();
System.out.println("2-------------");
taxi1.addPassenger("Wilson", 105);
System.out.println("3-------------");
taxi1.printDetails();
System.out.println("4-------------");
taxi1.addPassenger("Walker", 100, "Wood", 200);
System.out.println("5-------------");
taxi1.printDetails();
System.out.println("6-------------");
taxi1.addPassenger("Karen", 200);
taxi1.addPassenger("Donald", 130);
System.out.println("7-------------");
taxi1.printDetails();
System.out.println("8-------------");
TaxiLagbe taxi2 = new TaxiLagbe();
taxi2.storeInfo("1010-02", "Khulna");
taxi2.addPassenger("Don", 115, "Parker", 215);
System.out.println("9-------------");
taxi2.printDetails();
}

public class TaxiLagbe {
    String taxiNo;
    String area;
    ArrayList<String> passengers = new ArrayList<>();
    int fare = 0;

    public void storeInfo(String no, String area) {
        taxiNo = no;
        this.area = area;
    }

    public void addPassenger(String name, int fare) {
        if (passengers.size() >= 4) {
            System.out.println("Taxi Full! No more passengers can be added");
            return;
        }
        passengers.add(name);
        this.fare += fare;
        System.out.println("Dear " + name + "! Welcome to TaxiLagbe");
    }

    public void addPassenger(String name1, int fare1, String name2, int fare2) {
        addPassenger(name1, fare1);
        addPassenger(name2, fare2);
    }

    public void printDetails() {
        System.out.println("Taxi number: " + taxiNo);
        System.out.println("This taxi can cover " + area + " area");
        System.out.println("Total Passenger: " + passengers.size());
        System.out.print("Passenger Lists: \n");
        for (String p : passengers) {
            System.out.print(p + " ");
        }
        System.out.println("\nTotal collected fare: " + fare + " Taka");
    }
}
