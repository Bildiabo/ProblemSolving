import java.util.Locale;
import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        var s = sc.next();
        System.out.println(s.substring(0,1).toUpperCase(Locale.ROOT)+s.substring(1));
    }
}
