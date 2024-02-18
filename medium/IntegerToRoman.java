package medium;

public class IntegerToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(1));
    }

    public static String intToRoman(int num) {
        Integer[] integer={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < integer.length && num > 0; i++) {
            while(integer[i] <= num){
                num -= integer[i];
                sb.append(roman[i]);
            }
        }
        return sb.toString();
    }

}
