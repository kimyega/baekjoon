package test2845;

import java.io.*;
import java.util.StringTokenizer;

public class FinishedParty {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int people = Integer.parseInt(st1.nextToken());
        int areas = Integer.parseInt(st1.nextToken());
        int totalPeople = people * areas;
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (st2.hasMoreTokens()) {
            int articlePeople = Integer.parseInt(st2.nextToken());
            int result = articlePeople - totalPeople;
            sb.append(result + " ");
        }
        bw.write(sb.toString().trim() + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
