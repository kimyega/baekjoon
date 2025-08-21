package test32969;

import java.io.*;
import java.util.Arrays;

public class ConferenceApplication {

    static class Conference {
        String title;
        String[] digitalKeywords = {"social", "history", "language", "literacy"};
        String[] publicKeywords = {"bigdata", "public", "society"};

        Conference(String title) {
            this.title = title;
        }
        public String classifyCategory() {
            boolean digitalFound = Arrays.stream(digitalKeywords).anyMatch(title::contains);
            boolean publicFound = Arrays.stream(publicKeywords).anyMatch(title::contains);
            return digitalFound ? "digital humanities" : publicFound ? "public bigdata" : "";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String title = br.readLine();

        Conference conference = new Conference(title);
        bw.write(conference.classifyCategory());

        bw.flush();
        bw.close();
        br.close();
    }
}
