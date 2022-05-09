package com.bkryvetskti;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {
    private static final String FILE_PATH = Util.readFile("Part1.txt");

    public static void main(String[] args) {
        run();
    }

    private static void run() {
        convert1();
        convert2();
    }

    /*
    * Format: 'Login: email'
    */
    private static void convert1() {

        StringBuilder sb = new StringBuilder();

        Pattern p = Pattern.compile("(?m)^(?!\\A)^(.+?);(.+?);(.+?)$");
        Matcher m = p.matcher(FILE_PATH);

        while (m.find()) {
            sb.append(m.group(1))
                    .append(": ")
                    .append(m.group(3))
                    .append(System.lineSeparator());
        }
        System.out.println(sb);
    }

    /*
     * Format: 'name: email'
     */
    private static void convert2() {

        StringBuilder sb = new StringBuilder();

        Pattern p = Pattern.compile("(?m)^(?!\\A)^(.+?);(.+?);(.+?)$");
        Matcher m = p.matcher(FILE_PATH);

        while (m.find()) {
            sb.append(m.group(2))
                    .append(" (email: ")
                    .append(m.group(3))
                    .append(")")
                    .append(System.lineSeparator());
        }
        System.out.println(sb);
    }
}
