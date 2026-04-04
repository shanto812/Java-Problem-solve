public class ShelfTester{
public static void main(String [] args){
Shelf shelf = new Shelf();
shelf.showDetails();
System.out.println("1---------------");
shelf.addBooks(3);
System.out.println("2---------------");
shelf.capacity = 7;
shelf.addBooks(3);
System.out.println("3---------------");
shelf.showDetails();
System.out.println("4---------------");
shelf.addBooks(5);
shelf.showDetails();
shelf.capacity += 4;
System.out.println("6---------------");
shelf.addBooks(5);
shelf.showDetails();
}
}


public class Shelf {
    int capacity = 0;
    int books = 0;

    public void showDetails() {
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of books: " + books);
    }

    public void addBooks(int num) {
        if (capacity == 0) {
            System.out.println("Zero capacity. Cannot add books.");
        } else if (books + num > capacity) {
            System.out.println("Exceeds capacity");
        } else {
            books += num;
            System.out.println(num + " books added to shelf");
        }
    }
}