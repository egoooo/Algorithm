package suanfa;

import java.util.Scanner;

public class LeetCode165 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        while (scanner.hasNext()){
            String a= scanner.next();
            String b=scanner.next();
           int c= compareVersion(a,b);
            System.out.println(c);
        }

    }

    /**
     * 比较两个版本号 version1 和 version2。
     * 如果 version1 > version2 返回 1，
     * 如果 version1 < version2 返回 -1，
     * 除此之外返回 0。
     *
     * 你可以假设版本字符串非空，并且只包含数字和 . 字符。
     * @param version1
     * @param version2
     * @return
     */

    public static int compareVersion(String version1, String version2){
        String[] v1=version1.split("\\.");
        String[] v2=version2.split("\\.");
        for (int i = 0; i <Math.max(v1.length,v2.length) ; i++) {
            int one =(i<v1.length? Integer.valueOf(v1[i]):0);
            int two =(i<v2.length? Integer.valueOf(v2[i]):0);
            if (one>two)
                return 1;
            if (two>one)
                return -1;



        }
        return 0;
    }
}
