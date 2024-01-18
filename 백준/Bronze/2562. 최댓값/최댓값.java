import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;
        int cnt = 0;

        for (int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if (max <= num) {
                max = num;
                cnt = i;
            }
        }

        bw.write(String.valueOf(max) + "\n");
        bw.write(String.valueOf(cnt));

        bw.flush();
        bw.close();
    }
}