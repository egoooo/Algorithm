package suanfa;

public class StoneGame {
    public static void main(String[] args) {


        stoneGame1(new int[]{2,3,4,2});
    }

    /**
     * 亚历克斯和李用几堆石子在做游戏。偶数堆石子排成一行，每堆都有正整数颗石子 piles[i] 。
     * <p>
     * 游戏以谁手中的石子最多来决出胜负。石子的总数是奇数，所以没有平局。
     * <p>
     * 亚历克斯和李轮流进行，亚历克斯先开始。 每回合，玩家从行的开始或结束处取走整堆石头。 这种情况一直持续到没有更多的石子堆为止，此时手中石子最多的玩家获胜。
     * <p>
     * 假设亚历克斯和李都发挥出最佳水平，当亚历克斯赢得比赛时返回 true ，当李赢得比赛时返回 false 。
     *
     * @param piles
     * @return
     */

    public static boolean stoneGame1(int[] piles) {
        int n = piles.length;

        // dp[i+1][j+1] = the value of the game [piles[i], ..., piles[j]].
        int[][] dp = new int[n][n];

        for(int i = 0; i < n; i++){
            dp[i][i] = piles[i];
        }
        for(int i = 1; i < n; i++){

            for(int j = 0; j < n - i; j++){

                System.out.print("当前石子堆:");
                for (int k = j; k <=j+i ; k++) {
                    System.out.print(piles[k]+" ");
                }
                dp[j][j + i] = Math.max(piles[j] - dp[j + 1][j + i], piles[j + i] - dp[j][j + i - 1]);
                System.out.println("dis"+j+"to"+(j+i)+"= max piles"+j+"-dp"+(j+1)+(j+i)+" or piles"+(j+i)+"-dp"+(j)+(j+i-1)+" alex win :"+dp[j][j + i]);
            }
        }


        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[0][n - 1] > 0;
    }
}

