import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int n = x.length();
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (count == 7) {
                break;
            }
            if (x.charAt(i - 1) == x.charAt(i)) {
                count++;
            } else {
                count = 1;
            }
        }
        if (count >= 7) {
            System.out.println("YES");
        } else System.out.println("NO");
    }
}
