package test25965;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MissionDonation {

    static class Reward {
        int rewardPerKill;
        int rewardPerDeath;
        int rewardPerAssist;

        Reward(int rewardPerKill, int rewardPerDeath, int rewardPerAssist) {
            this.rewardPerKill = rewardPerKill;
            this.rewardPerDeath = rewardPerDeath;
            this.rewardPerAssist = rewardPerAssist;
        }

        long totalReward(int kill, int death, int assist) {
            long totalReward = (long) kill * rewardPerKill - (long) death * rewardPerDeath + (long) assist * rewardPerAssist;
            return Math.max(totalReward, 0);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        List<Reward> rewards;
        Reward reward;

        int games = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (games-- > 0) {
            rewards = new ArrayList<Reward>();
            long totalReward = 0;

            int missions = Integer.parseInt(br.readLine());

            while (missions-- > 0) {
                st = new StringTokenizer(br.readLine());
                int rewardPerKill = Integer.parseInt(st.nextToken());
                int rewardPerDeath = Integer.parseInt(st.nextToken());
                int rewardPerAssist = Integer.parseInt(st.nextToken());

                reward = new Reward(rewardPerKill, rewardPerDeath, rewardPerAssist);

                rewards.add(reward);
            }

            st = new StringTokenizer(br.readLine());
            int kill = Integer.parseInt(st.nextToken());
            int death = Integer.parseInt(st.nextToken());
            int assist = Integer.parseInt(st.nextToken());

            totalReward = rewards.stream()
                        .mapToLong(i -> i.totalReward(kill, death, assist))
                        .sum();

            sb.append(totalReward).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
