import java.util.Scanner;

public class Advantageeeeee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int[] participants = new int[n];
            int largest = 0;
            int secondLargest = 0;
            for (int i = 0; i < n; i++) {
                participants[i] = sc.nextInt();
                if (participants[i] >= largest) {
                    secondLargest = largest;
                    largest = participants[i];
                } else {
                    if (participants[i] > secondLargest && participants[i] < largest)
                        secondLargest = participants[i];
                }
            }
            for (int i : participants) {
                if (i == largest)
                    System.out.print(i - secondLargest + " ");
                else
                    System.out.print(i - largest + " ");
            }
            System.out.println();
            t--;
        }
    }
}