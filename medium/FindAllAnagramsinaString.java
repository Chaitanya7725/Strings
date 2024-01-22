package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsinaString {

    public static void main(String[] args) {
        System.out.println( findAnagrams("cbaebabacd","abc"));
        System.out.println( findAnagrams("abab","ab"));
    }

    public static List<Integer> findAnagrams(String s, String p) {
        int length = p.length();
        List<Integer> output = new ArrayList<>();

        char [] parray = p.toCharArray();
        Arrays.sort(parray);
        p=String.valueOf(parray);

        for (int i = 0; i < s.length()-length+1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i+length; j++) {
                char [] check = sb.append(s.charAt(j)).toString().toCharArray();
                Arrays.sort(check);
                String ch= String.valueOf(check);
                if(ch.equals(p))
                    output.add(i);
            }
        }
        return output;
    }


}
