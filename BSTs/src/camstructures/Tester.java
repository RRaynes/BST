package camstructures;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		County c1 = new County("Franklin",49,"Columbus",1264518,53987);
		County c2 = new County("Hamilton",61,"Cincinnati",802374,40736);
		County c3 = new County("Butler",17,"Hamilton",368,53987);
		County c4 = new County("Franklin",49,"Columbus",1264518,53987);
		County c5 = new County("Franklin",49,"Columbus",1264518,53987);
		
		BST t1 = new BST();
		t1.insert(c1);
		t1.insert(c2);
		t1.insert(c3);
		t1.insert(c4);
		t1.insert(c5);
		
		System.out.println(t1.root);
		t1.inorder(t1.root);
	}

}
