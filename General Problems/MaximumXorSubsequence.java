import java.util.Scanner;

public class MaximumXorSubsequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            input.nextLine();
            int n = input.nextInt();
            int k = input.nextInt();
            int [] arr = new int[n];
            input.nextLine();
            for (int i=0;i<n ; i++){
                arr[i]=input.nextInt();
            }
            int res=0;
            for (int i=0;i<(1<<n);i++){
                int ans = 0;
                int c=0;
                for (int j=0;j<n;j++){
                    if(((i>>j)&1)==1){
                        ans^=arr[j];
                        c++;
                    }
                    if(c==k)break;
                }
                if(c==k) {
                    res = Math.max(res, ans);
                }
            }
            System.out.println(res);
        }


    }
}
