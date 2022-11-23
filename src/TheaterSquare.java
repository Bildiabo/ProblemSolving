import java.util.Scanner;
public class TheaterSquare {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
       double n,m,a;
       n = sc.nextDouble();
       m = sc.nextDouble();
       a = sc.nextDouble();
       long length = (long) Math.ceil(m/a);
       long  width = (long) Math.ceil(n/a);
        System.out.println(length*width);
    }}