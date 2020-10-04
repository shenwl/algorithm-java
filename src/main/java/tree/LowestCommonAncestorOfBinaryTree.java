package tree;

import base.TreeNode;

/**
 * leetcode 236 mid
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree/
 */
public class LowestCommonAncestorOfBinaryTree {
    TreeNode ans;

    public boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;
        boolean sonL = dfs(root.left, p, q);
        boolean sonR = dfs(root.right, p, q);
        if (sonL && sonR) {
            ans = root;
        }
        if ((root.val == p.val || root.val == q.val) && (sonL || sonR)) {
            ans = root;
        }
        if ((root.val == p.val || root.val == q.val)) {
            return true;
        }
        return sonL || sonR;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }
}
