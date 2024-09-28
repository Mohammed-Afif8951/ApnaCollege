/*
 * Given two strings s and t, return true if it is an anagram of s, and false otherwise
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase typically using all the original letters exactly once.
 * 
 * s = race     t = care ->     true
 * s = heart    t = earth ->    true
 * s = tulip    t = lipid ->    false 
 */
package HashMap;

import java.util.HashMap;

public class IsAnagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        // put all the char of s in HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // check if all t exist in map
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (map.containsKey(ch)) {
                if (map.get(ch) == 1) {
                    map.remove(ch);
                } else {
                    map.put(ch, map.get(ch) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }

    public static void main(String[] args) {
        // String s = "race";
        // String t = "care";
        String s = "lulip";
        String t = "lipid";
        System.out.println(isAnagram(s, t));
    }
}
