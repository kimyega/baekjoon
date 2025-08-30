package test32777;

import java.io.*;
import java.util.StringTokenizer;

public class GahyeAndLine2 {

    static class Station {

        int a;
        int b;
        static final int TOTAL = 43;

        Station(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public int internalRotation() {
            return (b - a + TOTAL) % TOTAL;
        }

        public int externalRotation() {
            return (a - b + TOTAL) % TOTAL;
        }

        public String chooseLine() {
            int ir = internalRotation();
            int exr = externalRotation();
            return ir == exr ? "Same" : ir < exr ? "Inner circle line" : "Outer circle line";
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            Station station = new Station(a, b);
            String res = station.chooseLine();
            sb.append(res).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
