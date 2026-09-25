public class TreeTraversal {
  static void preorder(TreeNode root) {
    if (root == null) {
      return;
    }
    System.out.print(root.data + " ");
    preorder(root.left);
    preorder(root.right);
  }

  static void postorder(TreeNode root) {
    if (root == null) {
      return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data + " ");
  }

  static void inorder(TreeNode root) {
    if (root == null) {
      return;
    }
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(20);
    root.right = new TreeNode(30);
    root.left.left = new TreeNode(40);
    root.left.right = new TreeNode(50);
    System.out.print("Preorder : ");
    preorder(root);
    System.out.print("\n\nInorder : ");
    inorder(root);
    System.out.print("\n\nPostorder : ");
    postorder(root);
  }
}
