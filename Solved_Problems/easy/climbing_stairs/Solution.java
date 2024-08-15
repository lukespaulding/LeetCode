class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> completed_values = new HashMap<>();
        return climbStairs(n, completed_values);
    }
    private int climbStairs(int n, Map<Integer, Integer> completed_values){
        if (n == 0 || n == 1){
            return 1;
        }
        if (!completed_values.containsKey(n)){
            completed_values.put(n, (climbStairs(n-1, completed_values) + climbStairs(n-2, completed_values)));
        }
        return completed_values.get(n);
    }
}