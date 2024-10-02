class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int[] sortedArr = arr.clone();
      Arrays.sort(sortedArr);

      Map<Integer, Integer> rankMap = new HashMap<>();

      for  (int n : sortedArr)
        rankMap.putIfAbsent(n, rankMap.size() + 1);

      int[] result = new int[arr.length];

      for (int i = 0; i < arr.length; i++)
        result[i] = rankMap.get(arr[i]);

      return result;
    }
}