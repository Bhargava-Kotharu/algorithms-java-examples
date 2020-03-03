package com.bkotharu.tree.algorithms;

/**
 * Depth First Search
 * 
 * @author bhargavakotharu
 *
 */
public class DepthFirstSearch {

	/**
	 * The In-order traversal consists of first visiting the left sub-tree, then the
	 * root node, and finally the right sub-tree
	 */
	public void inOrderTraversal(Node node) {

		if (node != null) {
			inOrderTraversal(node.left);
			System.out.println(node.value);
			inOrderTraversal(node.right);
		}
	}

	/**
	 * The Pre-order traversal visits first the root node, then the left subtree,
	 * and finally the right subtree
	 */
	public void preOrderTraversal(Node node) {

		if (node != null) {
			System.out.println(node.value);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}

	/**
	 * The Post-order traversal visits the left subtree, the right subtree, and the
	 * root node at the end
	 */
	public void postOrderTraversal(Node node) {
		if (node != null) {
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			System.out.println(node.value);
		}
	}

	public static BinaryTree createBinaryTree() {
		BinaryTree tree = new BinaryTree();
		tree.add(6);
		tree.add(4);
		tree.add(8);
		tree.add(3);
		tree.add(5);
		tree.add(7);
		tree.add(9);

		return tree;
	}

	public static void main(String[] args) {
		DepthFirstSearch dfs = new DepthFirstSearch();

		System.out.println("In-Order Traversal: ");
		dfs.inOrderTraversal(createBinaryTree().getRoot());

		System.out.println("Pre-Order Traversal: ");
		dfs.preOrderTraversal(createBinaryTree().getRoot());

		System.out.println("Post-Order Traversal: ");
		dfs.postOrderTraversal(createBinaryTree().getRoot());
	}
}
