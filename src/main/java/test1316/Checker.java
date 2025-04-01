package test1316;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        if (caseNo < 1 || caseNo > 100) return;
        sc.nextLine();

        // 입력 패턴
        String inputRegex = "^[a-z]{1,100}$";
        Pattern inputPattern = Pattern.compile(inputRegex);

        // 중복 제거용 배열
        String[] lines = new String[caseNo];

        // 알파벳 당 빈도수 저장용 Map
        Map<Character, Integer> wordFreqMap;

        // 그룹화 패턴
        String freqRegex = "([a-z])\\1*";
        Pattern freqPattern = Pattern.compile(freqRegex);

        // 결과
        int noCount = 0;

        for (int i = 0; i < caseNo; i++) {
            String line = sc.nextLine().trim();
            Matcher inputMatcher = inputPattern.matcher(line);
            if (!inputMatcher.matches()) return;

            // 중복제거
            for (int j = 0; j < i; j++) {
                if (line.equals(lines[j])) return;
            }

            // 배열 저장
            lines[i] = line;


            // 그룹화 Matcher 생성
            Matcher freqMatcher = freqPattern.matcher(line);

            // 초기화
            wordFreqMap = new HashMap<>();

            // 그룹된 단어 검사
            while (freqMatcher.find()) {
                char character = freqMatcher.group().charAt(0);
                int length = freqMatcher.group().length();

                // Map에 저장된 key가 중복될 경우 noCount로 저장
                if (!wordFreqMap.containsKey(character)) {
                    wordFreqMap.put(character, length);
                } else {
                    noCount++;
                    break;
                }
            }
        }
        int resultCount = caseNo - noCount;
        System.out.println(resultCount);

    }
}
