package test20282;

import java.io.*;

public class GameShow {

    public static class Player {
        public int maxSbecs;

        public Player() {
            this.maxSbecs = 100;
        }

        public void putSbecs(int sbecs) {
            this.maxSbecs = Math.max(this.maxSbecs, sbecs);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Player player = new Player();

        int sbecs = 100;

        while (N-- > 0) {
            int box = Integer.parseInt(br.readLine());
            sbecs += box;
            player.putSbecs(sbecs);
        }

        bw.write(player.maxSbecs + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
