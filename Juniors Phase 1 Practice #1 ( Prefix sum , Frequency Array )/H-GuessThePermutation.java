import javax.imageio.IIOException;
import java.io.*;
import java.util.*;


public class Main {
    public static int find(int n,Scanner sc){
        int []freq=new int[n];
        int maxOccurence=0;
        Arrays.fill(freq,0);
        for (int i=0;i<n;i++){
            int a = sc.nextInt();
            freq[a]++;
            maxOccurence=Math.max(freq[a],maxOccurence);
        }
        return n-maxOccurence;
    }

    public static int [] solve(Scanner sc){
        int n = sc.nextInt();
        int [] arr = new int[n];
        int []freq=new int[n];
        for (int i=0;i<n;i++){
            sc.nextLine();
            arr[i]=find(n,sc);
            freq[arr[i]]++;
        }
        for (int i =0 ;i<n-1;i++){
            if(freq[arr[i]]==2){
                arr[i]+=1;
                break;
            }
        }
        return arr;

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int []arr = solve(sc);
        for (int i : arr) System.out.print(i+" ");





    }
}