public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean found = false;
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int target = sc.nextInt();

        System.out.println("Input array: ");
        for (int num : arr) System.out.print(num + " ");
        System.out.println();

        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num != target) result.add(num);
            else found = true;
        }

        if (found) {
            System.out.println("New array:");
            for (int val : result) System.out.print(val + " ");
        } else {
            System.out.println("Element not found");
        }
    }
}

