public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String join = s1 + " " + s2;

        int total = 0;
        for (int i = 0; i < join.length(); i++) {
            total += (int) join.charAt(i);
        }

        System.out.println(join);
        System.out.println(total);
    }
}