package tree;
import base.TreeNode;

/**
 * leetcode 235 easy
 * https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 */
public class LowestCommonAncestorOfBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;

        TreeNode LowestAncestor = root;

        while(LowestAncestor.left != null && LowestAncestor.right != null) {
            int LowestAncestorVal = LowestAncestor.val;

            if(LowestAncestorVal < p.val && LowestAncestorVal < q.val) {
                LowestAncestor = LowestAncestor.right;
                continue;
            }
            if(LowestAncestorVal > p.val && LowestAncestorVal > q.val) {
                LowestAncestor = LowestAncestor.left;
                continue;
            }
            break;
        }
        return LowestAncestor;
    }
}
