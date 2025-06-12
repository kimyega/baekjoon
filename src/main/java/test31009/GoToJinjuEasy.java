package test31009;

import java.io.*;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GoToJinjuEasy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        Map<String, Integer> routeMap = IntStream.range(0, n)
                .mapToObj(i -> {
                    try {
                        return br.readLine().split(" ");
                    } catch (IOException e) {
                        throw new UncheckedIOException(e);
                    }
                })
                .collect(Collectors.toMap(
                        arr -> arr[0],
                        arr -> Integer.parseInt(arr[1])
                ));


        int jinjuDt = routeMap.get("jinju");

        long count = routeMap.values().stream()
                .filter(dt -> dt > jinjuDt)
                .count();

        bw.write(jinjuDt + "\n" + count + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
