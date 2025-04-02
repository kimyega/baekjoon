package test2941;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class CroatianAlphabet {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] wd = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        String str = br.readLine();
        for (String w : wd) {
            str = str.replaceAll(w, ",");
        }
        bw.write(String.valueOf(str.length()));

        br.close();
        bw.flush();
        bw.close();
    }
}
