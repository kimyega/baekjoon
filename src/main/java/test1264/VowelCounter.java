package test1264;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class VowelCounter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> vowelCount = new ArrayList<Integer>();
        while (true) {
            String line = br.readLine();
            if (line.equals("#")) break;
            int prevLength = line.length();
            line = line.replaceAll("[aeiouAEIOU]", "");
            int afterLength = line.length();
            int count = prevLength - afterLength;
            vowelCount.add(count);
        }
        for (int count : vowelCount) {
            bw.write(count + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
