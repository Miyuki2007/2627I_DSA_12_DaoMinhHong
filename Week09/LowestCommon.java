package Week09;

import java.util.Scanner;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}
public class LowestCommon {
    public static TreeNode insert(TreeNode root, int data) {
        if (root == null) {
            return new TreeNode(data);
        } else {
            TreeNode cur;
            if (data <= root.val) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static TreeNode lowestCommon(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        if (p.val < root.val && q.val < root.val) {
            return lowestCommon(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val) {
            return lowestCommon(root.right, p, q);
        }
        return root;
    }
    public static TreeNode findNode(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        if (val < root.val) return findNode(root.left, val);
        return findNode(root.right, val);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        TreeNode root = null;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }
        int valP = sc.nextInt();
        int valQ = sc.nextInt();

        TreeNode p = findNode(root, valP);
        TreeNode q = findNode(root, valQ);
        TreeNode kq = lowestCommon(root, p, q);
        System.out.println(kq.val);
    }
}