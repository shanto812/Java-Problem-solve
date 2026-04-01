class ChickenBurger {
    // Instance variables
    String bun;
    int price;
    String sauceOption;
    String spiceLevel;

    // Constructor (default values)
    ChickenBurger() {
        bun = "Sesame";
        price = 200;
        sauceOption = "Less";
        spiceLevel = "Not Set";
    }

    // Method to customize spice level
    void customizeSpiceLevel(String level) {
        if (level.equals("Spicy") || level.equals("Naga")) {
            spiceLevel = level;
            System.out.println("Spice level set to " + spiceLevel + ".");
        } else {
            System.out.println("This spice level is unavailable.");
            spiceLevel = "Spicy";
            System.out.println("Spice level set to Spicy.");
        }
    }

    // Method to serve burger
    String serveBurger() {
        if (spiceLevel.equals("Not Set")) {
            return "Cannot serve now. Customize Spice\nLevel first.";
        } else {
            return "The burger is being served:-\n" +
                   "Bun Type: " + bun + "\n" +
                   "Price: " + price + "\n" +
                   "Sauce Option: " + sauceOption + "\n" +
                   "Spice Level: " + spiceLevel;
        }
    }
}

public class BurgerMaker {
    public static void main(String [] args) {
        ChickenBurger b1 = new ChickenBurger();
        System.out.println(b1.bun);
        System.out.println(b1.price);
        System.out.println(b1.sauceOption);
        System.out.println(b1.spiceLevel);
        System.out.println("----------1----------");
        System.out.println(b1.serveBurger());
        System.out.println("----------2----------");
        b1.customizeSpiceLevel("Extreme Jhaal");
        b1.customizeSpiceLevel("Spicy");
        System.out.println("----------3----------");
        System.out.println(b1.serveBurger());
        System.out.println("----------4----------");
        ChickenBurger b2 = new ChickenBurger();
        b2.bun = "Brioche";
        b2.price += 50;
        b2.sauceOption = "Regular";
        b2.customizeSpiceLevel("Naga");
        System.out.println("----------5----------");
        System.out.println(b2.serveBurger());
    }
}
