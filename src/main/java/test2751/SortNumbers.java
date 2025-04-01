package test2751;

import java.util.*;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        if (caseNo < 1 || caseNo > 1000000) return;

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < caseNo; i++) {
            int num = sc.nextInt();
            list.add(num);
        }
        Collections.sort(list);
        for (int num : list) {
            System.out.println(num);
        }
    }
}
