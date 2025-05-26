package test2712;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class UsaStyle {

    static class Convert {
        String converter;
        double factor;

        Convert(String converter, double factor) {
            this.converter = converter;
            this.factor = factor;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Convert> unitMap = new HashMap<>();
        unitMap.put("kg", new Convert("lb", 2.2046));
        unitMap.put("lb", new Convert("kg", 0.4536));
        unitMap.put("l", new Convert("g", 0.2642));
        unitMap.put("g", new Convert("l", 3.7854));

        int caseNo = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            double value = Double.parseDouble(st.nextToken());
            String unit = st.nextToken();

            double total = value * unitMap.get(unit).factor;
            String converted = unitMap.get(unit).converter;
            sb.append(String.format("%.4f %s\n", total, converted));
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
