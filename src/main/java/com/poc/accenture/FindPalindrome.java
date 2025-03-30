package com.poc.accenture;

public class FindPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = findPalindrome(str);
        if (isPalindrome) {
            System.out.println("This is palindrome " + str);
        } else {
            System.out.println("This is not palindrome " + str);
        }
    }

    private static boolean findPalindrome(String str) {

        return str.equalsIgnoreCase(new StringBuffer(str).reverse().toString());
    }
}
