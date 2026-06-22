class Solution {
    public boolean isValidSudoku(char[][] board) {
          
          HashMap<Integer,ArrayList<Character>> r = new HashMap<>();

          HashMap<Integer, ArrayList<Character>> c = new HashMap<>();

          HashMap<Integer, ArrayList<Character>> square = new HashMap<>();
          
          for(int i = 0; i < board.length; i++) {
                 
                 for(int j = 0; j < board.length; j++) {

                    if(board[i][j] == '.') {
                        continue;
                    }

                    int sqrIndx = (i/3) * 3 + (j / 3);

                    ArrayList<Character> rowList = r.getOrDefault(i, new ArrayList<>());

                    ArrayList<Character> colList = c.getOrDefault(j, new ArrayList<>());

                    ArrayList<Character> sqrList = square.getOrDefault(sqrIndx, new ArrayList<>());




                    if(rowList.contains(board[i][j]) || colList.contains(board[i][j]) || sqrList.contains(board[i][j])) {
                        return false;
                    }

                    rowList.add(board[i][j]);
                    colList.add(board[i][j]);
                    sqrList.add(board[i][j]);

                    r.put(i, rowList);
                    c.put(j, colList);
                    square.put(sqrIndx, sqrList);
                 }

          }

          return true;
    }
}
