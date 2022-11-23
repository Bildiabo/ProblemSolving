import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = 0;
        while (a <= b) {
            a*=3;
            b = b * 2;
            n++;
        }
        System.out.println(n);
    }
}
