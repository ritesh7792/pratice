import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


public class InorderWithoutRecursion {
	
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
		one.right = five;
		two.left = three;
		two.right = four;
		five.right = eight;
		five.left = six;
		six.left = seven;
		
		ArrayList<Integer> res = inorderTraversal(one);
		System.out.println(res.toString());
	}
	
	public static void printStackValues(Deque<TreeNode> s){
		while(!s.isEmpty()){
			System.out.print(" " + s.removeFirst().val);
		}
		System.out.println("");
	}
	
	public static ArrayList<Integer> inorderTraversal(TreeNode a) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		TreeNode curr = a;
		Deque<TreeNode> s = new LinkedList<TreeNode>();
		while(curr != null){
			s.addFirst(curr);
			curr = curr.left;
		}
		
		while(!s.isEmpty()){
			curr = s.removeFirst();
			res.add(curr.val);
			curr = curr.right;
			while(curr != null){
				s.addFirst(curr);
				curr = curr.left;
			}
		}
		return res;
	}
}
