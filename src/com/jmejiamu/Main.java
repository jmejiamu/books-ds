package com.jmejiamu;

import com.jmejiamu.Book.ListNode;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Book books = new Book();
		books.head = new ListNode("Java");
		
		ListNode secondBook= new ListNode("NodeJS");
		ListNode thirdBook= new ListNode("JavaScript");
		ListNode fourthdBook= new ListNode("HTML");
		ListNode fithBook= new ListNode("CSS");
		
		// Connecting Books
		books.head.next = secondBook;
		secondBook.next = thirdBook;
		thirdBook.next = fourthdBook;
		fourthdBook.next = fithBook;
		
		books.display();
		
		System.out.println("You have " + books.findLength() + " in Stack");
	}

}
