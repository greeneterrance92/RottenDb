package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Recommendations;

@Repository("recommendationsRepository")
public interface RecommendationsRepository extends JpaRepository<Recommendations, Integer>{
	
	List<Recommendations> findAll();
	Recommendations getById();
	List<Recommendations> getByReceiver();
}
