import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

public class Main {
    public static void solve(Scanner sc){
        Map<Integer,String > map= new TreeMap<>(Comparator.reverseOrder());
        int hussien = sc.nextInt();
        int atef = sc.nextInt();
        int karemo = sc.nextInt();
        int ezzat = sc.nextInt();
        map.put(hussien,"Hussien");
        map.put(atef,"Atef");
        map.put(karemo,"Karemo");
        map.put(ezzat,"Ezzat");
        int a =0;
        for (Map.Entry<Integer,String >entry: map.entrySet()){
            String value = entry.getValue();
            if(a==2)return;
            else {
                System.out.print(value+" ");
                a++;
            }
        }
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            solve(sc);
            System.out.println();
        }
    }
}