import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num % 42;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }

        bw.write(String.valueOf(list.size()));

        bw.flush();
        bw.close();
    }
}