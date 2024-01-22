package medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsinaString {

    public static void main(String[] args) {
        System.out.println( findAnagrams("cbaebabacd","abc"));
        System.out.println( findAnagrams("abab","ab"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> output = new ArrayList<>();
        if(s.length() == 0 || s == null) return output;
        int [] alpha = new int[26];
        for (char c : p.toCharArray())
            alpha[c-'a']++;

        int left = 0;
        int right = 0;
        int count=p.length();
        while(right < s.length()){
            if(alpha[s.charAt(right++)-'a']-- >=1 ) count--;
            if (count == 0) output.add(left);
            if( right-left == p.length() && alpha[s.charAt(left++)-'a']++ >= 0) count++;
        }
        return output;
    }


}
