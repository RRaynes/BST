package camstructures;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		County c1 = new County("Franklin","049","Columbus",1264518,539.87);
		County c2 = new County("Hamilton","061","Cincinnati",802374,407.36);
		County c3 = new County("Butler","017","Hamilton",368130,467.27);
		County c4 = new County("Montgomery","113","Dayton",535153,461.68);
		County c5 = new County("Clinton","027","Wilmington",42040,410.88);
		
		County c6 = new County("Cuyahoga","035","Cleveland",1249352,458.49);
		
		BST t1 = new BST();
		System.out.println("Inserting 5 counties");
		t1.insert(c1);
		t1.insert(c2);
		t1.insert(c3);
		t1.insert(c4);
		t1.insert(c5);
		t1.preorder();
		t1.inorder();
		t1.insert(c6);
		System.out.println("\nInserting 'Cuyahoga'");
		t1.preorder();
		t1.inorder();
		/**	the insertion is correct because the inorder traversal
		 * 		displays the numbers in ascending order, and c6 becomes
		 * 		c5's right child
		 */
		System.out.println("\nDeleting root node/c1");
		t1.delete(c1);
		t1.preorder();
		t1.inorder();
		/**	the deletion is correct because the inorder traversal
		 * 		displays the numbers in ascending order, and c6 becomes
		 * 		the new root of the BST
		 */
		
		
	}

	
	
}
