package CrackingCodingInterviewStringArrays;

import java.util.HashMap;

public class Anagrams {
    /*
    Write a method to decide if two strings are anagrams or not.
    cinema == iceman
     */

    public static void main(String[] args) {
        String s1 = "CINEMA";
        String s2 = "ICEMAN";
        System.out.println(isAnagram(s1,s2));

        s1 = "ddd";
        s2 = "ddd";
        System.out.println(isAnagram(s1,s2));


        s1 = "";
        s2 = "";
        System.out.println(isAnagram(s1,s2));

        s1 = "C";
        s2 = "ICEMAN";
        System.out.println(isAnagram(s1,s2));

        s1 = "";
        s2 = "ICEMAN";
        System.out.println(isAnagram(s1,s2));


    }
    public static boolean isAnagram(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        String n1 = s1.trim().toLowerCase();
        String n2 = s2.trim().toLowerCase();

        if (n1.isEmpty() && n2.isEmpty()) return true;
        if (n1.isBlank() && n2.isBlank()) return true;

        for (char c : n1.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (char c: n2.toCharArray()) {
            int k = 0;
            if(map.containsKey(c)) {
                k = map.get(c);
                map.put(c,k-1);
            }
            else return false;
        }

        for (int count :
                map.values()) {
                if (count != 0) return false;
        }
        return true;

    }

}
