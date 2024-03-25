package medium;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeString271 {
    public static void main(String[] args) {
        String encoded = encode(new ArrayList<>(){{
            add("Hello");
            add("World");
        }});
        System.out.println(decode(encoded));
    }

    private static String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str:strs)
            sb.append(str.length()).append('#').append(str);
        return sb.toString();
    }

    private static List<String> decode(String encoded) {
        List<String> output = new ArrayList<>();
        int i=0,j;
        while(i<encoded.length()){
            j=i;
            while(encoded.charAt(j)!='#')
                j+=1;
            int length = Integer.valueOf(encoded.substring(i,j));
            output.add(encoded.substring(j+1,j+1+length));
            i = j+1+length;
        }
        return output;
    }
}