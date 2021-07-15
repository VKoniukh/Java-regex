package com.epam.rd.java.basic.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part3 {

    public static void main(String[] args) {
        String input = Util.getInput("part3.txt");
        System.out.println(convert(input));
    }

    public static String convert(String input) {
        StringBuilder sb = new StringBuilder();
                for (String s: input.split("\\n")) {
                    Pattern p = Pattern.compile("[a-zA-Z\\p{InCyrillic}]+");
                    Matcher m = p.matcher(s);

                    while (m.find()) {
                        if (m.group().length() >= 3) {
                            String str = m.group();
                            if (m.group().matches("([A-Z])(.*)")) {
                                sb.append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).append(" ");
                            } else sb.append(Character.toUpperCase(str.charAt(0))).append(str.substring(1)).append(" ");
                        } else sb.append(m.group()).append(" ");
                    }
        }
        return sb.toString();
    }
}
