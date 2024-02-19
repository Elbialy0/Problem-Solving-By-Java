import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

public class Main {
    public static boolean solve(Scanner sc){
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        long [] freq = new long [n+1];
        for (int i=1;i<=n;i++){
            freq[i]=sc.nextInt();
        }

        while (m-->0){
            sc.nextLine();
            int y = sc.nextInt();
            int x = sc.nextInt();
            int z = sc.nextInt();

            freq[y]-=z;
            freq[x]+=z;

        }
        for (int i=1;i<=n;i++){
            if(freq[i]<0)return false;
        }
        return true;

    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        if (solve(sc)) System.out.println("YES" );
        else System.out.println("NO");

    }
}