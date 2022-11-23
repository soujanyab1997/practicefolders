package com.example.oderwell.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.oderwell.model.StagingOrderStoreLine;
import com.example.oderwell.model.StagingStoreOrder;
import com.example.oderwell.model.stageStoreOrderLineKey;

public interface lineRepository extends JpaRepository<StagingOrderStoreLine, Integer>{


}
