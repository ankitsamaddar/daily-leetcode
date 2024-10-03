class Solution {
    public int minSubarray(int[] nums, int p) {
        int totalSumMod = 0;
        for (int num : nums) {
            totalSumMod = (totalSumMod + num) % p;
        }
        
        if (totalSumMod == 0) {
            return 0;
        }
        
        int targetMod = totalSumMod;
        int currentMod = 0;
        int minLength = nums.length;
        
        Map<Integer, Integer> modIndexMap = new HashMap<>();
        modIndexMap.put(0, -1);
        
        for (int i = 0; i < nums.length; i++) {
            currentMod = (currentMod + nums[i]) % p;
            
            int requiredMod = (currentMod - targetMod + p) % p;
            
            if (modIndexMap.containsKey(requiredMod)) {
                int subarrayLength = i - modIndexMap.get(requiredMod);
                minLength = Math.min(minLength, subarrayLength);
            }
            
            modIndexMap.put(currentMod, i);
        }
        
        return minLength == nums.length ? -1 : minLength;
    }
}