package medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement424 {

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABABBA", 2));
    }

    public static int characterReplacement(String s, int k) {
        Map<Character,Integer> map = new HashMap<>();
        int longest =0;
        int left= 0;
        int maxF= 0;
        for (int right = 0; right < s.length(); right++) {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            maxF = Math.max(maxF,map.get(s.charAt(right)));
            while((right -left +1)- maxF > k ){
                map.put(s.charAt(right),map.get(s.charAt(right))-1);
                left+=1;
            }
            longest = Math.max(longest,right-left+1);
        }
        return longest;
    }

}
