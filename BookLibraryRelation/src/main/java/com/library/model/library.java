package com.library.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class library {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int libraryId;
	private String libraryName;
	private String location;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "library")
	@JsonIgnore
	private List<book> books;

	public int getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(int libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<book> getBook() {
		return books;
	}

	public void setBook(book book) {		
		this.books.add(book) ;
	}

	@Override
	public String toString() {
		return "library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", location=" + location
				+ "]";
	}

		
	
}
