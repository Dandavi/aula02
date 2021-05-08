package com.es20.palindrome;

public class Palindrome {
    public boolean isPalindrome(String word) {
        String replacedWord = word
                .replace("!", "")
                .replace(" ", "")
                .replace(",", "")
                .replace("’", "")
                .replace(".", "")
                .replace(" . ", "")
                .replace("/", "")
                .replace("-", "");

        String reverseWord = new StringBuffer(replacedWord).reverse().toString();
        return reverseWord.toLowerCase().equals(replacedWord.toLowerCase());
    }
}
