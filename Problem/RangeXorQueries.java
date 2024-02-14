import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class RangeXorQueries {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int q = Integer.parseInt(tokenizer.nextToken());
        int[] arr = new int[n + 1];

        tokenizer = new StringTokenizer(reader.readLine());
        arr[0] = 0;

        for (int i = 1; i < n + 1; i++) {
            int a = Integer.parseInt(tokenizer.nextToken());
            arr[i] = arr[i - 1] ^ a;
        }
        while (q-- > 0) {
            tokenizer = new StringTokenizer(reader.readLine());
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            writer.write(Integer.toString(arr[b] ^ arr[a - 1]));
            writer.newLine();
        }

        writer.flush();
    }
}
