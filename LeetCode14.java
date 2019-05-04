package suanfa;

public class LeetCode14 {
    public static void main(String[] args) {
        String[] strings=new String[]{"flower","flow","flight"};
         System.out.println(longestCommonPrefix(strings));
        String[] strings1=new String[]{"cog","dacecar","dar"};
        System.out.println(longestCommonPrefix(strings1)+"---");
    }

    public static String longestCommonPrefix(String[] strs) {

        if (strs.length==0)
            return "";
        int length=strs.length;
        String pre=strs[0];
        for (int i = 1; i <length ; i++) {
            while (strs[i].indexOf(pre)!=0){
                pre=pre.substring(0,pre.length()-1);
                if (pre=="") return "";
            }
        }
        return pre;

    }
}
