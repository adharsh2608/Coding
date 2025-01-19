class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> check = new HashSet<>();
        for (int num : nums) {
            check.add(num);
        }

        int max = 0;

        for (int num : check) {
            if (!check.contains(num - 1)) {
                int currentNum = num;
                int cmax = 1;
                while (check.contains(currentNum + 1)) {
                    currentNum++;
                    cmax++;
                }
                max = Math.max(max, cmax);
            }
        }

        return max;
    }
}
