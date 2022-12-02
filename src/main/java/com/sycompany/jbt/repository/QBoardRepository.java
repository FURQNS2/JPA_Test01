package com.sycompany.jbt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sycompany.jbt.entity.QuestionBoard;

public interface QBoardRepository extends JpaRepository<QuestionBoard, Integer> {

	public List<QuestionBoard> findBySubject(String subject);
	public List<QuestionBoard> findBySubjectAndContent(String subject, String Content);
	//public List<QuestionBoard> findBySubjectLike(String subject);
	
}
