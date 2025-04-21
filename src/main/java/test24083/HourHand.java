package test24083;

import java.io.*;

public class HourHand {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int currHour = Integer.parseInt(br.readLine());
        int hour = Integer.parseInt(br.readLine());

        int res = (currHour + hour) % 12 == 0 ? 12 : (currHour + hour) % 12;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
