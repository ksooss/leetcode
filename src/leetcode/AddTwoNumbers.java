package leetcode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode result = addTwoNumbers(l1, l2);

		while (result.next != null) {
			System.out.println("val : " + result.val);
			result = result.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
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