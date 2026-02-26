public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            freq.put(val, freq.getOrDefault(val, 0) + 1);
        }
        for (int key : freq.keySet()) {
            System.out.println(key + " - " + freq.get(key) + " times");
        }
    }
}
