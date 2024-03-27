package easy;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("input"));
    }

    public static String reverse(String input){
        int l =0;
        int r = input.length()-1;
        StringBuilder sb = new StringBuilder(input);
        while (l<=r) {
            char temp = sb.charAt(l);
            sb.setCharAt(l, input.charAt(r));
            sb.setCharAt(r, temp);
            l+=1;
            r-=1;
        }
        return sb.toString();
    }
}
