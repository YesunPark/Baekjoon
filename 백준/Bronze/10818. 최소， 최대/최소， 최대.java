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

        Long N = Long.parseLong(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Long max = Long.MIN_VALUE;
        Long min = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            Long num = Long.parseLong(st.nextToken());
            if (num >= max) {
                max = num;
            }
            if (num <= min) {
                min = num;
            }
        }

        bw.write(min + " " + max);

        bw.flush();
        bw.close();
    }
}