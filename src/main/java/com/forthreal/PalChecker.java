package com.forthreal;

public class PalChecker {
    /**
     * This method checks if the passed string is a palindrome
     * @param str - string that will be checked for being a palindrome
     * @return true if it is a palindrome, false otherwise. one symbol is a palindrome
     */
    public static boolean palCheckSmpl(String str) {
        var len = str.length();
        return len == 1 ||
               len == 2 && str.charAt(0) == str.charAt(1) ||
               len > 2 && str.charAt(0) == str.charAt(len - 1) && palCheckSmpl(str.substring(1, len - 1));
    }

    /**
     * This method checks if the passed string contains a palindrome in any of its part
     * @param str - string to be checked for containing a palindrome
     * @return true if any part of the string contains a palindrome, false otherwise
     */
    public static boolean hasPal(String str) {
        for(int i = 0; i < str.length() - 1; i++ ) {
            for(int j = str.length() - 1; j > i; j--) {
                if(str.charAt(i) == str.charAt(j) && palCheckSmpl(str.substring(i, j + 1))) return true;
            }
        }
        return false;
    }
}
