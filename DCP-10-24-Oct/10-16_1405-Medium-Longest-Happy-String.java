class Solution {
    public String longestDiverseString(int a, int b, int c) {
      PriorityQueue<Pair<Character, Integer>> maxHeap = new PriorityQueue<>((x, y) -> y.getValue() - x.getValue());
        
        if (a > 0) maxHeap.add(new Pair<>('a', a));
        if (b > 0) maxHeap.add(new Pair<>('b', b));
        if (c > 0) maxHeap.add(new Pair<>('c', c));
        
        StringBuilder result = new StringBuilder();
        
        while (!maxHeap.isEmpty()) {
            Pair<Character, Integer> first = maxHeap.poll();
            char firstChar = first.getKey();
            int firstCount = first.getValue();
            
            if (result.length() >= 2 && result.charAt(result.length() - 1) == firstChar && result.charAt(result.length() - 2) == firstChar) {
                if (maxHeap.isEmpty()) break; // No other character to pick, break the loop
                
                Pair<Character, Integer> second = maxHeap.poll();
                char secondChar = second.getKey();
                int secondCount = second.getValue();
                
                result.append(secondChar);
                secondCount--;
                
                if (secondCount > 0) {
                    maxHeap.add(new Pair<>(secondChar, secondCount));
                }
                
                maxHeap.add(first);
            } else {
                result.append(firstChar);
                firstCount--;
                
                if (firstCount > 0) {
                    maxHeap.add(new Pair<>(firstChar, firstCount));
                }
            }
        }
        
        return result.toString();  
    }
}