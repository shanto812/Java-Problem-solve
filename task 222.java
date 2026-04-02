public class BankAccountTester{
public static void main(String args[]){
BankAccount acc1 = new BankAccount();
System.out.println(acc1.printDetails());
System.out.println("-----1-----");
acc1.setInfo(1456890,"Salary");
System.out.println("-----2-----");
System.out.println(acc1.printDetails());
System.out.println("-----3-----");
BankAccount acc2 = new BankAccount();
acc2.setInfo(1765498,"Student");
System.out.println("-----4-----");
System.out.println(acc2.printDetails());
}
}

public class BankAccount {
    int accountNo = 0;
    String accountType = "Not Set";

    public void setInfo(int no, String type) {
        accountNo = no;
        accountType = type;
        System.out.println("Account information updated!");
    }

    public String printDetails() {
        return "Account No: " + accountNo + "\nType: " + accountType;
    }
}
