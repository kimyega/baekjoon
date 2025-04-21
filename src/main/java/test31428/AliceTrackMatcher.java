package test31428;

import java.io.*;
import java.util.StringTokenizer;

public class AliceTrackMatcher {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int friendNo = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        String track = br.readLine();

        int count = 0;
        while (st.hasMoreTokens()) {
            String ftrack = st.nextToken();
            if (ftrack.equals(track)) {
                count++;
            }
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
