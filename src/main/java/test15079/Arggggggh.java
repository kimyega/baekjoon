package test15079;

import java.io.*;
import java.util.StringTokenizer;

public class Arggggggh {

    public static class Direction {
        private double x;
        private double y;

        public Direction(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void move (String dir, int dt) {

            double dx = 0, dy = 0;
            double k = dt / Math.sqrt(2);

            switch (dir) {
                case "N":   dy += dt;   break;
                case "E":   dx += dt;   break;
                case "W":   dx -= dt;   break;
                case "S":   dy -= dt;   break;
                case "NE":  dx = k;     dy = k;     break;
                case "SE":  dx = k;     dy = -k;    break;
                case "SW":  dx = -k;    dy = -k;    break;
                case "NW":  dx = -k;    dy = k;     break;
            }

            this.x += dx;
            this.y += dy;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        Direction direction = new Direction(x, y);
        caseNo--;

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            String dir = st.nextToken();
            int dt = Integer.parseInt(st.nextToken());
            direction.move(dir, dt);
        }

        bw.write(String.format("%.8f %.8f", direction.x, direction.y));

        bw.flush();
        bw.close();
        br.close();
    }
}
