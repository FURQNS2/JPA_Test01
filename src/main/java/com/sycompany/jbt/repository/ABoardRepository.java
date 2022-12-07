package com.sycompany.jbt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sycompany.jbt.entity.AnswerBoard;
import com.sycompany.jbt.entity.QuestionBoard;

public interface ABoardRepository extends JpaRepository<AnswerBoard, Integer>{

}
