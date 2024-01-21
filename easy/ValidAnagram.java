package easy;

import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(check("anagram","nagaram"));
        System.out.println(check("rat","car"));
        System.out.println(check("123","321"));
    }

    private static boolean check(String first, String second) {
        if (first.length()!=second.length()) return false;

        first = first.toLowerCase();
        second = second.toLowerCase();
        char f []=first.toCharArray();
        Arrays.sort(f);
        first=String.valueOf(f);
        char [] s=second.toCharArray();
        Arrays.sort(s);
        second=String.valueOf(s);
        return first.equals(second);
    }

}
