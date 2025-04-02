package test4673;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class SelfNumber {
    public static void main(String[] args) throws Exception {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        selfNum(1, 10000, bw);
        bw.flush();
        bw.close();
    }
    static void selfNum(int StartNum, int maxNum, BufferedWriter bw) throws Exception {
        int sum = StartNum;

        while (StartNum > 0) {
            sum += StartNum % 10;
            StartNum /= 10;
        }
        if (sum > maxNum) return;
        bw.write(sum + "\n");

        selfNum(sum, maxNum, bw);
    }
}
