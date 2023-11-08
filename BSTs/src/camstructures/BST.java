package camstructures;

public class BST {
	Node root;

	public BST() {
		root = null;
	}

	public BST(Node root) {
		this.root = root;
	}

	Node insert(County content, Node root) {
		if (root == null) { // ^ base case
			return new Node(content);
		} else if (content.FIPS < root.info.FIPS) { // if content is less than, we move to the left node
			root.left = insert(content, root.left);
		} else if (content.FIPS > root.info.FIPS) { // if > move to right node
			root.right = insert(content, root.right);
		}
		return root;
	}
	
	void insert(County content) {
		insert(content, root);
	}
	
	void inorder(Node root) {
		if (root == null)a
			return;
		inorder(root.left);
		System.out.print(root);
		inorder(root.right);
	}
}
