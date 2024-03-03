import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String[] nm = br.readLine().split(" ");
            int n = Integer.parseInt(nm[0]);
            int m = Integer.parseInt(nm[1]);
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = 0;
            }
            while (m-- > 0) {
                String[] line = br.readLine().split(" ");
                int x = Integer.parseInt(line[0]);
                for (int i = x; i <= n; i+=x) {
                    arr[i-1]=1;
                }
            }
            for (int i = 0; i < n; i++) {
                bw.write(arr[i] + " ");
            }
            bw.write("\n");
        }

        // Flush the output
        bw.flush();

        // Close the BufferedReader and BufferedWriter
        br.close();
        bw.close();
    }
}
