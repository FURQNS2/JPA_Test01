package com.sycompany.jbt.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@SequenceGenerator(name = "aboard00_seq_generator", sequenceName = "aboard00_seq", allocationSize = 1)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnswerBoard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Integer id;
	
	@Column(length = 1000)
	private String content;
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime createTime;
	
	@ManyToOne  //질문개시판 입장에서 다대일 관계(질문 하나당 답변 하나)
	private QuestionBoard questionBoard;
}
