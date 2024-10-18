class Solution {
    public int countMaxOrSubsets(int[] nums) {
         int maxOr = 0;
        for (int num : nums) {
            maxOr |= num;
        }
        
        return countSubsetsWithOr(nums, 0, 0, maxOr);
    }
    
    private int countSubsetsWithOr(int[] nums, int index, int currentOr, int maxOr) {
        if (index == nums.length) {
            return currentOr == maxOr ? 1 : 0;
        }
        
        int include = countSubsetsWithOr(nums, index + 1, currentOr | nums[index], maxOr);
        int exclude = countSubsetsWithOr(nums, index + 1, currentOr, maxOr);
        
        return include + exclude;
    }
}