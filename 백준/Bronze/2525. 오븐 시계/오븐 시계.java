import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int H = Integer.parseInt(str.split(" ")[0]);
        int M = Integer.parseInt(str.split(" ")[1]);
        int requireM = Integer.parseInt(br.readLine());

        int resultH = H;
        int resultM = M + requireM;

        while (resultM >= 60) {
            resultH++;
            resultM -= 60;
        }

        if (resultH >= 24) {
            resultH -= 24;
        }

        System.out.print(resultH + " ");
        System.out.print(resultM);
    }
}