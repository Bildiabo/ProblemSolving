import java.util.Scanner;

public class NearlyLuckyNumber {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int c =0;
        for (long i =n;i>0;i=i/10){
            if (i%10==4 || i%10==7){
                c++;
            }
        }
        if (c==4 || c==7){
            System.out.println("Yes");
        }
        else System.out.println("No");

    }
//        int k = new Scanner(System.in).next().replaceAll("[^47]", "").length();
//        System.out.println(k==7||k==4? "YES":"NO");
//   }
}
