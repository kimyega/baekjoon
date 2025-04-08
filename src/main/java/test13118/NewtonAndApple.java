package test13118;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NewtonAndApple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        while (st1.hasMoreTokens()) {
            list.add(Integer.parseInt(st1.nextToken()));
        }

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int xAp = Integer.parseInt(st2.nextToken());

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == xAp) {
                bw.write((i + 1) + "");
                count++;
            }
        }

        if (count == 0) {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
