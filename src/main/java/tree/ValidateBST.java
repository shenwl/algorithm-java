package tree;

import base.TreeNode;

/**
 * leetcode 98
 * https://leetcode-cn.com/problems/validate-binary-search-tree/
 * 解法：中序遍历
 */
public class ValidateBST {
    long pre = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if(!isValidBST(root.left)) {
            return false;
        }

        if(root.val <= pre) {
            return false;
        }

        pre = root.val;

        return isValidBST(root.right);
    }
}
