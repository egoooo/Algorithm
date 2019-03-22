package suanfa;

import java.util.Scanner;

public class MaximumLength {
    public static void main(String[] args) {
        MaximumLength maximumLength=new MaximumLength();
        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            String s=scanner.next();
            System.out.println("输入第一个字符串："+s);
            String s1=scanner.next();
            System.out.println("输入第二个字符串："+s1);
            System.out.println("最长公共子串为：");
            System.out.println(maximumLength.lcst(s,s1));
        }

    }

    /**
     *
     * @param str1
     * @param str2
     * @return dp矩阵
     */
    public int[][] getdp(char[] str1,char[] str2){
        int[][] dp=new int[str1.length][str2.length];
        for (int i = 0; i <str1.length ; i++) {
            if (str1[i]==str2[0]){
                dp[i][0]=1;
            }
        }

        for (int j = 0; j <str2.length ; j++) {
            if (str2[j]==str1[0]){
                dp[0][j]=1;
            }
        }

        for (int i = 1; i <str1.length ; i++) {
            for (int j = 1; j <str2.length ; j++) {
                if (str1[i]==str2[j]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }

            }

        }
        return dp;
    }


    /**
     *
     * @param str1
     * @param str2
     * @return 最长公共子串
     */
    public String lcst(String str1,String str2){
        if (str1==null||str2==null||str1.equals("")||str2.equals("")){
            return "";
        }
        char[] chars1=str1.toCharArray();
        char[] chars2=str2.toCharArray();
        int[][] dp=getdp(chars1,chars2);
        int end =0;
        int max=0;
        for (int i = 0; i <chars1.length ; i++) {
            for (int j = 0; j <chars2.length ; j++) {
                if (dp[i][j]>max){
                    max=dp[i][j];
                    end=i;
                }
            }

        }
        return str1.substring(end-max+1,end+1);
    }
}
