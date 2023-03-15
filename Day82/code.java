// 958. Check Completeness of a Binary Tree
// Given the root of a binary tree, determine if it is a complete binary tree.
// In a complete binary tree, every level, except possibly the last, is completely filled, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
  
  
class Solution {
  
  public boolean isCompleteTree(TreeNode root) {
    if (root == null)
      return true;

    Queue<TreeNode> q = new LinkedList<>(Arrays.asList(root));

    while (q.peek() != null) {
      TreeNode node = q.poll();
      q.offer(node.left);
      q.offer(node.right);
    }

    while (!q.isEmpty() && q.peek() == null)
      q.poll();

    return q.isEmpty();
  }
}
