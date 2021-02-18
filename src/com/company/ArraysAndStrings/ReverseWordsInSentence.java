package com.company.ArraysAndStrings;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String s = "olleh dlrow";
        String[] sarr = s.split(" ");
        StringBuilder res= new StringBuilder();
        for (String word :
                sarr) {
            res.append(new StringBuilder(word).reverse().toString());
            res.append(" ");
        }
        System.out.println(res.toString());
    }
}
