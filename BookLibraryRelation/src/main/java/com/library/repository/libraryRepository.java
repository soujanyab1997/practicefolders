package com.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.model.library;

@Repository
public interface libraryRepository extends JpaRepository<library, Integer>{

}
