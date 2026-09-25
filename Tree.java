public class Tree {
  static void display(TreeNode root, int space) {
    if (root == null) {
      return;
    }
    display(root.right, space + 5);
    System.out.println();
    for (int i = 0; i < space; i++) {
      System.out.print(" ");
    }
    System.out.println(root.data);
    display(root.left, space + 5);
  }

  public static void main(String[] args) {
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(20);
    root.right = new TreeNode(30);
    root.left.left = new TreeNode(40);
    root.left.right = new TreeNode(50);
    display(root, 0);
  }
}
