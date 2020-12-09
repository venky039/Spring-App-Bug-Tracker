package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="issues")
public class Issue {
	
	@Id
	int id;
	String summary;
	String description;
	String project;
	String priority;
	String severity;
	String assignedTo;
	
}

/*  “id” 1010
    "summary": "Sample REST issue",
    "description": "Description for sample REST issue.",
    "project":"name"
    "priority": "normal"
    "severity": "trivial"
    “assingedTo:”suresh”
*/