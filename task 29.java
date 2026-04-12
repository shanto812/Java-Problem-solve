public class Reader_tester {
public static void main(String[] args){
Reader r1 = new Reader();
Reader r2 = new Reader();
System.out.println("1 ==========");
System.out.println(r1.createReader("Messi", 2));
System.out.println(r2.createReader("Ronaldo", 3));
System.out.println("2 ==========");
r1.readerInfo();
System.out.println("3 ==========");
r2.addBook("Java");
r2.addBook("Python");
r2.addBook("C++");
r2.readerInfo();
System.out.println("4 ==========");
r1.addBook("C#");
r1.addBook("Rust");
r1.addBook("GoLang");
System.out.println("5 ==========");
r2.addBook("Python");
System.out.println("6 ==========");
r1.readerInfo();
}
}

public class Reader {
    String name = "New user";
    int capacity = 0;
    String[] books;

    public String createReader(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        books = new String[capacity];
        return "A new reader is created!";
    }

    public void addBook(String bookName) {
        for (int i = 0; i < capacity; i++) {
            if (books[i] == null) {
                books[i] = bookName;
                return;
            }
        }
        System.out.println("No more capacity");
    }

    public void readerInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Books: ");
        boolean empty = true;
        for (int i = 0; i < capacity; i++) {
            if (books[i] != null) {
                System.out.println("Book " + (i + 1) + ": " + books[i]);
                empty = false;
            }
        }
        if (empty) {
            System.out.println("No books added yet");
        }
    }
}
