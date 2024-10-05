class Solution {
    public boolean checkInclusion(String s1, String s2) {
      if (s1.length() > s2.length()) {
        return false;
      }  

      int[] s1Freq = new int[26];
      int[] s2Freq = new int[26];

      for (char c : s1.toCharArray())
        s1Freq[c - 'a']++;

      for (int i = 0; i < s1.length(); i++)
        s2Freq[s2.charAt(i) - 'a']++;
for (int i = 0; i <= s2.length() - s1.length(); i++) {
            if (matches(s1Freq, s2Freq)) {
                return true;
            }
  
            if (i + s1.length() < s2.length()) {
                s2Freq[s2.charAt(i) - 'a']--;
                s2Freq[s2.charAt(i + s1.length()) - 'a']++;
            }
        }
        
        return false;
    }
    
    private boolean matches(int[] s1Freq, int[] s2Freq) {
        for (int i = 0; i < 26; i++) {
            if (s1Freq[i] != s2Freq[i]) {
                return false;
            }
        }
        return true;
    }
}