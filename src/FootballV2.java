import java.util.Scanner;

public class FootballV2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        if (x.contains("0000000") || x.contains("1111111")){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
