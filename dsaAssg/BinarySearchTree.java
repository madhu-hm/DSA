package dsaAssg;

class Node{
	int key;
	Node left,right;
	
	public Node(int item) {
		key=item;
		left=null;
		right=null;
	}
}
public class BinarySearchTree {
	Node root;
	
	public BinarySearchTree(){
		root=null;
	}
	// Insert
	void insert(int key) {
		root=insertRec(root,key);
	}
	Node insertRec(Node root,int key) {
		if(root==null) {
			root=new Node(key);
		}
		if(key<root.key) {
			root.left=insertRec(root.left,key);
		}
		else if(key>root.key) {
			root.right=insertRec(root.right,key);
		}
		return root;
	}
	// Delete
	void delete(int key) {
		root=deleteRec(root,key);
	}
	Node deleteRec(Node root,int key) {
		if (root == null)
            return root;

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.key = minValue(root.right);

            root.right = deleteRec(root.right, root.key);
        }

        return root;
	}
	
	int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }
	
	// Search
	boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null)
            return false;
        if (root.key == key)
            return true;
        if (root.key < key)
            return searchRec(root.right, key);
        return searchRec(root.left, key);
    }
    
    void preorder(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.key+" ");
		preorder(node.left);
		preorder(node.right);
	}
	void inorder(Node node) {
		if(node==null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.key+" ");
		inorder(node.right);
	}
	void postorder(Node node) {
		if(node==null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.key+" ");
	}
	
	public static void main(String[] args) {
		BinarySearchTree tree=new BinarySearchTree();
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		System.out.println("Preorder Traversal: ");
		tree.preorder(tree.root);
		System.out.println();
		System.out.println("Inorder Traversal: ");
		tree.inorder(tree.root);
		System.out.println();
		System.out.println("Postorder Traversal: ");
		tree.postorder(tree.root);
		System.out.println();
		tree.delete(40);
		tree.delete(80);
		System.out.println("After deleting:");
		tree.postorder(tree.root);
		System.out.println();
		System.out.println("Is " + 70 + " present in the tree? " + tree.search(70));

	}
}
