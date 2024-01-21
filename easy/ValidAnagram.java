package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(check("anagram","nagaram"));
        System.out.println(check("rat","car"));
        System.out.println(check("123","321"));
        System.out.println(check("aacc","ccac"));
    }

    private static boolean check(String s, String t) {
        if (s.length()!=t.length()) return false;

        s = s.toLowerCase();
        t = t.toLowerCase();
        char f []=s.toCharArray();
        Arrays.sort(f);
        s=String.valueOf(f);
        char [] se=t.toCharArray();
        Arrays.sort(se);
        t=String.valueOf(se);
        return s.equals(t);
    }

}
