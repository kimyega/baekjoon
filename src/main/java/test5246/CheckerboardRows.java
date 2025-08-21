package test5246;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CheckerboardRows {
    private static int solve(int [] positions_x, int [] positions_y) {
        int result = 0;

        /* ------------------- INSERT CODE HERE ---------------------*/

        Map<Integer,Integer> positions =  Arrays.stream(positions_y)
                .boxed()
                .collect(Collectors.toMap(
                        r -> r,          // key: 행 번호
                        r -> 1,          // value: 처음엔 1
                        (oldVal, newVal) -> oldVal + 1 // 이미 있으면 +1
                ));

        result = positions.values().stream()
                .max(Integer::compareTo)
                .orElse(0);

        /* -------------------- END OF INSERTION --------------------*/

        return result;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++)
        {
            int numPieces = sc.nextInt();

            int[] positions_x = new int[numPieces];
            int[] positions_y = new int[numPieces];


            for(int j = 0; j < numPieces; j++) {
                positions_x[j] = sc.nextInt();
                positions_y[j] = sc.nextInt();
            }

            System.out.println (solve(positions_x, positions_y));

        }
    }
}
