package AmazonCodingPractice;

public class NumberOfIsland {
    public NumberOfIsland() {
        int[][] grid = new int[4][5];
        grid[0][0] = 1;
        grid[0][1] = 1;
        grid[0][2] = 0;
        grid[0][3] = 0;
        grid[0][4] = 0;

        grid[1][0] = 1;
        grid[1][1] = 1;
        grid[1][2] = 0;
        grid[1][3] = 0;
        grid[1][4] = 0;

        grid[2][0] = 0;
        grid[2][1] = 0;
        grid[2][2] = 1;
        grid[2][3] = 0;
        grid[2][4] = 0;

        grid[3][0] = 0;
        grid[3][1] = 0;
        grid[3][2] = 0;
        grid[3][3] = 1;
        grid[3][4] = 1;

        System.out.println(islands(grid));
    }
    public int islands(int[][] grid) {
        int rows = grid.length;
        if (rows == 0) {
            return 0;
        }
        int cols = grid[0].length;
        int numbreOfIslands = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    numbreOfIslands++;
                    markGrid(grid, i, j, rows, cols);
                }
            }
        }

        return numbreOfIslands;
    }

    public void markGrid(int[][] grid, int i, int j, int rows, int cols) {
        if (i<0 || i >= rows || j < 0 || j >= cols || grid[i][j] != 1) {
            return;
        }

        grid[i][j] = 2;
        markGrid(grid, i+1, j, rows, cols);
        markGrid(grid, i, j+1, rows, cols);
        markGrid(grid, i -1, j, rows, cols);
        markGrid(grid, i, j - 1, rows, cols);
    }
}
