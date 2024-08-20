class Solution {
    public boolean isPalindrome(int x) {
        long original = x;
        long reverse = 0;
        //Negative numbers can never be Palindroms because of the - sign
        if (x < 0) {
            return false;
        }
        //Until we've removed all the numbers
        while (original != 0) {
            //Modulo returns the remainder when divivisble by ten. This will be the smallest integer (the ones, then tens place, then hundreds, etc)
            int remaining = (int) original % 10;
            //Slide the numbers in the reverse to the left to make room for the new number, then add it in 
            reverse = reverse * 10 + remaining;
            //Decimals get removed. By dividing by ten we remove the number in the smallest place.
            original = original / 10;
        }
        return x == reverse;
    }
}