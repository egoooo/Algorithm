package suanfa;

public class Leetcode26 {
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,5,6,6,7,7,8};
        int len=removeDuplicates(a);
        System.out.println();
        for (int i = 0; i <len ; i++) {
            System.out.print(a[i]+" ");

        }

    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length==0) return 0;
        int i=0;
        for (int j = 1; j <nums.length ; j++) {
            if (nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }

        return i+1;
    }
}
