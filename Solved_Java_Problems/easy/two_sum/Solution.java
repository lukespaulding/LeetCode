class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Stores the number we are currently looking at
        int current_num;
        //For every number in the array...
        for (int i = 0; i < nums.length; i++){
            //Set the current number to one we haven't seen
            current_num = nums[i];
            //For every number after it
            for (int j = i + 1; j < nums.length; j++){
                //if they add to the target, return coordinates
                if (current_num + nums[j] == target){
                    int[] answer = {i, j};
                    return answer;
                }
            }
        }
        return null;
    }
}