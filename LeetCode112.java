package suanfa;

public class LeetCode112 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    /**
     * 给定一个二叉树和一个目标和，
     * 判断该树中是否存在根节点到叶子节点的路径，
     * 这条路径上所有节点值相加等于目标和。
     * @param root
     * @param sum
     * @return
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
            return  false;
        if (root.left==null&&root.right==null){
            return sum-root.val==0;
        }
        return hasPathSum(root.left,sum-root.val)
                ||hasPathSum(root.right,sum-root.val);
    }

}



