package suanfa;

public class Bag01 {
    public static void main(String[] args) {
        int m = 10;

        int n = 3;


        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = backPack(m, n, w, p);
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=m; j++) {
                System.out.print(c[i][j]+"\t");
                if(j==m){
                    System.out.println();
                }
            }
        }
    }

    private static int[][] backPack(int maxCapacity,int itemNum,int[] weight,int[] value){

        int[][]  dp=new int[itemNum+1][maxCapacity+1];
        for (int i = 0; i <itemNum+1 ; i++) {
            dp[itemNum][0]=0;
        }
        for (int i = 0; i <maxCapacity+1 ; i++) {
            dp[0][maxCapacity]=0;
        }

        for (int i = 1; i <itemNum+1 ; i++) {
            for (int j = 1; j <maxCapacity+1 ; j++) {
                if (weight[i-1]<=j){
                    if (dp[i - 1][j] < dp[i - 1][j - weight[i - 1]] + value[i - 1])
                        dp[i][j]=dp[i - 1][j - weight[i - 1]] + value[i - 1];
                    else
                        dp[i][j]=dp[i - 1][j];


                }
                else{
                    dp[i][j]=dp[i - 1][j];
                }
            }

        }
        return dp;
    }
}
