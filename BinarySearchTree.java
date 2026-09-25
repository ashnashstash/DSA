import java.util.Scanner;

public class BinarySearchTree {
  static TreeNode insert(TreeNode root, int value) {
    if (root == null) {
      return new TreeNode(value);
    }
    if (value < root.data) {
      root.left = insert(root.left, value);
    } else {
      root.right = insert(root.right, value);
    }
    return root;
  }

  static boolean search(TreeNode root, int value) {
    if (root == null) {
      return false;
    }
    if (root.data == value) {
      return true;
    }
    if (value < root.data) {
      return search(root.left, value);
    } else {
      return search(root.right, value);
    }
  }

  static TreeNode delete(TreeNode root, int value) {
    if (root == null) {
      return root;
    }
    if (value < root.data) {
      root.left = delete(root.left, value);
    } else if (value > root.data) {
      root.right = delete(root.right, value);
    } else {
      if (root.left == null && root.right == null) {
        return null;
      }
      if (root.left == null) {
        return root.right;
      }
      if (root.right == null) {
        return root.left;
      }
      TreeNode successor = findMin(root.right);
      root.data = successor.data;
      root.right = delete(root.right, successor.data);
    }
    return root;
  }

  static TreeNode findMin(TreeNode root) {
    while (root.left != null) {
      root = root.left;
    }
    return root;
  }

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
    Scanner sc = new Scanner(System.in);
    TreeNode root = null;
    System.out.print("Enter number of nodes : ");
    int n = sc.nextInt();
    System.out.print("Enter values : ");
    for (int i = 0; i < n; i++) {
      int value = sc.nextInt();
      root = insert(root, value);
    }
    System.out.println("\nTree : ");
    display(root, 0);
    System.out.print("Enter value to search : ");
    int searchValue = sc.nextInt();
    boolean found = search(root, searchValue);
    System.out.print("Is the element in the tree : " + found);
    System.out.print("\nElement to be deleted : ");
    int deleteValue = sc.nextInt();
    delete(root, deleteValue);
    display(root, 0);
  }
}


/*
 * 
 * binary search tree
 * left < root < right
 * 
 * inorder traversal
 * 
 */
