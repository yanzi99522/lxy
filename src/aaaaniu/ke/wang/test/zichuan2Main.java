package aaaaniu.ke.wang.test;


import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class zichuan2Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        while (input.hasNextLine()) {
            line = input.nextLine();
            parse(line);
        }
    }
    private static void parse(String line) {
        String subLine;
        Map<String, Integer> map = new TreeMap<String, Integer>();
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < line.length(); i++) {
            for (int j = i + 1; j <= line.length(); j++) {
                subLine = line.substring(i, j);
                if (subLine.length() != line.length()) {
                    list.add(subLine);
                    map.put(subLine, 0);
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (list.get(i).equals(entry.getKey())) {
                    entry.setValue(entry.getValue() + 1);
                }
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " " + entry.getValue());
                System.out.println();
            }
        }
    }
}