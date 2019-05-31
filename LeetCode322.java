package suanfa;

public class LeetCode322 {
    public static void main(String[] args) {

    }

    /**
     * 给定不同面额的硬币 coins 和一个总金额 amount。
     * 编写一个函数来计算可以凑成总金额所需的最少的硬币个数。
     * 如果没有任何一种硬币组合能组成总金额，返回 -1
     * 你可以认为每种硬币的数量是无限的。
     * @param coins
     * @param amount
     * @return
     */
    public static int coinChange(int[] coins, int amount) {

        if (coins==null||coins.length==0||amount<=0) return 0;
        int[] dp =new int[amount+1];
        dp[0]=0;
        for (int i = 1; i <=amount ; i++) {
            dp[i]=Integer.MAX_VALUE;
            for (int j = 0; j <coins.length ; j++) {
                if (coins[j]<=i&&dp[i-coins[j]]!=Integer.MAX_VALUE){
                    dp[i]=Integer.min(dp[i-coins[j]]+1,dp[i]);

                }

            }



        }
        if (dp[amount]==Integer.MAX_VALUE) return -1;
        return dp[amount];

    }
}
