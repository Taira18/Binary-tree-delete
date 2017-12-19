/**
 * This is a tester program for the BinaryTree class
 * @author Michael Ida
 *
 */
public class BinaryTreeTester {
	
	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		int[] inputData = {20, 15, 200, 25, -5, 0, 100, 20, 12, 126, 1000, -150,};
		
		for (int elem : inputData) {
			tree.insert(elem);
		}
		
		System.out.println("In-Order Traversal");
		tree.inOrder();
		System.out.println("\n\n");
		// should be: -150, -5, 0, 12, 15, 20, 20, 25, 100, 126, 200, 1000
		
		System.out.println("Pre-Order Traversal");
		tree.preOrder();
		System.out.println("\n\n");
		// should be: 20, 15, -5, -150, 0, 12, 200, 25, 20, 100, 126, 1000
		
		System.out.println("Post-Order Traversal");
		tree.postOrder();
		System.out.println("\n\n");
		// should be: -150, 12, 0, -5, 15, 20, 126, 100, 25, 1000, 200, 20
		
		System.out.println("Size: " + tree.size());
		// should be: 12
		
		System.out.println("Maximum Depth: " + tree.maxDepth());
		//should be: 5
		
		System.out.println(tree.countMatches(20));
		System.out.println(tree.maxRecord());
		System.out.println(tree.minRecord());
		
		BinaryTree tree2 = new BinaryTree();
		int[] inputData2 = {7, 12, 3, 6, 9, 15, 1, 4, 8, 10, 13, 17};
		for (int elem : inputData2) {
			tree2.insert(elem);
		}
		
		System.out.println("In-Order Traversal");
		tree2.inOrder();
		System.out.println("\n\n");
		// should be: -150, -5, 0, 12, 15, 20, 20, 25, 100, 126, 200, 1000
		
		System.out.println("Pre-Order Traversal");
		tree2.preOrder();
		System.out.println("\n\n");
		// should be: 20, 15, -5, -150, 0, 12, 200, 25, 20, 100, 126, 1000
		
		System.out.println("Post-Order Traversal");
		tree2.postOrder();
		System.out.println("\n\n");
		// should be: -150, 12, 0, -5, 15, 20, 126, 100, 25, 1000, 200, 20
		
		System.out.println("Size: " + tree2.size());
		// should be: 12
		
		System.out.println("Maximum Depth: " + tree2.maxDepth());
		//should be: 5
		
		System.out.println(tree2.countMatches(20));
		System.out.println(tree2.maxRecord());
		System.out.println(tree2.minRecord());
		tree2.removeNode(15);
		tree2.inOrder();
		System.out.println("\n\n");

		tree2.preOrder();		
		System.out.println("\n\n");

		tree2.postOrder();	
		System.out.println("\n\n");

		
	}

}
