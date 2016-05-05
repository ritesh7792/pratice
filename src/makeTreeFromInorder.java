import java.util.ArrayList;

public class makeTreeFromInorder {
	
	public static void main(String[] args){
		int[] a = {1, 2, 3};
		ArrayList<Integer> input = new ArrayList<Integer>();
		for(int i = 0 ; i < a.length ; i++){
			input.add(a[i]);
		}
		
		System.out.println(buildTree(input).val);
		
	}
	
	
	
    public static TreeNode buildTree(ArrayList<Integer> a) {
    	System.out.println(a.size());
//    	return new TreeNode(1);
    	int start = 0;
    	int end = a.size()-1;
    	return buildUtil(a,start,end);
    }
    
    public static int findMax(ArrayList<Integer> a, int start, int end){
    	
        int max = a.get(start);
        int res = start;
        for(int i = start+1; i <= end ; i++){
            if (a.get(i) > max){ 
                res = i;
                max = a.get(i);
            }
        }
        return res;
    }
    
    public static TreeNode buildUtil(ArrayList<Integer> a, int start, int end){
    	
        if(start > end) return null;
        int max = findMax(a,start,end);  
        System.out.println("Arraylist " + a.toString() + " start " + start + " end " + end + " max " + a.get(max));
        TreeNode root = new TreeNode((a.get(max)));
        root.left = buildUtil(a,start,max - 1);
        root.right = buildUtil(a,max+1,end);
        return root;
    }
}
