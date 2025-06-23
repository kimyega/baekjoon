package test5342;

import java.io.*;
import java.util.Map;

public class Billing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Double> supplies = Map.of(
                "Paper", 57.99,
                "Printer", 120.50,
                "Planners", 31.25,
                "Binders", 22.50,
                "Calendar", 10.95,
                "Notebooks", 11.20,
                "Ink", 66.95
        );

        double cost = 0;

        while (true) {
            String supply = br.readLine();
            if (supply.equals("EOI")) break;

            cost += supplies.get(supply);
        }

        bw.write("$" + cost);

        bw.flush();
        bw.close();
        br.close();
    }
}
