package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinations {

    static Map<Character,String> archive = new HashMap<>(){{
        put('2',"abc");
        put('3',"def");
        put('4',"ghi");
        put('5',"jkl");
        put('6',"mno");
        put('7',"pqrs");
        put('8',"tuv");
        put('9',"wxyz");

    }};
    public static void main(String[] args) {
        String digits = "";
        System.out.println(letterCombinations(digits));
    }

    private static List<String> letterCombinations(String digits){
        List<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;
        result.add("");
        for (char c:digits.toCharArray()) {
            result=getCombinations(result,archive.get(c));
        }
        return result;
    }

    private static List<String> getCombinations(List<String> result,String str) {
        List<String> list = new ArrayList<>();
        for (String res:result) {
            for (char c:str.toCharArray()) {
                list.add(res+c);
            }
        }
        return list;
    }

}
