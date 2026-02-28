public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int minIdx = 0, maxIdx = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > arr[maxIdx]) maxIdx = i;
            if (arr[i] < arr[minIdx]) minIdx = i;
        }
        System.out.println("The largest number " + arr[maxIdx] + " was found at location " + maxIdx + ".");
        System.out.println("The smallest number " + arr[minIdx] + " was found at location " + minIdx + ".");
    }
}