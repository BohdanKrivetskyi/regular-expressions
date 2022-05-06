package com.bkryvetskti;

import java.io.*;
import java.util.Scanner;

public class Util {
    private static final String ENCODING = "UTF-8";

    public static String readFile(String fileName) {
        StringBuilder sb = new StringBuilder();

        try {
            Scanner sc = new Scanner(new File(fileName), ENCODING);

            while (sc.hasNextLine()) {
                sb.append(sc.nextLine()).append(System.lineSeparator());
            }
            sc.close();
            return sb.toString().trim();

        } catch (FileNotFoundException e) {
            System.out.println("File didn't found!");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String read = Util.readFile("Part1.txt");
        System.out.println(read);
    }
}
