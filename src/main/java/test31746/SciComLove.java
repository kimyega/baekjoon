package test31746;

import java.io.*;

public class SciComLove {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] sci = {"SciComLove", "evoLmoCicS"};
        int n = Integer.parseInt(br.readLine());

        String res = sci[n % 2];
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
