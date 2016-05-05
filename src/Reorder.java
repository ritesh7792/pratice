
public class Reorder {
//	public static void main(String[] args){
//		ListNode one = new ListNode(1);
//		ListNode two = new ListNode(2);
//		ListNode three = new ListNode(3);
//		ListNode four = new ListNode(4);
//		ListNode five = new ListNode(5);
//		ListNode six = new ListNode(6);
//		ListNode seven= new ListNode(7);
//		ListNode eight = new ListNode(8);
//		ListNode nine = new ListNode(9);
//		ListNode ten = new ListNode(10);
//		one.next = two;
//		two.next = three;
//		three.next = four;
//		four.next = five;
//		five.next = six;
//		six.next = seven;
//		seven.next = eight;
//		eight.next = nine;
//		nine.next = ten;
//		
//		ListNode mid = findMid(one);
//		ListNode last = reorder(mid,one);
//		last.next = null;
//		printList(one);
//	}
	
	public static void printList(ListNode head){
		int count = 0;
		while (head != null){
			System.out.print(head.val + " ");
			head = head.next;
			count++;
			if (count > 15 ) break;
		}
	}
	
	public static ListNode findMid(ListNode head){
		ListNode temp = head;
		int count = 0;
		ListNode counter = head;
		while(counter != null){ 
			temp = counter;
			counter = counter.next;
			count++;
		}
		int i = 1;
		temp = head;
		while( i <= count/2){
			temp = temp.next;
			i++;
		}
		if(count%2 == 0) return temp;
		else return temp.next;
	}
	
	public static ListNode reorder(ListNode mid, ListNode head){
		ListNode temp;
		if(mid.next == null){
//			System.out.println("Next Null" + " Head " + head.val + " mid " + mid.val);
			temp = head.next;
			head.next = mid;
			mid.next = temp;
			
			return temp;
		}else{
			
			ListNode a = reorder(mid.next, head);
//			System.out.println("Next Null" + " a " + a.val + " mid " + mid.val);
			temp = a.next;
			a.next = mid;
			mid.next = temp;
			return temp;
		}
	}
}


