class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        while (top <= bottom) {
            int mid = (top + bottom) / 2;
            if (target == matrix[mid][0]) {
                return true;
            } else if (target > matrix[mid][0]) {
                top = mid + 1;
            } else {
                bottom = mid - 1;
            }
        }
        if (bottom < 0) {
            return false;
        }
        while (left <= right) {
            int mid1 = (left + right) / 2;
            if (target == matrix[bottom][mid1]) {
                return true;
            } else if (target > matrix[bottom][mid1]) {
                left = mid1 + 1;
            } else {
                right = mid1 - 1;
            }
        }
        return false;
    }
}