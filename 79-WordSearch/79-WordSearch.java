// Last updated: 6/12/2025, 8:30:36 AM
class Solution {
public boolean exist(char[][] board, String word) {
for (int i = 0; i < board.length; i++) {
for (int j = 0; j < board[0].length; j++) {
if (helper(board, word, i, j, 0)) {
return true;
}
}
}
return false;
}

boolean helper(char[][] board, String word, int row, int col, int length) {
    if (length >= word.length()) {
        return true;
    }
    
    if (row < 0 || row > board.length-1 || col < 0 || col > board[0].length-1) {
        return false;
    }
    
    if (board[row][col] != word.charAt(length)) {
        return false;
    }
    
    int[] rowOffsets = {0, 1, 0, -1};
    int[] colOffsets = {1, 0, -1, 0};
    
    char temp = board[row][col];
    board[row][col] = '#';
    
    for (int i = 0; i < 4; i++) {
        if (helper(board, word, row+rowOffsets[i], col+colOffsets[i], length+1)) {
            return true;
        }
    }
    
    board[row][col] = temp;
    return false;
}
}