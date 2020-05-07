package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Reviews;

@Repository("reviewsRepository")
public interface ReviewsRepository extends JpaRepository<Reviews, Integer>{

	List<Reviews> findAll();
//	Reviews findById(int id);
	List<Reviews> findByReviewname(String reviewname);
	<S extends Reviews> S save(Reviews review);
	void delete(Reviews review);
}
