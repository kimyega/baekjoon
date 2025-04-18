package test20232;

import java.io.*;

public class Archivist {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] winners =
        {
                "ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO", "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO",
                "ITMO", "PetrSU, ITMO", "SPbSU", "SPbSU", "ITMO", "ITMO", "ITMO", "ITMO", "SPbSU",
                "ITMO", "ITMO", "ITMO","ITMO", "SPbSU","ITMO"
        };

        int year = Integer.parseInt(br.readLine());
        String winner = winners[year - 1995];

        bw.write(winner);

        bw.flush();
        bw.close();
        br.close();
    }
}
