import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        long answer = 0;

        for (String s : str.split(" ")) {
            answer += Long.parseLong(s);
        }

        System.out.println(answer);
    }
}