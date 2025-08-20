package test6903;

import java.io.*;

public class Trident {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int s = Integer.parseInt(br.readLine());
        int h = Integer.parseInt(br.readLine());

        String st = "*";
        String sp = " ";

        StringBuilder sb = new StringBuilder();

        String startLine = st + sp.repeat(s) + st + sp.repeat(s) + st + "\n";
        String start = startLine.repeat(t);

        String mid = st.repeat(s * 2 + 3) + "\n";

        String endLine = sp.repeat(s + 1) + st + "\n";
        String end = endLine.repeat(h);

        sb.append(start).append(mid).append(end);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
