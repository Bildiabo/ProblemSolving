import java.util.ArrayList;
import java.util.Scanner;

public class Odddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList <Integer> even = new ArrayList<>();
        ArrayList <Integer> odd = new ArrayList<>();
        int n = 4;
        for (int i = 0; i < n; i++) {
            array.add(sc.nextInt());
        }
        for (int i = 0; i<array.size();i++){
            if (array.get(i)%2==0)
                even.add(array.get(i));
            else odd.add(array.get(i));
        }
        if (odd.size()< even.size()){
            System.out.println(odd);
        }else System.out.println(even);



    }
}


