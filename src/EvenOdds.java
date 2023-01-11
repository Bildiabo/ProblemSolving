import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
       int k = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                arrayList.add(i);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                arrayList.add(i);
            }
        }
//        System.out.println(arrayList);
        System.out.println(arrayList.get(k-1));
    }
}
