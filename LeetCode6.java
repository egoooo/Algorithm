package suanfa;

import java.util.ArrayList;
import java.util.List;

public class LeetCode6 {
    public static void main(String[] args) {
        convert("leetcode",3);

    }

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
