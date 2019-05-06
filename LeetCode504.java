package suanfa;

/**
 * 10进制转2进制	Integer.toBinaryString(n);	一个二进制字符串.
 * 10进制转8进制	Integer.toOctalString(n);	一个八进制字符串
 * 10进制转16进制	Integer.toHexString(n);	一个16进制字符串
 * 10进制转 r 进制	Integer.toString(100, 16);	一个r进制字符串
 * ---------------------
 *
 */

public class LeetCode504 {

    public static void main(String[] args) {
        System.out.println(convertToBase7(-14));
        System.out.println(myDec(31,16));


    }

    public static String convertToBase7(int num) {
        boolean isNegative= false;
        if (num==0){
            return "0";
        }
        if (num<0){
            num=-num;
            isNegative=true;
        }
        String str="";
        while (num>0){
            str=num%7+str;
            num=num/7;
        }

        return isNegative? "-"+str:str;



    }

    private static char[] array = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            .toCharArray();

    /**
     * 任意进制转换  十进制 ——————> n进制
     * @param number
     * @param n 正整数
     * @return
     */
    public static String myDec(int number, int n) {
        // String 是不可变的，每次改变都要新建一个Strng，很浪费时间。
        // StringBuilder是‘可变的String’ ,
        StringBuilder result = new StringBuilder();
        // 模拟计算进制的过程
        while (number > 0) {
            result.insert(0, array[number % n]);
            number /= n;
        }
        return result.toString();
    }


}
