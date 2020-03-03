package com.bkotharu.tree.algorithms;

public class TestBinaryTree {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		DepthFirstSearch dfs = new DepthFirstSearch();
		tree.add(6);
		tree.add(4);
		tree.add(8);
		tree.add(3);
		tree.add(5);
		tree.add(7);
		tree.add(9);

		dfs.inOrderTraversal(tree.getRoot());

		System.out.println(tree);

		System.out.println("isEmpty " + tree.isEmpty());

		System.out.println("Size is " + tree.getSize());

		System.out.println("Contains " + tree.contains(10));

		System.out.println("Contains " + tree.contains(21));

		System.out.println(tree.getOccurances(10));

		System.out.println(tree.getOccurances(5));

		System.out.println("Smallest Value is " + tree.findSmallestValue());

		System.out.println("Largest Value is " + tree.findLargestValue());

		tree.delete(5);

		System.out.println(tree);

		System.out.println("Size is " + tree.getSize());
		
		tree.delete(2);

		System.out.println(tree);

		System.out.println("Size is " + tree.getSize());
		
		tree.delete(10);
		tree.delete(10);

		System.out.println(tree);

		System.out.println("Size is " + tree.getSize());
	}
}
