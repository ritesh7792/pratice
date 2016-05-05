import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


public class ZigZagTraversal {
	
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
		
		ArrayList<ArrayList<Integer>> a = zigzagLevelOrder(one);
		printList(a);
	}
	
	public static void printList(ArrayList<ArrayList<Integer>> a){
		System.out.println("ArrayList");
		for(int i = 0 ; i < a.size() ; i++){
			System.out.println(" " + a.get(i).toString());
		}
	}
	
	public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		boolean flag = false;
		Deque<TreeNode> q = new LinkedList<TreeNode>();
		Deque<TreeNode> s1 = new LinkedList<TreeNode>();
		Deque<TreeNode> s2 = new LinkedList<TreeNode>();
		TreeNode temp = a;
		q.addLast(temp);
		q.addLast(null);
		ArrayList<Integer> temp1 = new ArrayList<Integer>();
		temp1.add(temp.val);
		res.add(temp1);
		int count = 0;
		while(!q.isEmpty()){
			
			count++;
			
			temp = q.removeFirst();
			
			
			if(temp != null){
//				System.out.println(q.size() + " " + temp.val + " " + q.toString());
				
				if(temp.left != null) q.addLast(temp.left);
				if(temp.right != null) q.addLast(temp.right);
				if(!flag){
					if(temp.left != null) s2.addFirst(temp.left);
					if(temp.right != null) s2.addFirst(temp.right);
				}else{
					if(temp.left != null) s1.addLast(temp.left);
					if(temp.right != null) s1.addLast(temp.right);
				}
			}else{
				if(q.size() == 0) return res;
				if(!flag){
					if(!s2.isEmpty()){
						ArrayList<Integer> arr = new ArrayList<Integer>();
						while(!s2.isEmpty()){
							arr.add(s2.removeFirst().val);
						}
						res.add(arr);
					}
				}else{
					if(!s1.isEmpty()){
						ArrayList<Integer> arr = new ArrayList<Integer>();
						while(!s1.isEmpty()){
							arr.add(s1.removeFirst().val);
						}
						res.add(arr);
					}
				}
			flag = !flag;
			q.addLast(null);
			}
//			System.out.println("s1 size " + s1.size() + " s2.size() " + s2.size());
			printList(res);
		}
//		System.out.println("returning");
		return res;
	}
}
