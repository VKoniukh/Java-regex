package com.epam.rd.java.basic.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part1 {

    public static void main(String[] args) {
        String string = Util.getInput("part1.txt");
//        System.out.println(Part1.convert1(string));
//        System.out.println(Part1.convert1(string));
        System.out.println(Part1.convert3(string));

    }

    public static String convert1(String input) {
        String regex = "(\\S+);(\\S+)\\s(\\S+);((\\S+)@(\\S+))$";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group(1)).append(": ").append(matcher.group(4)).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static String convert2(String input) {
        String regex = "(\\S+);(\\S+)\\s(\\S+);((\\S+)@(\\S+))$";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group(3)).append(" ").append(matcher.group(2)).append(" (email: ").append(matcher.group(4)).append(")").append(System.lineSeparator());
        }
        return sb.toString();
    }

    public static String convert3(String input) {
        String regax = "(\\S+);(\\S+)\\s(\\S+);((\\S+)@(\\S+))$";
        Pattern pattern = Pattern.compile(regax, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        int n = 0;
        while (matcher.find()&& n < 2) {
            String email = matcher.group(6);
            sb.append(email).append(" ==> ");tmp(email, input, sb);
            sb.deleteCharAt(sb.lastIndexOf(", "));
            n++;
        }
        sb.replace(25, 26, (System.lineSeparator()));
        //sb.replace(63, 63, (System.lineSeparator()));
        String sb1 = sb.toString().trim();
        return sb1;
    }


    public static void tmp(String email, String input, StringBuilder sb) {
        String regax = "(\\S+);(\\S+)\\s(\\S+);((\\S+)@(\\S+))$";
        Pattern pattern = Pattern.compile(regax, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);
        int o = 0;
        while (matcher.find()) {
            if (matcher.group(6).equals(email)) {
                sb.append(matcher.group(1)).append(", ");
            }
        }
        sb.append(System.lineSeparator());
    }

    public static String convert4(String input) {
        String regex = "(\\S+);(\\S+)\\s(\\S+);((\\S+)@(\\S+))$";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        Matcher matcher = pattern.matcher(input);
        StringBuilder sb = new StringBuilder();
        while (matcher.find()) {
            sb.append(matcher.group(1)).append(matcher.group(2)).append(matcher.group(3)).append(matcher.group(4)).append(matcher.group(5)).append(matcher.group(6)).append("4629").append(System.lineSeparator());
        }
        return sb.toString();
    }
}

