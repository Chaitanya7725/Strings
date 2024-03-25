package medium;

import java.util.HashMap;
import java.util.Map;

public class EncodeandDecodeTinyURL535 {

    private static Map<String,String> encodeMap = new HashMap<>();
    private static Map<String,String> decodeMap = new HashMap<>();
    private static String baseUrl = "http://tinyurl.com/";
    public static void main(String[] args) {
        System.out.println(decode(encode("https://leetcode.com/problems/design-tinyurl")));
        System.out.println(decode(encode("https://leetcode.com/problems/design-tinyurl1")));
        System.out.println(decode(encode("https://leetcode.com/problems/design-tinyurl2")));
        System.out.println(decode(encode("https://leetcode.com/problems/design-tinyurl3")));
        System.out.println(decode(encode("https://leetcode.com/problems/design-tinyurl4")));
        System.out.println(decode(encode("https://leetcode.com/problems/design-tinyurl5")));
    }

    public static String encode(String longUrl) {
        String shortUrl ="";
        if(!encodeMap.containsKey(longUrl)){
            shortUrl = baseUrl + encodeMap.size();
            encodeMap.put(longUrl,shortUrl);
            decodeMap.put(shortUrl,longUrl);
        }
        return encodeMap.get(longUrl);
    }

    public static String decode(String shortUrl) {
        return decodeMap.get(shortUrl);
    }

}
