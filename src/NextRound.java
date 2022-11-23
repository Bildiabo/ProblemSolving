import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class NextRound {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();         // n is the number of participants
        int k = sc.nextInt();         // k the requirement to qualify to the next round
        int count = 0;
        int [] array = new int[n];
        for (int i =0; i<n; i++) {
            array[i] = sc.nextInt();
            }
        array = Arrays.stream(array).boxed().sorted(Collections.reverseOrder()).
                mapToInt(Integer::intValue).toArray();
        for (int i = 0; i<n;i++){
            if (array[i]!=0 && array[i]>=array[k-1]){
                count++;
            }}
        System.out.println(count);
        }}