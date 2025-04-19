package test31495;

import java.io.*;

public class WhatCode {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String word = br.readLine();
    String rWord = word.replaceAll("\"", "");
    String tWord = word.replaceAll("^\"+|\"+$", "");

    int len = word.length();
    int rWordLen = len - rWord.length();
    int tWordLen = len - tWord.length();

    if (rWordLen != 2 || tWordLen != 2 || rWord.isEmpty()) {
      bw.write("CE");
    } else {
      bw.write(tWord);
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
