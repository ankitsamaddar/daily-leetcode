class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int currentMax = Integer.MIN_VALUE;
        int[] result = {0, Integer.MAX_VALUE};
        
        for (int i = 0; i < nums.size(); i++) {
            int val = nums.get(i).get(0);
            minHeap.offer(new int[]{val, i, 0});
            currentMax = Math.max(currentMax, val);
        }
        
        while (!minHeap.isEmpty()) {
            int[] min = minHeap.poll();
            int val = min[0], listIndex = min[1], elementIndex = min[2];
            
            if (currentMax - val < result[1] - result[0]) {
                result[0] = val;
                result[1] = currentMax;
            }
            
            if (elementIndex + 1 < nums.get(listIndex).size()) {
                int nextVal = nums.get(listIndex).get(elementIndex + 1);
                minHeap.offer(new int[]{nextVal, listIndex, elementIndex + 1});
                currentMax = Math.max(currentMax, nextVal);
            } else {
                break;
            }
        }
        
        return result;
    }
}