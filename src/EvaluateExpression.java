import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;


public class EvaluateExpression {
	public int evalRPN(ArrayList<String> a) {
		int len = a.size();
		String ch;
		int op1;
		int op2;
		Deque<Integer> stack = new LinkedList<Integer>();
		for(int i = 0 ; i < len ; i++){
			ch = a.get(i);
			
			
			switch (ch){
			case "+": 
			    op1 = stack.removeFirst();
			    op2 = stack.removeFirst();
				stack.addFirst(op1+op2);
				break;
			case "-":
			    op1 = stack.removeFirst();
			    op2 = stack.removeFirst();
				stack.addFirst(op2-op1);
				break;
			case "*":
			    op1 = stack.removeFirst();
			    op2 = stack.removeFirst();
				stack.addFirst(op2*op1);
				break;
			case "/":
			    op1 = stack.removeFirst();
			    op2 = stack.removeFirst();
				stack.addFirst(op2/op1);
				break;
			default:
				stack.addFirst(Integer.parseInt(ch));
				break;
			}
			
			
		}
		return stack.peekFirst();

	}
}
