package test10101;

import java.io.*;

public class Triangle {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int angleA = Integer.parseInt(br.readLine());
        int angleB = Integer.parseInt(br.readLine());
        int angleC = Integer.parseInt(br.readLine());
        int sum = angleA + angleB + angleC;
        if (sum != 180) {
            bw.write("Error\n");
        } else if (angleA != angleB && angleB != angleC && angleC != angleA) {
            bw.write("Scalene\n");
        } else if (angleA == angleB && angleB == angleC) {
            bw.write("Equilateral\n");
        } else {
            bw.write("Isosceles\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
