package test28249;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ChiliPeppers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        int sum = 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("Poblano" ,  1500);
        map.put("Mirasol" ,  6000);
        map.put("Serrano" ,  15500);
        map.put("Cayenne" ,  40000);
        map.put("Thai"    ,  75000);
        map.put("Habanero",  125000);

        while (caseNo-- > 0) {
            String line = br.readLine();
            int scobil = map.get(line);
            sum += scobil;
        }

        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
