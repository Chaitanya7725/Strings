package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    static Map<Character,Character> archive = new HashMap<>();
    public static void main(String[] args) {
        archive.put('{','}');
        archive.put('(',')');
        archive.put('[',']');
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("{)"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("]"));
        System.out.println(isValid("["));

    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(archive.containsValue(c) ){
                if(!stack.isEmpty() && archive.get(stack.peek())==c)
                    stack.pop();
                else
                    return false;
            }
            else
                stack.push(c);
        }
        return stack.isEmpty() ? true: false;
    }

}
