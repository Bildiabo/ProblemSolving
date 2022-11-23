import java.util.Scanner;

public class Elephant {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        int f = (int) Math.ceil(x/5);
        System.out.println(f);
    }
}
