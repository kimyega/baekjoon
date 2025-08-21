package test24830;

import java.io.*;
import java.util.StringTokenizer;

public class BrokenCalculator {

    static long a;
    static long b;
    static long preResult = 1;
    static char op;

    static long calc() {
        switch (op) {
            case '+': preResult = plus();     break;
            case '-': preResult = minus();    break;
            case '*': preResult = multiply(); break;
            case '/': preResult = divide();   break;
        }
        return preResult;
    }

    static long plus() {
        return a + b - preResult;
    }

    static long minus() {
        return (a - b) * preResult;
    }

    static long multiply() {
        return (a * b) * (a * b);
    }

    static long divide() {
        return a % 2 == 0 ? a / 2 : (a + 1) / 2;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            a = Long.parseLong(st.nextToken());
            op = st.nextToken().charAt(0);
            b = Long.parseLong(st.nextToken());

            sb.append(calc()).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
