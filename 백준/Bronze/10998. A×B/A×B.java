import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strArr = str.split(" ");

        System.out.println(Integer.parseInt(strArr[0]) * Integer.parseInt(strArr[1]));
    }
}