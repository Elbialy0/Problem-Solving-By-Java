import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

public class Main {
    public static void solve(Scanner sc){
        int n = sc.nextInt();
        int [] arr = new int[n];
        sc.nextLine();
        for (int i =0 ; i<n ;i++){
            arr[i] = sc.nextInt();
        }
        sc.nextLine();
        int q = sc.nextInt();
        int []freq= new int[n+1];
        Arrays.fill(freq,0);
        while (q-->0){
            sc.nextLine();
            int l = sc.nextInt();
            int r = sc.nextInt();
            freq[l-1]++;
            freq[r]--;
        }
        for (int i=1;i<n;i++){
            freq[i]+=freq[i-1];
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int size =0;
        for (int i=0;i<n;i++){
            if (freq[i]==0){
                size++;
                arrayList.add(arr[i]);
            }
        }
        System.out.println(size);
        for (int a : arrayList){
            System.out.print(a+ " ");
        }
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        solve(sc);

    }
}