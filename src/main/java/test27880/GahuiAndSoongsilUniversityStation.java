package test27880;

import java.io.*;
import java.util.StringTokenizer;

public class GahuiAndSoongsilUniversityStation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        String line = "";

        while ((line = br.readLine()) != null ){
            StringTokenizer st = new StringTokenizer(line);
            String pf = st.nextToken();
            int n = Integer.parseInt(st.nextToken());

            if (pf.equals("Es")) {
                sum += n * 21;
            } else {
                sum += n * 17;
            }
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
