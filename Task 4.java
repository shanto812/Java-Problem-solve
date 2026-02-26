public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder result = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == 'a') result.append('z');
            else result.append((char)(ch - 1));
        }
        System.out.println(result);
    }
}