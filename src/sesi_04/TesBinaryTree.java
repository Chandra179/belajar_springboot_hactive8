package sesi_04;

import java.util.Scanner;

public class TesBinaryTree {
	// first node
	static Node root;

	TesBinaryTree() {
		root = null;
	}

	// Class representing tree nodes
	static class Node {
		int value;
		Node left;
		Node right;

		Node(int value) {
			this.value = value;
			left = null;
			right = null;
		}
	}

	/*
	 * overload insert constructor insert (int i) | | memanggil V insert (Node node,
	 * int value)
	 */

	public void insert(int i) {
		// root awal == null
		// ex: null, 34
		// karena node awal null maka nilai yang baru akan di assign ke root = 34
		root = insert(root, i);
	}

	// null 34 Node(34)

	// 34 56 - - 56>34
	// 34.right = null 56
	// 34.right = 56 56
	// 34.left = null
	// 34 {left: null, right: 56}

	// 34 89
	// 34.right = 56 89
	// 34 {left: null, right: 56.right = 89}

	// 34 56 89

	public Node insert(Node node, int value) {

		// node baru
		if (node == null) {
			return new Node(value);
		}
		if (value < node.value) {
			node.left = insert(node.left, value);
		} else if (value > node.value) {
			node.right = insert(node.right, value);
		}
		return node;
	}

	// Search node in binary search tree
	public Node find(int searchedValue) {
		Node current = root;
		while (current.value != searchedValue) {
			if (searchedValue < current.value)
				// Move to the left if searched value is less
				current = current.left;
			else
				// Move to the right if searched value is >=
				current = current.right;
			if (current == null) {
				return null;
			}
		}
		return current;
	}

	public static void main(String[] args) {

		TesBinaryTree bst = new TesBinaryTree(); // membuat obj dengan memanggil class sendiri
		Scanner scan = new Scanner(System.in);
		ViewOrder view = new ViewOrder();

		int inputNode;

		int menu = 1;

		while (menu != 3) {
			System.out.println("1. Input");
			System.out.println("2. View");
			System.out.println("3. Exit");
			System.out.print("Input : ");

			menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.print("Masukan Angka : ");
				inputNode = scan.nextInt();
				bst.insert(inputNode);
			case 2:
				//
			case 3:
				break;
			}
			System.out.println("\n");
		}
	}
}
