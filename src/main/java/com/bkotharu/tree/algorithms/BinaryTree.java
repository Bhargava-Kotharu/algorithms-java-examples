package com.bkotharu.tree.algorithms;

/**
 * BinaryTree Implementation
 * 
 * @author bhargavakotharu
 *
 */
public class BinaryTree {

	private Node root;

	public void add(int value) {
		root = this.addNode(root, value);
	}

	public void delete(int value) {
		deleteRecursive(root, value);
	}

	public int getSize() {
		return getSizeRecursive(root);
	}

	public boolean contains(int value) {
		return containsRecursive(root, value);
	}

	public int findLargestValue() {
		return findLargestValueRecursive(root);
	}

	public int findSmallestValue() {
		return findSmallestValueRecursive(root);
	}

	public Node getRoot() {
		return root;
	}

	public boolean isEmpty() {
		return root == null ? true : false;
	}

	public int getOccurances(int value) {
		return getOccurancesRecursive(root, value, 0);
	}

	private Node addNode(Node currentNode, int value) {

		// Root node if currentNode is null
		if (currentNode == null) {
			return new Node(value);
		}

		// If new value is less than current value.. traverse to left child and continue
		if (value < currentNode.value) {
			currentNode.left = addNode(currentNode.left, value);
		} else if (value >= currentNode.value) {
			// If new value is greater than or equal to current value.. traverse to right
			// child and continue
			currentNode.right = addNode(currentNode.right, value);
		}

		return currentNode;

	}

	private Node deleteRecursive(Node currentNode, int value) {

		if (currentNode == null)
			return null;

		if (value == currentNode.value) {
			// Delete node and re-order if required.
			System.out.println("Deleting..." + value);

			// No Children
			if (currentNode.left == null && currentNode.right == null) {
				return null;
			}

			// One children
			if (currentNode.left == null)
				return currentNode.right;
			else if (currentNode.right == null)
				return currentNode.left;

			// 2 Childern
			int smallestValue = findSmallestValueRecursive(currentNode.right);
			currentNode.value = smallestValue;
			currentNode.right = deleteRecursive(currentNode.right, smallestValue);
			return currentNode;
		}

		if (value < currentNode.value) {
			currentNode.left = deleteRecursive(currentNode.left, value);
			return currentNode;
		}

		currentNode.right = deleteRecursive(currentNode.right, value);
		return currentNode;
	}

	private int getSizeRecursive(Node currentNode) {
		return currentNode == null ? 0 : getSizeRecursive(currentNode.left) + getSizeRecursive(currentNode.right) + 1;
	}

	public int findSmallestValueRecursive(Node node) {
		return node.left == null ? node.value : findSmallestValueRecursive(node.left);
	}

	public int findLargestValueRecursive(Node node) {
		return node.right == null ? node.value : findLargestValueRecursive(node.right);
	}

	private boolean containsRecursive(Node currentNode, int value) {
		if (currentNode == null)
			return false;

		if (value == currentNode.value)
			return true;

		return value < currentNode.value ? containsRecursive(currentNode.left, value)
				: containsRecursive(currentNode.right, value);

	}

	// Not working
	private int getOccurancesRecursive(Node currentNode, int value, int count) {

		if (currentNode == null)
			return 0;

		if (currentNode.value == value)
			count = count + 1;

		if (value > currentNode.value)
			getOccurancesRecursive(currentNode.right, value, count);
		else
			getOccurancesRecursive(currentNode.left, value, count);

		return count;

	}

	@Override
	public String toString() {
		return "BinaryTree [root=" + root + "]";
	}

}
