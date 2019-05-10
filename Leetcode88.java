package suanfa;

public class Leetcode88 {
    public static void main(String[] args) {
        int[] a={1,3,5,0,0,0,0};
        int[] b={2,4,7,9};
        merge(a,3,b,4);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int t=0;
        int[] temp=new int[m+n];
        while (i<m&&j<n){
            if (nums1[i]<nums2[j]){
                temp[t++]=nums1[i++];
            }else {
                temp[t++]=nums2[j++];
            }
        }

        while (i<m){
            temp[t++]=nums1[i++];
        }
        while(j<n){
            temp[t++]=nums2[j++];
        }


        for (int l = 0; l <m+n ; l++) {
            nums1[l]=temp[l];
            System.out.print(nums1[l]+"-");
        }


    }
}
