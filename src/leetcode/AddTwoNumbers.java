package leetcode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		AddTwoNumbers obj = new AddTwoNumbers();
		ListNode result = obj.addTwoNumbers(l1, l2);

		while (result!= null) {
			System.out.println("result : " + result.val);
			result = result.next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode l3=result;
        while(l1!=null || l2!=null) {
            int l1Val = l1==null ? 0:l1.val;
            int l2Val = l2==null ? 0:l2.val;
            int l3Val = l3.val;
            
            int sum = l1Val + l2Val + l3Val;
            if(sum>=10) {
                sum -= 10;
                l3.next = new ListNode(1);
            }
            l3.val = sum;
            l1 = l1==null ? null:l1.next;
            l2 = l2==null ? null:l2.next;
            if((l1!=null||l2!=null)&&l3.next==null)
            	l3.next = new ListNode(0);
            l3 = l3.next;
        }
        return result;
	}
	
	public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		sumTwoNumbers(l1, l2, result);
		return result;
	}

	public static void sumTwoNumbers(ListNode l1, ListNode l2, ListNode result) {
		int sum = l1.val + l2.val + result.val;
		if (sum >= 10) {
			result.next = new ListNode(1);
			sum -= 10;
		}
		result.val = sum;

		if (l1.next != null || l2.next != null || result.next != null) {
			if (l1.next == null)
				l1.next = new ListNode(0);

			if (l2.next == null)
				l2.next = new ListNode(0);

			if (result.next == null)
				result.next = new ListNode(0);

			sumTwoNumbers(l1.next, l2.next, result.next);
		}
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}