class Solution {
    boolean flag = false;

    public boolean exist(char[][] board, String word) {
        int column = board[0].length;
        int row = board.length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (!flag) {
                    traverseCheck(board, i, j, word, 0);
                }
            }
        }

        return flag;
    }

    public void traverseCheck(char[][] arr, int i, int j, String word, int length) {
        if (length == word.length()) {
            flag = true;
            return;
        }

        if (i < 0 || i >= arr.length || j < 0 || j >= arr[0].length || arr[i][j] != word.charAt(length)) {
            return;
        }

        char temp = arr[i][j];
        arr[i][j] = '?';

        traverseCheck(arr, i + 1, j, word, length + 1);
        traverseCheck(arr, i, j + 1, word, length + 1);
        traverseCheck(arr, i - 1, j, word, length + 1);
        traverseCheck(arr, i, j - 1, word, length + 1);

        arr[i][j] = temp; 
    }
}
