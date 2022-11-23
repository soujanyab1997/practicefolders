package com.library.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class book {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookId;
	private String bookName;
	private String author;
	private Date bookdate;
	@ManyToOne
	(fetch = FetchType.LAZY, optional = false,cascade = CascadeType.ALL)
	@JoinColumn(name = "libraryId")
	@JsonIgnore
	private library library;
	public book() {
		super();
	}
	public book(int bookId, String bookName, String author, Date bookdate, com.library.model.library library) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.bookdate = bookdate;
		this.library = library;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Date getBookdate() {
		return bookdate;
	}
	public void setBookdate(Date bookdate) {
		this.bookdate = bookdate;
	}
	public library getLibrary() {
		return library;
	}
	public void setLibrary(library library) {
		this.library = library;
	}
	@Override
	public String toString() {
		return "book [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", book_date=" + bookdate
				+ ", library=" + library + "]";
	}
	
	

}
