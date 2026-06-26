class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;

        int col = matrix[0].length;

        //System.out.println(col);

        int possRow = -1;

        int left = 0;

        int right = rows - 1;

        while(left <= right) {

            int mid = left + (right - left)/2;

            if(matrix[mid][col -1] >= target && matrix[mid][0] <= target) {
                possRow = mid;
                break;
            }
            else if(matrix[mid][col -1] < target) {
                left = mid + 1;
            }
            else if(matrix[mid][0] > target) {
                right = mid - 1;
            }

        }

        if(possRow < 0) {
            return false;
        }

        left = 0;
        right = col -1;

        while(left <= right) {

            int mid = left + (right - left)/2;

            if(matrix[possRow][mid] > target) {
                right = mid - 1;
            }
            else if(matrix[possRow][mid] < target) {
                left = mid + 1;
            }
            else {
                return true;
            }
        }


        return false;
    }
}
