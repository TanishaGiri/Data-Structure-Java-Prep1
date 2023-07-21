public class SpiralMatrix {
    public static void solve(int [][] matrix, int n){
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<endRow && startCol<endCol){
            for(int i=startCol; i<endCol; i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            for(int i=startRow; i<endRow; i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            for(int i=endCol; i>=startCol; i--){
                System.out.print(matrix[endRow][i]+" ");
            }
            for(int i=endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol]+" ");
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        solve(matrix, matrix.length);

    }
}
