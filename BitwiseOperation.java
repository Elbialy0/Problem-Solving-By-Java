public class BitwiseOperation {
    public  static  int countBits(int num){
        int nOfBits=0;
        for (int i=0;i<32;i++){
            if (((num>>i)&1)==1)nOfBits++;
        }
        return nOfBits;
    }
}
