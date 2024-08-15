class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length; i++){
            //2 ^ 2 etc will cancel each other out thanks to XOR operator. Leaving only the int that is alone
            answer = answer ^ nums[i];
        }
        return answer;
    }
}