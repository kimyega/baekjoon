package test11943;

import java.io.*;
import java.util.StringTokenizer;

public class MoveFile {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int app1 = Integer.parseInt(st1.nextToken());
        int oran1 = Integer.parseInt(st1.nextToken());
        int app2 = Integer.parseInt(st2.nextToken());
        int oran2 = Integer.parseInt(st2.nextToken());
        int sum = Math.min(app1 + oran2, app2 + oran1);
        bw.write(sum + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
