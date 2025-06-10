package test32978;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class ForgottenGarlic {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        List<String> list = Arrays.stream(br.readLine().split("\\s+"))
                            .collect(Collectors.toList());
        String res = "";

        while (st.hasMoreTokens()) {
            String item = st.nextToken();

            if (!list.contains(item)) res = item;
        }

        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
