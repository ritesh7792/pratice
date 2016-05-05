
public class HeightBalTree {
	public static void main(String[] args){
		
	}
	
	public int isBalanced(TreeNode a) {
		if(isBalUtil(a) == -1) return 0;
		return 1;
	}
	
	public int isBalUtil(TreeNode root) {
		if(root == null) return 0;
		int lHeight = isBalUtil(root.left);
		int rHeight = isBalUtil(root.right);
		if(lHeight == -1 || rHeight == -1) return -1;
		if(Math.abs(lHeight - rHeight) > 1) return -1;
		return (1+ Math.max(lHeight, rHeight));
	}

}
