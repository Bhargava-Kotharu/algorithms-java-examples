package com.bkotharu.tree.algorithms;

/**
 * Node - Represents a node in a Tree
 * 
 * @author bhargavakotharu
 *
 */
public class Node {

	public int value;
	public Node left;
	public Node right;

	public Node(int value) {
		this.value = value;
		left = null;
		right = null;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
	}

}
