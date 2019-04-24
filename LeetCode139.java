package suanfa;


import java.util.Arrays;
import java.util.List;

public class LeetCode139 {

    public static void main(String[] args) {
       String  s = "applepenapple";
       String[] wordDict = {"apple", "pen"};
       List<String> strsToList1= Arrays.asList(wordDict);
       wordBreak(s,strsToList1);
       System.out.println(wordBreak(s,strsToList1));//true

    }

    /**LeetCode 139. 单词拆分
     * 给定一个非空字符串 s 和一个包含非空单词列表的字典 wordDict，
     * 判定 s 是否可以被空格拆分为一个或多个在字典中出现的单词。
     * @param s
     * @param wordDict
     * @return
     */

    public static boolean wordBreak(String s, List<String> wordDict) {
// 可以类比于背包问题
        int n = s.length();
        // memo[i] 表示 s 中以 i - 1 结尾的字符串是否可被 wordDict 拆分
        boolean[] memo = new boolean[n + 1];
        memo[0] = true;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (memo[j] && wordDict.contains(s.substring(j, i))) {
                    memo[i] = true;
                    break;
                }
            }
        }
        return memo[n];
    }
}
