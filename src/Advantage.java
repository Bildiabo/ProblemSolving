/*
  number of participants is n
  first participant is i with strength of Si
  j is the strongest participant with Sj
  1st - t is number of test cases
  2nd - n is the length of an array
  3rd - ns is the strength of the participants inside the array
  required - output the difference between each participant and the strongest of them
  largest
  */

import java.util.Arrays;
import java.util.Scanner;

public class Advantage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int largest = 0;
            int arrayLength = sc.nextInt();
            int[] result = new int[arrayLength];
            int[] participants = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                participants[i] = sc.nextInt();
                if (participants[i] > largest) {
                    largest = participants[i];
                }

            }
            int[] nee = Arrays.copyOf(participants, participants.length);
            Arrays.sort(participants);
            for (int j = 0; j < arrayLength; j++) {
                if (nee[j] == largest) {
                    result[j] = largest - participants[arrayLength - 2];
                } else result[j] = nee[j] - largest;

            }
            System.out.println(Arrays.toString(result).replaceAll("\\[|\\]|,", ""));
            t--;
        }


    }
}
