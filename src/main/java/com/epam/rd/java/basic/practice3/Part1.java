package com.epam.rd.java.basic.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {

    public static void main(String[] args) {
        String string = Util.getInput("part1.txt");
        System.out.println(Part1.convert1(string));
        System.out.println(Part1.convert1(string));

    }

    public static String convert1(String input) {
        String regex = "(\\S+);(\\S+)\\s(\\S+);((\\S+)@(\\S+))$";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group(1)).append(": ").append(matcher.group(4)).append(System.lineSeparator());
        }
        return sb.toString().trim();
    }

    public static String convert2(String input) {
        return null;
    }

    public static String convert3(String input) {
        return null;
    }

    public static String convert4(String input) {
        return null;
    }
}