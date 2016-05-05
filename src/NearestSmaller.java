import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
public class NearestSmaller {
	public static void main(String[] args){
		
	}
	public ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
		Deque<Integer> stack = new LinkedList<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		int temp;
		for(int i = 0; i < arr.size() ; i++){
			if(stack.isEmpty()){
				res.add(-1);
			}else{
				temp = stack.peekFirst();
				while(temp >= arr.get(i)){
					temp = stack.removeFirst();
					if (stack.isEmpty()){
						temp = -1;
						break;
					}else{
						temp = stack.peekFirst();
					}
				}
				res.add(temp);
			}
			stack.addFirst(arr.get(i));
			
		}
		return res;
	}
	
}
