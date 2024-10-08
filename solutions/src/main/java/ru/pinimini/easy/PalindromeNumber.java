package ru.pinimini.easy;

public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        int num = x;

        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num/= 10;
        }
        return x == rev;
    }

    //Solution1
    //O(n)
/*
    public boolean isPalindrome(int x) {

        int reverse = 0;
        int ceil = 0;
        int copyX = x;
        int finalCopyX = x;

        while (copyX != 0) {
            copyX /= 10;
            ceil ++;
        }

        while (ceil >= 0) {
            ceil--;
            reverse += (int) ((x % 10) * Math.pow(10, ceil));
            x /= 10;
        }
        return finalCopyX == reverse;
    }
*/

}
