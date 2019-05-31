package suanfa;

import java.util.ArrayList;
import java.util.List;

public class LeetCode6 {
    public static void main(String[] args) {
        convert("leetcode",3);

    }

    /**
     *将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
     *
     * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
     *
     * L   C   I   R
     * E T O E S I I G
     * E   D   H   N
     * 之后，你的输出需要从左往右逐行读取，
     * 产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
     * @param s
     * @param numRows
     * @return
     */

    public static String convert(String s, int numRows) {

        if (numRows==1)return s;
        List<StringBuffer> rows=new ArrayList<>();
        for (int i = 0; i <Math.min(s.length(),numRows) ; i++) {
            rows.add(new StringBuffer());
        }
        int curRow=0;
        boolean goDown=false;
        char[] chars=s.toCharArray();
        for (char c: chars) {
            rows.get(curRow).append(c);
            if (curRow==0||curRow==numRows-1) goDown=!goDown;
            curRow=curRow+(goDown?1:-1);

        }

        StringBuffer res= new StringBuffer();
        for (StringBuffer stringBuffer:
             rows) {
            res.append(stringBuffer);

        }
        System.out.println(res.toString());
        return  res.toString();
    }
}
