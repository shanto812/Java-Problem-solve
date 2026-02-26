public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        int start = Math.min(a, b) + 1;
        int end = Math.max(a, b);
        int totalPrimes = 0;

        for (int i = start; i < end; i++) {
            if (primeCheck(i)) {
                totalPrimes++;
            }
        }

        System.out.println("There are " + totalPrimes + " prime numbers between " + a + " and " + b + ".");
    }

    public static boolean primeCheck(int n) {
        if (n < 2) return false;
        for (int j = 2; j <= n / 2; j++) {
            if (n % j == 0) return false;
        }
        return true;
    }
}
