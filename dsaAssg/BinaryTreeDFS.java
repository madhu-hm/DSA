
package dsaAssg;

class TreeNode{
	int data;
	TreeNode left,right;
	TreeNode(int val){
		data=val;
		left=right=null;
	}
}
public class BinaryTreeDFS {
	void preorder(TreeNode node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	void inorder(TreeNode node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	void postorder(TreeNode node) {
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
	public static void main(String[]args) {
		BinaryTreeDFS tree=new BinaryTreeDFS();
		TreeNode root=new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		System.out.println("Preorder Traversal: ");
		tree.preorder(root);
		System.out.println();
		System.out.println("Inorder Traversal: ");
		tree.inorder(root);
		System.out.println();
		System.out.println("Postorder Traversal: ");
		tree.postorder(root);
	}
}