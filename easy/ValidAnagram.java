package easy;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(check("anagram","nagaram"));
        System.out.println(check("rat","car"));
        System.out.println(check("123","321"));
    }

    private static boolean check(String first, String second) {
        Map<Character,Integer> archive1 = new HashMap<>();
        Map<Character,Integer> archive2 = new HashMap<>();
        if (first.length() == second.length()){
            for (int i = 0; i < first.length(); i++) {
                archive1.put(first.charAt(i),archive1.getOrDefault(archive1.get(first.charAt(i)),0)+1);
                archive2.put(second.charAt(i),archive2.getOrDefault(archive2.get(second.charAt(i)),0)+1);
            }
            if(archive2.equals(archive1)) return true;
        }

        return false;
    }

}
