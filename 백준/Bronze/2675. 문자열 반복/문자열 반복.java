import java.io.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String in = br.readLine();
            int num = Integer.parseInt(in.split(" ")[0]);
            String str = in.split(" ")[1];

            for (String s : str.split("")) {
                for (int j = 0; j < num; j++) {
                    bw.write(s);
                }
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }
}