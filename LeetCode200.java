package suanfa;

/**
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，
 * 计算岛屿的数量。
 * 一个岛被水包围，
 * 并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。
 * 你可以假设网格的四个边均被水包围。
 *
 * 示例 1:
 *
 * 输入:
 * 11110
 * 11010
 * 11000
 * 00000
 * 输出: 1
 *
 * 示例 2:
 * 输入:
 * 11000
 * 11000
 * 00100
 * 00011
 * 输出: 3
 */
public class LeetCode200 {
    private int m=0;
    private int n=0;

    public int numIslands(char[][] grid) {
        int count =0;
        m=grid.length;
        if (m==0) return 0;
        n=grid[0].length;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
                if (grid[i][j]=='1'){
                    DFSMarking(grid,i,j);
                    count++;
                }
            }
        }

        return count;
    }


    private void DFSMarking(char[][] grid, int i, int j) {
        if (i<0||j<0||i>=m||j>=n||grid[i][j]!='1'){
            return;
        }
        grid[i][j] = 'X';
        DFSMarking(grid,i+1,j);
        DFSMarking(grid,i-1,j);
        DFSMarking(grid,i,j+1);
        DFSMarking(grid,i,j-1);


    }

}
