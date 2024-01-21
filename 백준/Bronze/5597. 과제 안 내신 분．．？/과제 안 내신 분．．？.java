import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] numArr = new int[31];

        for (int i = 0; i < 30; i++) {
            numArr[i] = 0;
        }

        for (int i = 0; i < 28; i++) {
            int num = Integer.parseInt(br.readLine());
            numArr[num] = 1;
        }

        for (int i = 1; i < 31; i++) {
            if (numArr[i] == 0) {
                System.out.println(i);
            }
        }

        bw.flush();
        bw.close();
    }
}