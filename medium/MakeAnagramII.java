package medium;

import java.util.*;

public class MakeAnagramII {

    public static void main(String[] args) {
        System.out.println(minSteps("night","thing"));
        System.out.println(minSteps("leetcode","coats"));
    }

    public static int minSteps(String s, String t) {
        int count=0;
        int [] sa = new int[26];
        for (char c: s.toCharArray())
            sa[c-'a']++;
        for (char c: t.toCharArray())
            sa[c-'a']--;
        for(int a:sa)
            count+=Math.abs(a);
        return count;
    }

}
