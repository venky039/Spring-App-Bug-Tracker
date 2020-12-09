package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Issue;
import com.example.demo.ifaces.IssueRepo;

@Service
public class IssueService {

	@Autowired
	private IssueRepo repo;

	public List<Issue> findAll(int pageNum,int pageSize){
		Pageable pageableObj=PageRequest.of(pageNum, pageSize);
		//creating a pageRequest object of Pageable interface and passing that object to the repository method
		Page<Issue> page=this.repo.findAll(pageableObj);
		
		
		
		 if(page.hasContent()) {
	            return page.getContent();
	        } else {
	            return new ArrayList<Issue>();
	        }
		
		
	}
	
	public Issue findById(int id){
		//return this.repo.findAllById(id);
		return this.repo.findById(id);
		//return (List<Issue>) this.repo.findAll();
	}
	
	public Issue add(Issue issue) {
		return this.repo.save(issue);
	}

}
