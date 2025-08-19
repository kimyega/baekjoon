package test14535;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class BirthdayGraph {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        StringBuilder sb = new StringBuilder();

        int caseNo = 0;

        while ((line = br.readLine()) != null && !line.trim().equals("0")) {
            caseNo++;
            sb.append("Case #" + caseNo + ":\n");

            List<Map.Entry<String, Integer>> bthList = getEntries();
            Map.Entry<String, Integer> bthEntry;
            StringTokenizer st;

            int n = Integer.parseInt(line);

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine().trim());
                int day = Integer.parseInt(st.nextToken());
                int month = Integer.parseInt(st.nextToken());
                int year = Integer.parseInt(st.nextToken());

                bthEntry = bthList.get(month - 1);
                bthEntry.setValue(bthEntry.getValue() + 1);
            }


            IntStream.range(0, bthList.size())
                    .forEach(i -> {
                        Map.Entry<String, Integer> entry = bthList.get(i);
                        sb.append(entry.getKey() + ":" + "*".repeat(entry.getValue()) + "\n");
                    });
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    private static List<Map.Entry<String, Integer>> getEntries() {
        Map<String, Integer> bthMap = new LinkedHashMap<>();
        bthMap.put("Jan", 0);
        bthMap.put("Feb", 0);
        bthMap.put("Mar", 0);
        bthMap.put("Apr", 0);
        bthMap.put("May", 0);
        bthMap.put("Jun", 0);
        bthMap.put("Jul", 0);
        bthMap.put("Aug", 0);
        bthMap.put("Sep", 0);
        bthMap.put("Oct", 0);
        bthMap.put("Nov", 0);
        bthMap.put("Dec", 0);

        return new ArrayList<>(bthMap.entrySet());
    }
}
