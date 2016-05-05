import java.util.Deque;
import java.util.LinkedList;


public class MinStack {
	
	public static void main(String[] args){

		push(10);
		push(9);
		System.out.println(getMin());
		push(8);
		System.out.println(getMin());
		push(7);
		System.out.println(getMin());
		push(6);
		System.out.println(getMin());
		pop();
		System.out.println(getMin());
		pop();
		System.out.println(getMin());
		pop();
		System.out.println(getMin());
		pop();
		System.out.println(getMin());
		pop();
		System.out.println(getMin());


	}
	
	MinStack(){
		s.clear();
		minStack.clear();
	}
	
	static Deque<Integer> s = new LinkedList<Integer>();
	static Deque<Integer> minStack = new LinkedList<Integer>();
	
	public static void push(int x) {
		s.addFirst(x);
		if(!minStack.isEmpty()){
			if (x < minStack.peekFirst()) minStack.addFirst(x);
			
		}else{
			minStack.addFirst(x);
				
		}
//		System.out.println("x " + x + " s " + s.toString() + " minStack " + minStack.toString());
	}

    public static void pop() {
    	if (s.isEmpty()) return;
        int x = s.removeFirst();
        if (x == minStack.peekFirst()) minStack.removeFirst();
    }

    public static int top() {
    	if (s.isEmpty()) return -1;
    	return s.peekFirst();
    }

    public static int getMin() {
        if (s.isEmpty()) return -1;
        return minStack.peekFirst();
    }
}
