
import java.util.Scanner;

public class AlphabeticRemovals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine();
        String st = sc.nextLine();
        char [ ] arr = st.toCharArray();
        int [] freq = new int[26];
        int remaining = 0 ;
        char charRemaining=' ' ;
        for (char c : arr){
            freq[c-'a']++;
        }
        for (int i=0;i<26;i++){
            if(k>0){
                if(freq[i]<=k){
                    k-=freq[i];
                    freq[i]=0;
                }
                else {
                    remaining=k;
                    charRemaining= (char) ('a'+i);
                    freq[i]-=k;
                    break;
                }
            }
            else break;
        }

        for (char c : arr){
            if(freq[c-'a']!=0){
                if(charRemaining==c&&remaining>0){
                   remaining--;
                }
                else if(freq[c-'a']!=0) System.out.print(c);

            }
        }
    }
}
