import java.util.Scanner;

public class WayTooLong {
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            String s = sc.next();
            int t = s.length();
            if ( t<= 10){
                System.out.println(s);
            }
            else
                System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(t-1));
        }}}