import javax.imageio.IIOException;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int [] freq = new int[n+1];
        // make all elements in the array equal zero
        Arrays.fill(freq,0);
        int result =0;
        int socksOnTheTable =0 ;
        for (int i=0; i<2*n;i++){
            int a = sc.nextInt();
            if(freq[a]==0) {
                socksOnTheTable++;
                freq[a]++;
            }

            else {
                freq[a]=0;
//                System.out.println(socksOnTheTable);
                result=Math.max(result,socksOnTheTable);
                socksOnTheTable--;
            }


        }
        System.out.println(result);








    }
}