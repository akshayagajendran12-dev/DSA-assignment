
public class BusiestBusRow {

    public static int busiestRow(int[][] grid) {
        int bestRow = 0;
        int bestTotal = -1;

        for (int i = 0; i < grid.length; i++) {
            int total = 0;

            for (int j = 0; j < grid[i].length; j++) {
                total += grid[i][j];
            }

            if (total > bestTotal) {
                bestTotal = total;
                bestRow = i;
            }
        }

        return bestRow;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {2, 0, 1},
            {3, 3, 1},
            {1, 1, 1}
        };

        int row = busiestRow(grid);
        int total = 0;

        for (int seat : grid[row]) {
            total += seat;
        }

        System.out.println("Row " + row + ", Total " + total);
    }
}

// Time Complexity: O(r * c)
// Additional Space Complexity: O(1)
