package test11795;

import java.io.*;
import java.util.StringTokenizer;

public class DonationPackaging {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int setA = 0, setB = 0, setC= 0;

        int days = Integer.parseInt(br.readLine());

        while (days-- > 0) {
            st = new StringTokenizer(br.readLine());
            setA += Integer.parseInt(st.nextToken());
            setB += Integer.parseInt(st.nextToken());
            setC += Integer.parseInt(st.nextToken());

            int min = Math.min(setA, Math.min(setB, setC));
            if (min < 30) sb.append("NO");
            else {
                setA -= min;
                setB -= min;
                setC -= min;
                sb.append(min);
            }

            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
