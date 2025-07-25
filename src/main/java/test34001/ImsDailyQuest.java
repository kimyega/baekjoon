package test34001;

import java.util.*;

public class ImsDailyQuest {

  static class Quest {
    int questLevel;
    int firstReduceLevel;
    int secondReduceLevel;

    Quest(int questLevel, int firstReduceLevel, int secondReduceLevel) {
      this.questLevel = questLevel;
      this.firstReduceLevel = firstReduceLevel;
      this.secondReduceLevel = secondReduceLevel;
    }

    int getMonsterCount(int level) {
      if (level < questLevel) {
        return 0;
      } else if (level >= secondReduceLevel) {
        return 100;
      } else if (level >= firstReduceLevel) {
        return 300;
      } else {
        return 500;
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int level = sc.nextInt();

    List<Quest> arcane = Arrays.asList(
            new Quest(200, 210, 220), // 소멸의 여로
            new Quest(210, 220, 225), // 츄츄 아일랜드
            new Quest(220, 225, 230), // 꿈의 도시 레헬른
            new Quest(225, 230, 235), // 신비의 숲 아르카나
            new Quest(230, 235, 245), // 기억의 늪 모라스
            new Quest(235, 245, 250)  // 태초의 바다 에스페라
    );


    List<Quest> grandis = Arrays.asList(
            new Quest(260, 265, 270), // 세르니움
            new Quest(265, 270, 275), // 호텔 아르크스
            new Quest(270, 275, 280), // 오디움
            new Quest(275, 280, 285), // 도원경
            new Quest(280, 285, 290), // 아르테리아
            new Quest(285, 290, 295), // 카르시온
            new Quest(290, 295, 300)  // 탈라하트
    );

    printQuestResult(arcane, level);
    printQuestResult(grandis, level);
  }

  static void printQuestResult(List<Quest> quests, int level) {
    StringBuilder sb = new StringBuilder();
    for (Quest q : quests) {
      sb.append(q.getMonsterCount(level)).append(" ");
    }
    System.out.println(sb.toString().trim());

  }
}
