import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(
            new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            int A = Integer.parseInt(str.split(" ")[0]);
            int B = Integer.parseInt(str.split(" ")[1]);
            bw.write("Case #" + (i + 1) + ": " + (A + B) + "\n");
        }
        bw.flush();
        bw.close();
    }
}