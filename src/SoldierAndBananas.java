import java.util.Scanner;

public class SoldierAndBananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(); // initial cost
        int n = sc.nextInt(); // owned money
        int w = sc.nextInt(); // number of bananas
        int totalCost = 0;
        for (int i = 1; i <= w; i++) {
            totalCost += i * k;
        }
        if (totalCost > n) {
            System.out.println(totalCost - n);
        } else System.out.println(0);
    }
}
