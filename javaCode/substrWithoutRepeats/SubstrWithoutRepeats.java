package javaCode.substrWithoutRepeats;

import java.util.HashMap;

public class SubstrWithoutRepeats {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int length = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int c = 0; c < s.length(); c++) {
            if (map.get(s.charAt(c)) != null) {
                maxLength = (length > maxLength) ? length: maxLength;
                length = 0;
                int temp = map.get(s.charAt(c));
                c = temp;
                map.clear();
            }
            else {
                length++;
                map.put(s.charAt(c), c);
            }
        }

        return (length > maxLength) ? length: maxLength;
    }
}


// To, find out a sliding window problem :-
// > First thing is, we have given something like an "Array" | OR | "String"
// > Second thing is, they are talking about either "subsequence" | OR | "substring"
// > And third most thing is, either we have given a "window size i.e. k" | OR | we have to "manually find out window size" 
