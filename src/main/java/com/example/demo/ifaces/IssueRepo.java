package com.example.demo.ifaces;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Issue;

public interface IssueRepo extends JpaRepository<Issue, Integer> {
	Page<Issue> findAll(Pageable pageable);

	//List<Issue> findById(int id);
	Issue findById(int id);
}
