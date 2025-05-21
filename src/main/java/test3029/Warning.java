package test3029;

import java.io.*;
import java.util.StringTokenizer;

public class Warning {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine(), ":");
        int sh = Integer.parseInt(st.nextToken());
        int smi = Integer.parseInt(st.nextToken());
        int ssec = Integer.parseInt(st.nextToken());
        int sToSec = sh * 3600 + smi * 60 + ssec;

        st = new StringTokenizer(br.readLine(), ":");
        int eh = Integer.parseInt(st.nextToken());
        int emi = Integer.parseInt(st.nextToken());
        int esec = Integer.parseInt(st.nextToken());
        int eToSec = eh * 3600 + emi * 60 + esec;

        int fuToSec = 24 * 3600;
        int secDiff = sToSec == eToSec ? fuToSec : sToSec < eToSec ?  eToSec - sToSec : fuToSec - sToSec + eToSec;

        int diffHour = secDiff / 3600;
        int diffMinute = secDiff % 3600 / 60;
        int diffSecond = secDiff % 60;

        bw.write(String.format("%02d:%02d:%02d", diffHour, diffMinute, diffSecond));

        bw.flush();
        bw.close();
        br.close();
    }
}
