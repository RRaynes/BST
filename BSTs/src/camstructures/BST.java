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
		if (root == null) {
			return new Node(content);
		}
		if (content.key > root.info.key) {
			root.right = insert(content, root.right); // insert to the right, set right equal to it to remeber it
		} else if (content.key < root.info.key) {
			root.left = insert(content, root.left); // same as above but to the left
		}
		return root; // sets root to itself, nothing is changed
	}

	void insert(County content) {
		root = insert(content, root);
	}

	Node delete(County content, Node root) {
		if (root == null) {
			return root; // unsuccessful search
		}
		if (content.key > root.info.key) {
			root.right = delete(content, root.right);
			return root;
		} else if (content.key < root.info.key) {
			root.left = delete(content, root.left);
			return root;
		} else {
			// case 2 & 3, we found the node
			// case 2, one child
			if (root.right == null)
				return root.left;
			else if (root.left == null)
				return root.right;
			// case 3 inorder predeccessor
			else {
				if (root.left.right == null)
					return root.left;
				else {
					if (root.left.right == null) {
						root.info = root.left.info;
						root.left = root.left.left;
						return root;
					} else {
						root.info = findLAR(root.left);
						return root;
					}
				}
			}
		}
	}

	County findLAR(Node root) {
		if (root.right.right == null) {
			County returnValue = root.right.info;
			root.right = root.right.left; // we pick up the value but
			return returnValue;
		} else { // recursion case
			return findLAR(root.right);
		}

	}

	void delete(County content) {
		root = delete(content, root);
	}

	void inorder(Node root) {
		if (root == null)
			return; // end of recursion, return
		inorder(root.left);
		System.out.print(root + " ");
		inorder(root.right);
	}

	void inorder() {
		System.out.print("inorder: ");
		inorder(root);
		System.out.println();
	}

	void preorder() {
		System.out.print("preorder: ");
		preorder(root);
		System.out.println();
	}

	void preorder(Node root) {
		if (root == null)
			return; // end of recursion, return
		System.out.print(root + " ");
		preorder(root.left);
		preorder(root.right);
	}
}
