package camstructures;

public class Node {
	Node left;
	Node right;
	County info;
	
	//AKA TreeNode
	public Node(County info) {
		this.info = info;
	}
	
	public String toString() {
		return "" + info.key;
	}
}
