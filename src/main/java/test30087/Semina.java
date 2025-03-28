package test30087;

import java.util.Scanner;

public class Semina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int caseNo = sc.nextInt();
        if (caseNo < 1 || caseNo > 7) return;
        sc.nextLine();

        String[] classes = new String[caseNo];
        for (int i = 0; i < caseNo; i++) {
            String line = sc.nextLine().trim();
            switch (line) {
                case "Algorithm":               classes[i] = "204";     break;
                case "DataAnalysis":            classes[i] = "207";     break;
                case "ArtificialIntelligence":  classes[i] = "302";     break;
                case "CyberSecurity":           classes[i] = "B101";    break;
                case "Network":                 classes[i] = "303";     break;
                case "Startup":                 classes[i] = "501";     break;
                case "TestStrategy":            classes[i] = "105";     break;
                default: return;
            }
        }
        sc.close();
        for (String className : classes) {
            System.out.println(className);
        }
    }
}
