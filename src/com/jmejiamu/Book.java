package com.jmejiamu;

public class Book {
	
	ListNode head;
	
	public static class ListNode{
		private String data;
		public ListNode next;
		
		public ListNode(String data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	//	Print List of books
	
	public void display() {
		ListNode current = head;
		while (current != null) {
			System.out.println(current.data);
			current = current.next;
		}
		System.out.println("null");
	}
	
//	Find the length
	public int findLength() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null) {
			count ++;
			current = current.next;
		}
		return count;
	}
}
