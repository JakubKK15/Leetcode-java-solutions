class Solution {
  public boolean isPalindrome(int x) {

    // Assign the reverse value to 0;
    int reverseX = 0;
    // remainder to use in operations below
    int remainder;
    // Store the original X value
    int originalX = x;

    // Reverse the given integer
    while (x != 0) {
      remainder = x % 10;
      reverseX = reverseX * 10 + remainder;
      x /= 10;
    }
        /* Check if the originalX is less than 0, because negative numbers are
        not palindromes, also if the originalX doesn't match the reverseX integer
        the loop will return false. If the integer passes the tests, it is a
        palindrome.
        */
    return originalX >= 0 && originalX == reverseX;

  }
}