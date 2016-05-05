
public class SymmetricBinaryTree {
	public int isSymmetric(TreeNode a) {
		if(a == null) return 1;
		if(mirrorUtil(a.left,a.right)) return 1;
		return 0;
	}
	
	public boolean mirrorUtil(TreeNode a,TreeNode b){
		if(a == null && b == null) return true;
		if(a == null && b != null || a != null && b == null) return false;
		if(a.val != b.val) return false;
		return (mirrorUtil(a.right,b.left) && mirrorUtil(a.left, b.right)); 
	}
}
