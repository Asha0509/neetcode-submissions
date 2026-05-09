class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i<9;i++){
            Set<Character> rs = new HashSet<>();
            Set<Character> cs = new HashSet<>();
            Set<Character> bs = new HashSet<>();
            for(int j = 0;j<9;j++){
                if(board[i][j]!='.' && !rs.add(board[i][j])){
                    return false;
                }
                if(board[j][i]!='.' && !cs.add(board[j][i])){
                    return false;
                }
                int br = 3*(i/3)+(j/3);
                int bc = 3*(i%3)+(j%3);
                if(board[br][bc]!='.' && !bs.add(board[br][bc])){
                    return false;
                }
            }
        }
        return true;

        
    }
}
