
public class rotate {
	public static int findLen(ListNode head){
		int len = 1;
		while(head.next != null){
			len++;
			
			head = head.next; 

//			System.out.println("len " + len + " head " + head.val);
		}
		return len;
	}
	
	public static void printList(ListNode head){
		while (head != null){
			System.out.print(head.val + " ");
			head = head.next;
		}
	}
	
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
//		ListNode newNode = rotateList(one,3);
//		printList(newNode);
//	}
	
	public static ListNode rotateList(ListNode head, int k){
		if(head == null || head.next == null) return head;
//		printList(head);
		int len = findLen(head);
		int count = 1;
		ListNode temp = head;
		ListNode prev = head;
		k = k%len;
		if(k == 0) return head;
//		System.out.println(len - k + 1);
		while(count < len - k + 1){
			
//			System.out.print(temp.val + " ");
			prev = temp;
			temp = temp.next;
			count++;
		}
		
		prev.next = null;
		ListNode newHead = temp;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = head;
		
		return newHead;
	}
}
