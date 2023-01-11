import java.util.Scanner;

public class AtillaFavoriteProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String alp = "abcdefghijklmnopqrstuvwxyz";
        while (t > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            int [] needed = new int[n];
            int largest=(alp.indexOf(s.charAt(0)))+1;
            for (int i =1; i<n; i++){
                needed[i]=(alp.indexOf(s.charAt(i)))+1;
                if(needed[i] > largest)
                    largest = needed[i];
            }
            System.out.println(largest);
            t--;
        }
    }
}
