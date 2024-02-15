public class BitwiseOperation {
    public  static  int countBits(int num){
        int nOfBits=0;
        for (int i=0;i<32;i++){
            if (((num>>i)&1)==1)nOfBits++;
        }
        return nOfBits;
    }
    public static long convertToDecimal(long num,long base){
        long newNum=0;
        int power=0;
        while (num>0){
            long a = num%10;
            newNum+= (long) (a*Math.pow(base,power++));
            num/=10;
        }
        return newNum;
    }
}
