package test6812;

import java.io.*;
import java.util.List;

public class GoodTimes {

    static class CanadaCity {
        String city;
        int diffMinutes;

        public CanadaCity(String city, int diffMinutes) {
            this.city = city;
            this.diffMinutes = diffMinutes;
        }

        public String getCityTime(int totalMinutes) {
            int localMinutes = (totalMinutes + diffMinutes + 24 * 60) % (24 * 60);
            int h = localMinutes / 60;
            int m = localMinutes % 60;
            return (h * 100 + m) + " in " + city;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<CanadaCity> cities = List.of(
                new CanadaCity("Ottawa", 0),
                new CanadaCity("Victoria", -180),
                new CanadaCity("Edmonton", -120),
                new CanadaCity("Winnipeg", -60),
                new CanadaCity("Toronto", 0),
                new CanadaCity("Halifax", 60),
                new CanadaCity("St. John's", 90)
        );

        int time = Integer.parseInt(br.readLine());
        int hh = time / 100;
        int mm = time % 100;
        int totalMinutes = hh * 60 + mm;

        StringBuilder sb = new StringBuilder();
        cities.forEach(city -> {
            sb.append(city.getCityTime(totalMinutes)).append("\n");
        });

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
