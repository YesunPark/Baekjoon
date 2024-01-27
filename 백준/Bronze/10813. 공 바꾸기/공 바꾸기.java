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

        int[] numArr = new int[N + 1];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int I = Integer.parseInt(st2.nextToken(" "));
            int J = Integer.parseInt(st2.nextToken(" "));

            int numI = numArr[I];
            numArr[I] = numArr[J];
            numArr[J] = numI;
        }

        for (int i = 1; i < numArr.length; i++) {
            bw.write(numArr[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}