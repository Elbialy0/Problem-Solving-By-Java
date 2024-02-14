import java.io.IOException;
import java.util.Scanner;

public class XORwice {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int tests = input.nextInt();
        while (tests-->0){
            input.nextLine();
            int a = input.nextInt();
            int b = input.nextInt();
            System.out.println((a^Math.max(a,b))+(b^Math.max(a,b)));
        }


    }
}
