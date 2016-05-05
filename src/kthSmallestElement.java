import java.util.Deque;
import java.util.LinkedList;


public class kthSmallestElement {
   public int kthsmallest(TreeNode root, int k) {
       Deque<TreeNode> q = new LinkedList<TreeNode>();
       q = inorder(root, q);
       int count = 0;
       TreeNode temp = null;
       while(count < k){
           count++;
           temp = q.removeFirst();
       }
       return temp.val;
   }
   
   public Deque inorder(TreeNode root, Deque<TreeNode> q){
       if(root == null) return q;
       q = inorder(root.left, q);
       q.addLast(root);
       return inorder(root.right, q);
   }
   
}
