package com.library.repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.book;
import com.library.model.library;

@Repository
public interface bookRepository extends JpaRepository<book, Integer>{

	public List<book> findByLibraryLibraryId(int libraryId);

	public List<book> findByBookdate(Date newbookdate);

}
