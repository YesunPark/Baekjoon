import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int sum = 0;

        for (String s : str.split("")) {
            sum += Integer.parseInt(s);
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}