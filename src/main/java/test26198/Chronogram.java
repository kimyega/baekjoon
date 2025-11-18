package test26198;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Chronogram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        Map<Character, Integer> chgrm = new HashMap<>();

        chgrm.put('I', 1);
        chgrm.put('V', 5);
        chgrm.put('X', 10);
        chgrm.put('L', 50);
        chgrm.put('C', 100);
        chgrm.put('D', 500);
        chgrm.put('M', 1000);

        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            String line = br.readLine();
            int year = 0;

            for (char c : line.toCharArray()) {
                if (chgrm.containsKey(c)) year += chgrm.get(c);
            }

            sb.append(year).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
