package com.sycompany.jbt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sycompany.jbt.entity.QuestionBoard;

public interface QBoardRepository extends JpaRepository<QuestionBoard, Integer> {

	// 필드 값이 맞는 값 모두 찾기
	public List<QuestionBoard> findBySubject(String subject);
	//두 개의 필드 값을 만족하는 모든 값 찾기
	public List<QuestionBoard> findBySubjectAndContent(String subject, String Content);
	public List<QuestionBoard> findBySubjectLike(String subject);
	
}
