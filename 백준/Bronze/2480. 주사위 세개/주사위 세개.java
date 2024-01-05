import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int fir = Integer.parseInt(str.split(" ")[0]);
        int sec = Integer.parseInt(str.split(" ")[1]);
        int thr = Integer.parseInt(str.split(" ")[2]);
        int answer = 0;

        if (fir == sec && fir == thr) {
            answer = 10000 + fir * 1000;
        } else if (fir == sec) {
            answer = 1000 + fir * 100;
        } else if (fir == thr) {
            answer = 1000 + fir * 100;
        } else if (sec == thr) {
            answer = 1000 + sec * 100;
        } else {
            answer = Math.max(Math.max(fir, sec), thr) * 100;
        }

        System.out.print(answer);
    }
}