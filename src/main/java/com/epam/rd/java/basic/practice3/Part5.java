package com.epam.rd.java.basic.practice3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Part5 {

    public static void main(String[] args) {

       // "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
    }

    public static String decimal2Roman(int dec) {
        System.out.println("Integer: " + dec);
        int[] values = {dec};
        String[] romanLiterals = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (dec >= values[i]) {
                dec -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        System.out.println("Roman: " + roman.toString());
        return roman.toString();
    }


    public static int roman2Decimal(String roman) {
        final int [] decimals = {4, 9, 40, 90, 1, 5, 10, 50, 100};
        final String [] romans = {"IV", "IX", "XL", "XC", "I", "V", "X", "L", "C"};
        int sum = 0;

        for (int i = 0; i < roman.length(); i++) {
            for (String s : romans) {
                Matcher m = Pattern.compile("^" + s).matcher(roman);
                if (m.find()) {
                    sum += decimals[findIndex(m.group(), romans)];

                    if (roman.length() - m.group().length() == 0) {
                        return sum;
                    }
                    return sum + roman2Decimal(roman.substring(m.group().length()));
                }
            }
        }
        return 0;
    }

    public static int findIndex (String str, String[] romans) {
        for (int i = 0; i < romans.length; i++) {
            if (romans[i].equals(str)) {
                return i;
            }
        }
        return 0;
    }
}
