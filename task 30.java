public class StudentTester{
public static void main(String[] args){
Student s1 = new Student("Harry", "CSE");
System.out.println(s1.name);
s1.updateName("Harry Potter");
System.out.println(s1.name);
System.out.println(s1.prog);
s1.updateProgram("CS");
String var = s1.accessProgram();
System.out.println(var);
}
}

public class Student {
    String name;
    String prog;

    public Student(String name, String prog) {
        this.name = name;
        this.prog = prog;
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public void updateProgram(String newProg) {
        this.prog = newProg;
    }

    public String accessProgram() {
        return prog;
    }
}