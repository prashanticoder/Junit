package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JunitBookDaoImpl implements JunitBookDao {

	List<Book> listBooks;

	public JunitBookDaoImpl() {
		listBooks = new ArrayList<Book>();
		listBooks.add(new Book(1, "c", "456"));
		listBooks.add(new Book(2, "c++", "12"));
		listBooks.add(new Book(3, "java", "45"));
		listBooks.add(new Book(4, "javascript", "79"));
	}

	public List<Book> getAllBooks() {
		System.out.println(listBooks.get(0));
		return listBooks;
	}

	public void addBook(Book book) {
		listBooks.add(book);
	}

	public Book updateBook(String bookName, String iSBN) {

		int index = 0;
		for (int i = 0; i < listBooks.size(); i++) {
			if (listBooks.get(i).getiSBN().equals(iSBN)) {
				index = i;
				listBooks.get(i).setBookName(bookName);
			}
		}
		return listBooks.get(index);
	}
	

	public void delBook(String iSBN) {

		boolean isIndex = false;
		for (int i = 0; i < listBooks.size(); i++) {
			if (listBooks.get(i).getiSBN().equals(iSBN)) {
				isIndex = true;
				listBooks.remove(i);
			}
		}
	}
}

		
	