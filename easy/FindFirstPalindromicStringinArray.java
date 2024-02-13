package easy;

public class FindFirstPalindromicStringinArray {

    public static void main(String[] args) {
//        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
        System.out.println(firstPalindrome(new String[]{"a","car","ada","racecar","cool"}));
    }

    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            if(ifPalindrome(words[i]))
                return words[i];
        }
        return "";
    }

    private static boolean ifPalindrome(String word) {
        for (int i = 0; i < word.length()/2; i++) {
            if(word.charAt(i) != word.charAt(word.length()-i-1))
                return false;
        }
        return true;
    }

}
