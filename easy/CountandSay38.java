package easy;

public class CountandSay38 {

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if(n==1)
            return "1";
        String s=countAndSay(n-1);

        int counter=0;
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            counter++;
            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1)){
                result.append(counter).append(s.charAt(i));
                counter=0;
            }
        }

        return result.toString();
    }

}
