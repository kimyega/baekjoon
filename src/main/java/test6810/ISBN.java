package test6810;

import java.io.*;

public class ISBN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String isbnStr = "9780921418";
        sb.append(isbnStr);

        for (int i = 0; i < 3; i++) {
            sb.append(br.readLine());
        }

        isbnStr = sb.toString();
        int sum = 0;

        for (int i = 0; i < isbnStr.length(); i++) {
            int n = isbnStr.charAt(i) - '0';
            if (i % 2 == 1) {
                sum += n * 3;
                continue;
            }
            sum += n;
        }

        bw.write("The 1-3-sum is "+ sum);
        bw.flush();
        bw.close();
        br.close();
    }
}
