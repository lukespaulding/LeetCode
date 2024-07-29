package Solved_Java_Problems.easy.closest_number_to_zero;

class Solution {
    public int findClosestNumber(int[] nums) {
        int answer = 0;
        int closest = Integer.MAX_VALUE;
        int diff = 0;
    
        for(int i = 0 ; i < nums.length ; i++){
            //Store current number in temp variable
            int temp = nums[i];
            
            //If the number is negative, we subtract
            if(temp < 0 ){
                 diff = 0 -temp ;
            //If Positive, we leave the same. In this way, we are getting the absolute value
            }else{
                 diff = temp - 0 ;
            }
            //If the difference is less than the previous least difference, swap the two
            if(diff < closest ){
                closest = diff ;
                answer = temp ;
            //If the difference is the same, then check and 
            //see which number was larger before we found the absolute value
            }else if(diff == closest) {
                if(answer < temp){
                    answer = temp ;
                }
            }
            
        }
        return answer;
    }
}