package suanfa;

public class LeetCode110 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        System.out.println(isBalanced(root));
/**
 *        1
 *      /  \
 *     2    3
 *           \
 *            4
 *             \
 *              5
 */
    }


    /**
     * 给定一个二叉树，判断它是否是高度平衡的二叉树。
     *
     * 本题中，一棵高度平衡二叉树定义为：
     *
     * 一个二叉树 每个节点 的左右两个子树的高度差的绝对值不超过1。
     * @param root
     * @return
     */

    public static boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        int left=0;
        int right=0;
        if (root.left!=null)
            left=depth(root.left);
        if (root.right!=null)
            right=depth(root.right);
        if (Math.abs(left-right)>1) return false;
        else return isBalanced(root.left)&&isBalanced(root.right);

    }


    public static int depth(TreeNode root){
        if(root==null)
            return 0;
        int left=0,right=0;
        if(root.left!=null)
            left=depth(root.left);
        if(root.right!=null)
            right=depth(root.right);
        return Math.max(left,right)+1;
    }


    public static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
   }
}
