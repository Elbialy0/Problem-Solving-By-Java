import javax.imageio.IIOException;
import java.io.*;
import java.util.*;


public class Main {



    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long [] arr = new long[n+1];
        long [] pre1 = new long[n+1];
        sc.nextLine();
        pre1[0]=0;
        arr[0]=0;
        for (int i=0;i<n;i++){
            arr[i+1]=sc.nextInt();
            pre1[i+1]=arr[i+1]+pre1[i];
        }
        Arrays.sort(arr);
        for (int i=1;i<=n;i++){
            arr[i]+=arr[i-1];
        }
        sc.nextLine();
        int q = sc.nextInt();
        while (q-->0){
            int t = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            sc.nextLine();
            if (t==1){
                System.out.println(pre1[r]-pre1[l-1]);
            }
            else {
                System.out.println(arr[r]-arr[l-1]);
            }
        }
    }
}