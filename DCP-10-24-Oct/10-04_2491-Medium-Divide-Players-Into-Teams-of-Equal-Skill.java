class Solution {
    public long dividePlayers(int[] skill) {
      Arrays.sort(skill);

      int totalSkillSum = 0;
      for (int s : skill)
        totalSkillSum += s;

      int n = skill.length;
      int targetSkillSum = totalSkillSum / (n/2);

      long chemSum = 0;

      for (int i = 0; i < n / 2; i++) {
        if (skill[i] + skill[n - 1 - i] != targetSkillSum)
          return -1;

        chemSum += (long) skill[i] * skill[n - 1 - i];
      }

      return chemSum;
    }
}