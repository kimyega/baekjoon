package test17042;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Elder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        char currentOwner = br.readLine().charAt(0);
        int n = Integer.parseInt(br.readLine());

        Set<Character> owners = new HashSet<>();
        owners.add(currentOwner);

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            char winner = st.nextToken().charAt(0);
            char looser = st.nextToken().charAt(0);

            if (currentOwner == looser) {
                currentOwner = winner;
                owners.add(winner);
            }
        }

        bw.write(currentOwner + "\n" + owners.size());
        bw.flush();
        bw.close();
        br.close();
    }
}
