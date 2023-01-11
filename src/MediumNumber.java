import java.util.Arrays;
import java.util.Scanner;

public class MediumNumber {
    //    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t > 0) {
//            int[] array = new int[3];
//            array[0] = sc.nextInt();
//            array[1] = sc.nextInt();
//            array[2] = sc.nextInt();
//            Arrays.sort(array);
//            System.out.println(array[1]);
//            t--;
//
//        }
//    }
//}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if ((a > b || a > c) && (a < c || a < b))
                System.out.println(a);
            if ((b > a || b > c) && (b < c || b < a))
                System.out.println(b);
            if ((c > b || c > a) && (c < a || c < b))
                System.out.println(c);
            t--;
        }
    }
}
