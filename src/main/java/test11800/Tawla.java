package test11800;

import java.io.*;
import java.util.Map;
import java.util.StringTokenizer;

public class Tawla {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Map<Integer, String> dice = Map.of(
                1, "Yakk",
                2, "Doh",
                3, "Seh",
                4, "Ghar",
                5, "Bang",
                6, "Sheesh"
        );

        Map<Integer, String> equalDice = Map.of(
                1, "Habb Yakk",
                2, "Dobara",
                3, "Dousa",
                4, "Dorgy",
                5, "Dabash",
                6, "Dosh"
        );

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= caseNo; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append("Case " + i + ": ");

            if (a == b) {
                sb.append(equalDice.get(a));
            } else if (a == 5 && b == 6 || a == 6 && b == 5) {
                sb.append("Sheesh Beesh");
            } else {
                sb.append(dice.get(Math.max(a, b)) + " " + dice.get(Math.min(a, b)));
            }

            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
