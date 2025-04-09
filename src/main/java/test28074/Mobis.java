package test28074;

import java.io.*;

public class Mobis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        char[] mobis = {'M', 'O', 'B', 'I', 'S'};
        char[] mobisCount = new char[256];

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            boolean shouldRemove = false;

            for(int word : mobis) {
                if(c == word && mobisCount[c] == 0) {
                    mobisCount[c]++;
                    shouldRemove = true;
                    break;
                }
            }

            if(!shouldRemove) {
                sb.append(c);
            }
        }

        if(input.length() - sb.length() != 5) {
            bw.write("NO");
        } else {
            bw.write("YES");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
