package com.example.oderwell.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.oderwell.model.StagingStoreOrder;

@Repository
public interface orderRepository extends JpaRepository<StagingStoreOrder, String>{

	//List<StagingStoreOrder> findByuplorderid();
	@Query("SELECT u FROM StagingStoreOrder u WHERE u.uplorderid = 1")
	List<StagingStoreOrder> findByuplorderid();

}
