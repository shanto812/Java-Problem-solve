public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0, oddCount = 0;
        int small = Integer.MAX_VALUE;
        int big = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            int n = input.nextInt();
            if (n > 0 && n % 2 == 1) {
                total += n;
                oddCount++;
                if (n < small) small = n;
                if (n > big) big = n;
            }
        }

        if (oddCount > 0) {
            System.out.println("Sum = " + total);
            System.out.println("Minimum = " + small);
            System.out.println("Maximum = " + big);
            System.out.println("Average = " + (total * 1.0 / oddCount));
        } else {
            System.out.println("No odd positive numbers found");
        }
    }
}
