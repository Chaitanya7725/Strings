package medium;

public class MakeAnagram {

    public static void main(String[] args) {
        System.out.println(minSteps("bab","aba"));
        System.out.println(minSteps("leetcode","practice"));
    }

    public static int minSteps(String s, String t) {
        int [] sa= new int[26];
        int [] ta= new int[26];
        int count = 0;
        for (char sc:s.toCharArray())
            sa[sc-'a']++;
        for (char tc:t.toCharArray())
            ta[tc-'a']++;
        for (int i = 0; i < 26; i++) {
            if(sa[i]>ta[i])
                count+=sa[i]-ta[i];
        }
        return count;
    }

}
