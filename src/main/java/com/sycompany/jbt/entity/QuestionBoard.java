package com.sycompany.jbt.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@SequenceGenerator(name = "qboard00_seq_generator",
//			sequenceName = "qboard00_seq",
//			allocationSize = 1)
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
	
	@Column(updatable = false)
	@CreationTimestamp
	private LocalDateTime createdate;
	
	// 답변 게시판 입장에서 일대다 관계(한 질문당 여러답변)
	@OneToMany(mappedBy = "questionBoard", cascade = CascadeType.REMOVE)  
	//질문이 삭제되면 그 질문에 달린 답변들도 모두 삭제
	private List<AnswerBoard> answerList;  // 답변이 여러개 달릴 수 있기 때문에 리스트 형태로 받아준다.
}
