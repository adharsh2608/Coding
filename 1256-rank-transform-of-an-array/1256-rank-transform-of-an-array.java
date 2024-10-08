class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }
        int[] rankedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rankedArr[i] = rankMap.get(arr[i]);
        }
        
        return rankedArr;

    }
}