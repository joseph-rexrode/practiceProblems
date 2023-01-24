package javaCode.ransomNote;

import java.util.HashMap;

public class Ransom {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            if (map.get(c) == null) {
                map.put(c, 1);
            }
            else {
                map.put(c, map.get(c) + 1);
            }
        }

        for (int j = 0; j < ransomNote.length(); j++) {
            char ch = ransomNote.charAt(j);
            if (map.get(ch) == null || map.get(ch) == 0) {
                return false;
            }
            else {
                map.put(ch, map.get(ch) - 1);
            }
        }

        return true;
    }
}
