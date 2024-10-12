class Solution {
    public int minGroups(int[][] intervals) {
      Arrays.sort(intervals, (a, b) -> a[0] - b[0]); // Sort based on starting points

      PriorityQueue<Integer> minHeap = new PriorityQueue<>();

      for (int[] intv : intervals) {
        int start = intv[0];
        int end = intv[1];

        if (!minHeap.isEmpty() && minHeap.peek() < start)
          minHeap.poll();

        minHeap.offer(end);
      }

      return minHeap.size();
    }
}