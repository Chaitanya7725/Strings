package medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int length = s.length();
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        while(right < length){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                maxLength = Math.max(maxLength, right - left);
            }else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxLength;
    }

}
