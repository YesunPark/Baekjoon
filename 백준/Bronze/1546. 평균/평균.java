import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        int maxSc = -1;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            int score = Integer.parseInt(str.split(" ")[i]);
            if (score > maxSc) {
                maxSc = score;
            }
            sum += score;
        }

        bw.write(String.valueOf((sum / maxSc * 100.0) / N));

        bw.flush();
        bw.close();
    }
}