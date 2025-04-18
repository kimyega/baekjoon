package test6825;

import java.io.*;

public class BodyMassIndex {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double wgt = Double.parseDouble(br.readLine());
        double hgt = Double.parseDouble(br.readLine());

        double bmi = wgt / (hgt * hgt);

        String msg = bmi > 25 ? "Overweight" : bmi < 18.5 ? "Underweight" : "Normal weight";

        bw.write(msg);

        bw.flush();
        bw.close();
        br.close();
    }
}
