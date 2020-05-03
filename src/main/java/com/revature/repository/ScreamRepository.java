package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.revature.model.Scream;

@Repository("screamRepository")
public interface ScreamRepository extends JpaRepository<Scream, Integer> {

	List<Scream> findAll();
	<S extends Scream> S save(Scream s);
	Scream findById(@Param("id") int id);
}
