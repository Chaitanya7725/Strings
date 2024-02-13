package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    static Map<Character,Integer> archive = new HashMap<>();

    public static void main(String[] args) {
        archive.put('I',1);
        archive.put('V',5);
        archive.put('X',10);
        archive.put('L',50);
        archive.put('C',100);
        archive.put('D',500);
        archive.put('M',1000);
        System.out.println(romanToInt("V"));
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int total = 0;
        for (int i = 1; i < s.length(); i++) {
            if(archive.get(s.charAt(i-1)) < archive.get(s.charAt(i)))
                total -= archive.get(s.charAt(i-1));
            else
                total += archive.get(s.charAt(i-1));
        }
        total += archive.get(s.charAt(s.length()-1));
        return total;
    }

}
