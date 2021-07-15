package com.epam.rd.java.basic.practice3;

public class Part2 {

    public static void main(String[] args) {
        String input = Util.getInput("part2.txt");
        System.out.println(Part2.convert(input));
    }


    public static String convert(String input) {
//        String s = input;
//        String longest = Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null);
//        System.out.println(longest);
//        return longest;
        if (input == null)
            return null;
        String sw = "", lw = "";
        int s = input.length(), l = 0;
        String words[] = input.split(" ");
        for (String word : words) {
            if (word.length() < s) {
                sw = word;
                s = word.length();
            }
            if (word.length() > l) {
                lw = word;
                l = word.length();
            }
        }
        System.out.println("LONGEST WORD : " + lw);
        System.out.println("SHORTEST WORD : " + sw);
        return sw+lw;
    }
}









