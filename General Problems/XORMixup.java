import java.util.Scanner;

public class XORMixup {
    static public void main(String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            in.nextLine();
            int n=in.nextInt();
            int []arr=new int[n];
            in.nextLine();
            for (int i =0 ; i<n ; i++){
                arr[i]=in.nextInt();
            }
            System.out.println(arr[0]);
        }

    }
    
}
