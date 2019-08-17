package leetcode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		addTwoNumbers(l1, l2);

		while (l1.next != null) {
			System.out.println("val : " + l1.val);
			l1 = l1.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		sumTwoNumbers(l1, l2);
		return l1;
	}

	public static void sumTwoNumbers(ListNode l1, ListNode l2) {
		int sum = l1.val + l2.val;
		if (sum >= 10) {
			if (l1.next == null) {
				ListNode tempL = new ListNode(1);
				l1.next = tempL;
			} else
				l1.next.val++;

			l1.val = sum - 10;
		} else {
			l1.val = sum;
		}

		if (l1.next != null || l2.next != null) {
			if (l1.next == null)
				l1.next = new ListNode(0);

			if (l2.next == null)
				l2.next = new ListNode(0);

			sumTwoNumbers(l1.next, l2.next);
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