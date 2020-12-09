package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.Issue;
import com.example.demo.ifaces.IssueRepo;


@SpringBootApplication
public class BugTrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugTrackerApplication.class, args);
	}
	
	
	@Bean 
	public CommandLineRunner runner() {
		return new CommandLineRunner() {
			
			@Autowired
			private IssueRepo repo;
			
			@Override
			public void run(String ...strings ) throws Exception{
		//		repo.save(new Issue(101,"Sample REST issue","Description for sample REST issue.","name","normal","trivial","Raj"));

				repo.save(new Issue(102,"Sample REST issue2","Description for sample REST issue2.","name","normal","trivial","Raj2"));
				repo.save(new Issue(103,"Sample REST issue3","Description for sample REST issue3.","name","normal","non-trivial","Raj3"));
				repo.save(new Issue(104,"Sample REST issue4","Description for sample REST issue4.","name","normal","non-trivial","Raj4"));
				repo.save(new Issue(105,"Sample REST issue5","Description for sample REST issue5.","name","normal","non-trivial","Raj5"));
				repo.save(new Issue(106,"Sample REST issue6","Description for sample REST issue6.","name","normal","non-trivial","Raj6"));
	//			repo.save(new Issue(107,"Sample REST issue7","Description for sample REST issue7.","name","normal","trivial","Raj7"));

				
			}
		};
	}

}
