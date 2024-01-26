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

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken(" "));
        int M = Integer.parseInt(st.nextToken(" "));

        int[] numArr = new int[N];

        for (int i = 1; i <= M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st2.nextToken(" "));
            int J = Integer.parseInt(st2.nextToken(" "));
            int K = Integer.parseInt(st2.nextToken(" "));

            for (int j = I - 1; j <= J - 1; j++) {
                numArr[j] = K;
            }
        }

        for (int i = 0; i < numArr.length; i++) {
            bw.write(numArr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}