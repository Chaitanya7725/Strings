package easy;

import java.util.List;
import java.util.Map;
import java.util.*;

public class ResultantArrayRemovingAnagrams {


    public static void main(String[] args) {
        System.out.println(removeAnagrams(new String[]{"abba","baba","bbaa","cd","cd"}));
        System.out.println(removeAnagrams(new String[]{"z","z","z","gsw","wsg","gsw","krptu"}));
        System.out.println(removeAnagrams(new String[]{"a","b","a"}));
    }

    private static List<String> removeAnagrams(String[] words) {
        Map<String, List<String>> archive = new LinkedHashMap<>();
        List<String> output = new ArrayList<>();
        for (String str : words) {
            char [] input = str.toCharArray();
            Arrays.sort(input);
            String in = String.valueOf(input);
            if(!archive.containsKey(in))
                archive.put(in, new ArrayList<>());
            archive.get(in).add(str);
        }
        for (String str:archive.keySet()) {
            output.add(archive.get(str).get(0));
        }
        return output;
    }

}
