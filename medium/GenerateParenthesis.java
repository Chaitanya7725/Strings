package medium;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> output_array= new ArrayList<>();
        backtrack(output_array,new StringBuilder(), 0,0,n);
        return output_array;
    }

    public static void backtrack(List<String> output_array, StringBuilder currentString, int open, int close, int max){
        if(currentString.length() == 2 * max) {
            output_array.add(currentString.toString());
            return;
        }
        if (open<max){
            backtrack(output_array,currentString.append("("),open+1,close,max);
            currentString.deleteCharAt(currentString.length()-1);
        }
        if (close<open){
            backtrack(output_array,currentString.append(")"),open,close+1,max);
            currentString.deleteCharAt(currentString.length()-1);
        }
    }

}
