package suanfa;

public class LeetCode264 {
    public static void main(String[] args) {

    }

    /**
     * 编写一个程序，找出第 n 个丑数。
     *
     * 丑数就是只包含质因数 2, 3, 5 的正整数。
     *
     * 动态规划
     * @param n
     * @return
     */

    public static int nthUglyNumber(int n) {
        int[] dp=new int[n];
        dp[0]=1;
        int i2=0;
        int i3=0;
        int i5=0;
        for (int i = 1; i <n ; i++) {
            int min=Math.min(dp[i2]*2,Math.min(dp[i3]*3,dp[i5]*5));
            dp[i]=min;
            if (dp[i2]*2==min) i2++;
            if (dp[i3]*3==min) i3++;
            if (dp[i5]*5==min) i5++;


        }
        return dp[n-1];

    }
}
