package com.poc.binaryTree;

public class BinaryTree {

    private TreeNode root;

    private static class TreeNode {

        private TreeNode left;
        private TreeNode right;
        private final int data;

        TreeNode(int data) {
            this.data = data;
        }
    }

    //create binary tree
    public void createBinaryTree()
    {
        TreeNode first= new TreeNode(9);
        TreeNode second= new TreeNode(2);
        TreeNode third= new TreeNode(3);
        TreeNode fourth= new TreeNode(4);
        TreeNode fiveth= new TreeNode(7);
        TreeNode sixth= new TreeNode(5);

        root=first; // root ----> first
        first.left=second;
        first.right=third; // second <--- first --->third

        second.left=fourth;
        second.right=fiveth;

        third.left=sixth;
    }

    //create preOrder
    public void preOrder(TreeNode root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //check empty
    public void isEmpty(){
        if (this.root==null){

        }
    }
    public static void main(String[] args) {
    BinaryTree tree=new BinaryTree();
    tree.createBinaryTree();
    //tree.preOrder(tree.root);
    }
}
