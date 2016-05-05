
class ListNode{
	ListNode next;
	int val;
	ListNode(int x){
		this.val = x;
		this.next = null;
	}
}

public class Palin {
	
//	public static void main(String[] args){
//		ListNode one = new ListNode(4);
//		ListNode two = new ListNode(28);
//		ListNode three = new ListNode(6);
//		ListNode four = new ListNode(23);
//		ListNode five = new ListNode(46);
//		ListNode six = new ListNode(46);
//		ListNode seven= new ListNode(23);
//		ListNode eight = new ListNode(6);
//		ListNode nine = new ListNode(28);
//		ListNode ten = new ListNode(4);
//		one.next = two;
//		two.next = three;
//		three.next = four;
//		four.next = five;
//		five.next = six;
//		six.next = seven;
//		seven.next = eight;
//		eight.next = nine;
//		nine.next = ten;
//		System.out.println(findMid(one).val);
//		lPalin(one);
//	}
	
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
	
    public static int lPalin(ListNode A) {
        if(A == null || A.next == null) return 1;
        ListNode mid = findMid(A);
        ListNode temp = palinUtil(mid,A);
        if(temp != null) return 1;
        return 0;
    }
    
    public static ListNode palinUtil(ListNode mid, ListNode head){
		ListNode temp = null;
		if(mid.next != null){
			temp = palinUtil(mid.next,head);
			if(temp == null) return null;
			if(mid.val != temp.val) return null;
			return temp.next;
		}else{
		    if(mid.val != head.val) return null;
		    return head.next;
		}
	}
}
