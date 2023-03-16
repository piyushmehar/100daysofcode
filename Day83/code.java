// 106. Construct Binary Tree from Inorder and Postorder Traversal
// Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.

 
class Solution 
{
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    if (inorder.length == 0 || postorder.length == 0) return null;
    
    int ip = inorder.length - 1;
    int pp = postorder.length - 1;

    Stack<TreeNode> stack = new Stack<TreeNode>();
    TreeNode prev = null;
    TreeNode root = new TreeNode(postorder[pp]);
    stack.push(root);
    pp--;

    while (pp >= 0) {
        while (!stack.isEmpty() && stack.peek().val == inorder[ip]) {
            prev = stack.pop();
            ip--;
        }
        TreeNode newNode = new TreeNode(postorder[pp]);
        if (prev != null) {
            prev.left = newNode;
        } else if (!stack.isEmpty()) {
            TreeNode currTop = stack.peek();
            currTop.right = newNode;
        }
        stack.push(newNode);
        prev = null;
        pp--;
    }

    return root;
    }
}
