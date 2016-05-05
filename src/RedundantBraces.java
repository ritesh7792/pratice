import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;


public class RedundantBraces {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		System.out.println(braces(a));
	}
	
	public static int braces(String s){
		Deque<Character> braceStack = new LinkedList<Character>();
		Deque<Character> operatorStack = new LinkedList<Character>();
		Deque<Character> stack = new LinkedList<Character>();
		int len = s.length();
		char ch;
		
		int count = 0;
		for(int i = 0 ; i < len ; i++){
			ch = s.charAt(i);
			if(ch == '('){
//				braceStack.addFirst(ch);
				stack.addFirst(ch);
			}else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
//				operatorStack.addFirst(ch);
				stack.addFirst(ch);
			}else if(ch == ')'){
//				if (operatorStack.size() == 0){
//					return 1;
//				}
//				operatorStack.removeFirst();
				count = 1;
				ch = stack.removeFirst();
				while(ch != '('){
					ch = stack.removeFirst();
					System.out.println("ch " + ch);
					count++;
				}
				if (count == 1){
					return 1;
				}
			}
		}
		return 0;
	}
}
