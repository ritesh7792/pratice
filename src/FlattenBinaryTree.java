
public class FlattenBinaryTree {
	
	public static void main(String[] args){
		TreeNode one = new TreeNode(1);
		TreeNode two = new TreeNode(2);
		TreeNode three = new TreeNode(3);
		TreeNode four = new TreeNode(4);
		TreeNode five = new TreeNode(5);
		TreeNode six = new TreeNode(6);
		TreeNode seven = new TreeNode(7);
		TreeNode eight = new TreeNode(8);
		
		one.left = two;
		one.right = three;
		two.left = four;
		two.right = five;
		three.right = six;
		three.left = seven;
		
		
		one = flatten(one);
	}
	
	
	public static TreeNode flatten(TreeNode a) {
	    
		if(a == null) return null;
	    System.out.println(a.val);
		if(a.left != null){
	        TreeNode temp1 = flatten(a.left);
	        TreeNode temp2 = a.right;
	        a.right = temp1;
	        while(temp1.right != null){
	            temp1 = temp1.right;
	        }
	        temp1.right = temp2;
	        a.left = null;
	    }else{
	    	flatten(a.right);
	    }
	    a.right = flatten(a.right);
	    return a;
	}	
}
