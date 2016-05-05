import java.util.Deque;
import java.util.LinkedList;


public class LCA {
	
	public static void main(String[] args){
		TreeNode one = new TreeNode(1);
		System.out.println(lca(one,1,1));
	}
	
	public static boolean searchKeys(TreeNode root, int key1, int key2){
		Deque<TreeNode> q = new LinkedList<TreeNode>();
		q.addLast(root);
		TreeNode temp;
		boolean flag1 = false;
		boolean flag2 = false;
		while(!q.isEmpty()){
			temp = q.removeFirst();
			if(temp.val == key1) flag1 = true;
			if(temp.val == key2) flag2 = true;
			if(temp.left != null) q.addLast(temp.left);
			if(temp.right!= null) q.addLast(temp.right);
		}
		return flag1 && flag2;
	}
	
	public static int lca(TreeNode a, int val1, int val2) {
		if(!searchKeys(a,val1,val2)) return -1;
		return findLCA(a,val1,val2);
	}
	
	public static int findLCA(TreeNode root, int a, int b) {
		   if (root == null) {
		       return -1;
		   }

		   // If the root is one of a or b, then it is the LCA
		   if (root.val == a || root.val == b) {
		       return root.val;
		   }

		   int left = findLCA(root.left, a, b);
		   int right = findLCA(root.right, a, b);

		   // If both nodes lie in left or right then their LCA is in left or right,
		   // Otherwise root is their LCA
		   if (left != -1 && right != -1) {
		      return root.val;
		   }

		   return (left != -1) ? left : right; 
	}
}
