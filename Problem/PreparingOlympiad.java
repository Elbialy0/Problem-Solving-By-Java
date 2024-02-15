import java.util.Scanner;

public class PreparingOlympiad {
    public static boolean validateWay(int minDiff,int maxDiff,int totalDiff,int nOfProb,int l , int r , int x){
        boolean validate ;
        if(maxDiff-minDiff>=x&&totalDiff>=l&&totalDiff<=r&&nOfProb>=2)validate=true;
        else validate=false;
        return validate;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int r = in.nextInt();
        int x = in.nextInt();
        in.nextLine();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int totalNumbersOfWays = 0;
        for (int i=0;i<(1<<n);i++){
            int problems=0;
            int totalDifficulty=0;
            int minDifficulty= (int) 1e6;
            int maxDifficulty = 0;
            for (int j=0;j<n;j++){
                if(((i>>j)&1)==1){
                    minDifficulty=Math.min(minDifficulty,arr[j]);
                    maxDifficulty=Math.max(maxDifficulty,arr[j]);
                    totalDifficulty+=arr[j];
                    problems++;
                }
            }
            if(validateWay(minDifficulty,maxDifficulty,totalDifficulty,problems,l,r,x))totalNumbersOfWays++;
        }
        System.out.println(totalNumbersOfWays);

    }
}
