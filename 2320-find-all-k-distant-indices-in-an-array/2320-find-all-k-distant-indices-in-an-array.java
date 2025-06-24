class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> result = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                int start = Math.max(0, i - k);
                int end = Math.min(nums.length - 1, i + k);
                for (int j = start; j <= end; j++) {
                    result.add(j);
                }
            }
        }
        
        List<Integer> resList = new ArrayList<>(result);
        Collections.sort(resList);
        return resList;
    }
}
