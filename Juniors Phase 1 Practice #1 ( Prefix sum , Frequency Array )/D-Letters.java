import javax.imageio.IIOException;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int [] freqSmallLitters(String st){
        int [] freq = new int[26];
        char []  arr = st.toCharArray();
        for (int i=0;i<arr.length;i++){
            if(arr[i]>='a') {
                freq[arr[i] - 'a']++;
            }
        }
        return freq;
    }
    public static int [] freqCapitalLitters(String st){
        int [] freq  = new int[26];
        char [] arr = st.toCharArray();
        for (int i=0;i<arr.length;i++){
            if (arr[i]<'a'&&arr[i]!=' ')freq[arr[i]-'A']++;
        }
        return freq;
    }
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String s = sc.nextLine();
        int [] freq= freqSmallLitters(st);
        int [] freq1=freqCapitalLitters(st);
        boolean result = true;
        char [] arr = s.toCharArray();
        for (int i=0 ; i<arr.length;i++){
            if(arr[i]!=' '&&arr[i]>='a'&&freq[arr[i]-'a']>0){freq[arr[i]-'a']--;}
            else if(arr[i]!=' '&&arr[i]<'a'&&freq1[arr[i]-'A']>0)freq1[arr[i]-'A']--;
            else if(arr[i]!=' ') result = false;

        }
        if (result) System.out.println("YES");
        else System.out.println("NO");


    }
}