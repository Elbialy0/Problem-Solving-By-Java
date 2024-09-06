import java.util.*;
public class Main {
//     public static int [] freq = new int[(int) (1e6+1)];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int r = 0,l=0,m=0;
        char [] arr = str.toCharArray();
        Map<Integer,List<Integer>> map=new HashMap<>();
        int n = arr.length;
        List<Integer>li=new ArrayList<>();
        li.add(l);li.add(r);li.add(m);
        map.put(0,li);
        for (int i=0;i<n;i++){
            if(arr[i]=='/')l++;
            else if(arr[i]=='\\')r++;
            else m++;
            List<Integer>list=new ArrayList<>();
            list.add(l);list.add(r);list.add(m);
            map.put(i+1,list);
        }
        int q =sc.nextInt();
        while (q-->0){
            sc.nextLine();
            int a = sc.nextInt() , b =sc.nextInt();
            l=map.get(b).get(0)-map.get(a-1).get(0);
            r=map.get(b).get(1)-map.get(a-1).get(1);
            m=map.get(b).get(2)-map.get(a-1).get(2);
//            System.out.println(l+" "+r+" "+m);
            int r1 = (int)((-1+Math.sqrt(1+8*m))/2+1);
            int r2 = (int)((-1+Math.sqrt(1+8*l))/2);
            int r3 =  (int)((-1+Math.sqrt(1+8*r))/2);
//            System.out.println(r1);
            if(m==0&&l>=1&&r>=1) System.out.println(1);
            else if(m>0){
                System.out.println(Math.min(Math.min(r1,r2),r3));
            }
            else System.out.println(0);

        }



    }
}
