package test4766;

import java.io.*;
import java.util.StringJoiner;

public class ChemistryLab {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double preTemp = Double.parseDouble(br.readLine());

        StringJoiner sj = new StringJoiner("\n");

        while (true) {
            double temp = Double.parseDouble(br.readLine());
            if (temp == 999) break;

            double tempDiff = temp - preTemp;
            sj.add(String.format("%.2f", tempDiff));

            preTemp = temp;
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
