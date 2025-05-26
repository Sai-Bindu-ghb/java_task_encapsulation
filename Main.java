package com.publisher.main;
import com.publisher.Publisher;
import com.book.Book;

public class Main {

	public static void main(String[] args) {
		Publisher publisher=Publisher.getPublisherObject("Ramesh","Nellore","208756");
		Book book=Book.getBookObject("Harry Potter","J. K. Rowling",publisher,200);
		
		System.out.println(book);
		if(book==null) {
			System.out.println("Book creation failed due to invalid data");
		}

	}

}
