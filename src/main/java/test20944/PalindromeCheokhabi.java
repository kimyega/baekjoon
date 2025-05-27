package test20944;

import java.io.*;
import java.util.Random;

public class PalindromeCheokhabi {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        StringBuilder sb = new StringBuilder();
        int half = n / 2;
        String halfPal = makePalindrome(half);

        if (n % 2 == 0) {
            sb.append(halfPal).append(halfPal);
        } else {
            sb.append(halfPal).append(randomChar()).append(halfPal);
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    private static final Random r = new Random();

    private static char randomChar() {
        return (char) (r.nextInt(26) + 'a');
    }

    private static String makePalindrome(int len) {
        StringBuilder sb = new StringBuilder();
        int halfLen = len / 2;

        for (int i = 0; i < halfLen; i++) {
            sb.append(randomChar());
        }

        String half = sb.toString();
        String rev = new StringBuilder(half).reverse().toString();

        if (len % 2 == 1) {
            return half + randomChar() + rev;
        } else {
            return half + rev;
        }
    }
}
