package com.sycompany.jbt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.sycompany.jbt.entity.AnswerBoard;
import com.sycompany.jbt.entity.QuestionBoard;
import com.sycompany.jbt.repository.ABoardRepository;
import com.sycompany.jbt.repository.QBoardRepository;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class TestABoard {

	@Autowired
	private QBoardRepository qBoardRepository;
	
	@Autowired
	private ABoardRepository aBoardRepository;
	
//	@Test
//	@DisplayName("답변 저장 테스트")
//	public void AnswerCreatTest() {
//		Optional<QuestionBoard> oQboard = qBoardRepository.findById(8);  // 질문게시판에 7번 글 전부 불러오기
//		assertTrue(oQboard.isPresent()); // 가져온 값이 null인지 아닌지 확인
//		QuestionBoard qBoard = oQboard.get();  // 7번글에 있는 질문만 가져오기
//		
//		AnswerBoard aBoard = new AnswerBoard();
//		
//		aBoard.setContent("7번글 답변입니다."); 
//		aBoard.setQuestionBoard(qBoard);  // 질문 값 가져와서 넣기		
//		
//		aBoardRepository.save(aBoard);
//		
//	}

//	@Test
//	@DisplayName("답변 조회 테스트")
//	public void AnswerSearchTest() { // 답변이 잘 들어갔는지 확인
//		Optional<AnswerBoard> oAboard = aBoardRepository.findById(10);  // 질문게시판에 7번 글 전부 불러오기
//		assertTrue(oAboard.isPresent()); // 가져온 값이 null인지 아닌지 확인
//		AnswerBoard aBoard = oAboard.get();  // 7번글에 있는 질문만 가져오기
//		
//		assertEquals(7, aBoard.getQuestionBoard().getId());  // 질문글의 id를 가져와서 확인
//				
//	}
	
	@Transactional
	@Test
	@DisplayName("답변/질문 조회 테스트")
	public void AnswerQuestionSearchTest() {
		
		Optional<QuestionBoard> oQboard = qBoardRepository.findById(7);  // 질문게시판에 7번 글 전부 불러오기
		assertTrue(oQboard.isPresent()); // 가져온 값이 null인지 아닌지 확인
		QuestionBoard qBoard = oQboard.get();  // 7번글에 있는 질문만 가져오기
		
		List<AnswerBoard> aBoards = qBoard.getAnswerList();  // 답변글 리스트 가져오기
					
		assertEquals(1, aBoards.size());  // 7번 글에 달린 답변 개수확인
				
	}

}
