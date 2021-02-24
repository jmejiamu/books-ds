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
}
