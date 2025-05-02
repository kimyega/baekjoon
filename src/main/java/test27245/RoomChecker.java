package test27245;

import java.io.*;

public class RoomChecker {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       double w = Double.parseDouble(br.readLine());
       double l = Double.parseDouble(br.readLine());
       double h = Double.parseDouble(br.readLine());

       double max = Math.max(l, w);
       double min = Math.min(l, w);
       String s = min / h >= 2 && max / min <= 2 ? "good" : "bad";
       bw.write(s);

       bw.flush();
       bw.close();
       br.close();
    }
}
