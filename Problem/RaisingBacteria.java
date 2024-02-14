import java.util.Arrays;
import java.util.Scanner;

public class RaisingBacteria {

    public  static int solve(){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int answer=0;
        for (int i=0;i<32;i++){
            if(((num>>i)&1)==1)answer++;
        }
           return answer;
    }

    public static void main(String[] args) {
        System.out.println(solve());

    }
}
