package medium;

public class ZigZag {

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));//PAHNAPLSIIGYIR
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) return s;
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < numRows; row++) {
            int increment = (numRows - 1) *2;
            for (int i = row; i < s.length(); i+=increment) {
                sb.append(s.charAt(i));
                if(row > 0 && row < numRows-1 && (i + increment - 2 * row)<s.length()){
                    sb.append(s.charAt(i + increment - 2 * row));
                }
            }
        }
        return sb.toString();
    }

}
