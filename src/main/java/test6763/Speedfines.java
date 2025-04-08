package test6763;

import java.io.*;

public class Speedfines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int limitSpeed = Integer.parseInt(br.readLine());
        int speed = Integer.parseInt(br.readLine());
        int overSpeed = speed - limitSpeed;

        if (overSpeed > 0) {
            if (overSpeed <= 20) {
                bw.write("You are speeding and your fine is $100.");
            } else if (overSpeed <= 30) {
                bw.write("You are speeding and your fine is $270.");
            } else {
                bw.write("You are speeding and your fine is $500.");
            }
        } else {
            bw.write("Congratulations, you are within the speed limit!");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
