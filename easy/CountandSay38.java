package easy;

public class CountandSay38 {

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        String one = "1";
        String two = "11";
        if (n == 1) return one;
        if (n == 2) return two;
        String result = two;
        for (int i = 3; i <= n; i++) {
            result+='&';
            String temporary = "";
            int counter = 1;
            for (int j = 1; j < result.length(); j++) {
                if(result.charAt(j) != result.charAt(j-1)){
                    temporary += String.valueOf(counter) + result.charAt(j-1);
                    counter = 1;
                }
                else
                    counter++;
            }
            result = temporary;
        }
        return result;
    }

}
