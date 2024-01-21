package medium;

import java.util.*;

public class GroupAnagrams {

    /*public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> archive = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char [] str = strs[i].toCharArray();
            Arrays.sort(str);
            String sorted = String.valueOf(str);
            if(!archive.containsKey(sorted))
                archive.put(sorted,new ArrayList<>());
            archive.get(sorted).add(strs[i]);
        }
        return new ArrayList<>(archive.values());
    }*/

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            anagramGroups.computeIfAbsent(sortedStr, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        GroupAnagrams anagramGroups = new GroupAnagrams();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = anagramGroups.groupAnagrams(strs);
        for (List<String> group : result)
            System.out.println(group);
    }

}
