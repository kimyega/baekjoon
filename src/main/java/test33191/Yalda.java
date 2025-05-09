package test33191;

import java.io.*;

public class Yalda {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int wm = Integer.parseInt(br.readLine());
        int pg = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        while (true) {

            if (m >= wm) {
                bw.write("Watermelon");
                break;
            }

            if (m >= pg) {
                bw.write("Pomegranates");
                break;
            }

            if (m >= n) {
                bw.write("Nuts");
                break;
            }

            bw.write("Nothing");
            break;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
