import java.util.Locale;
import java.util.Scanner;

public class Word {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String word =sc.next();
        int L = word.length();
        int isUpper=0;
        int isLower=0;
        for (int i=0; i<L; i++){
            if (Character.isUpperCase(word.charAt(i))){
                isUpper++;
            }
            if (Character.isLowerCase(word.charAt(i))){
                isLower++;
            }
        }
        if (isLower>=isUpper){
            System.out.println(word.toLowerCase(Locale.ROOT));
        }
        else System.out.println(word.toUpperCase());
    }
}
