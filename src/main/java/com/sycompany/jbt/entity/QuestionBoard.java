package com.sycompany.jbt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionBoard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer id;
	
	@Column(name="subject", length = 200)
	private String subject;
	
	@Column(name="content", columnDefinition = "TEXT")//255자 제한 해제
	private String content;
	
//	@Column(name="createdate")
//	@CreatedDate
//	private LocalDateTime createdate;
}
