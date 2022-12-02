package com.sycompany.jbt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.sycompany.jbt.entity.QuestionBoard;
import com.sycompany.jbt.repository.QBoardRepository;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
public class TestQBoard {

	@Autowired
	private QBoardRepository qBoardRepository;
	
//	@Test
//	@DisplayName("저장 테스트")
//	public void createQuestion() {
//		QuestionBoard qBoard = new QuestionBoard();
//		
//		qBoard.setSubject("안녕");
//		qBoard.setContent("안녕");
//
//		
//		//qBoardRepository.deleteById(4);
//				
//		qBoardRepository.save(qBoard);
//		
//	}
	
//	@Test
//	@DisplayName("조회 테스트")
//	public void searchQuestion1() {
//				
//		List<QuestionBoard> qAll = qBoardRepository.findAll();
//		// 모든 글의 개수와 예상한 글의 개수가 일치하는지 확인하는 코드
//		assertEquals(4, qAll.size());
//		
//		QuestionBoard q1 = qAll.get(1);
//		assertEquals("ANY QUESTION?", q1.getSubject());
//	}	
	
//	@Test
//	@DisplayName("조회 테스트2")
//	public void searchQuestion2() {
//				
//		Optional<QuestionBoard> qBoard = qBoardRepository.findById(1);
//		// 모든 글의 개수와 예상한 글의 개수가 일치하는지 확인하는 코드
//		
//		if(qBoard.isPresent()) {		
//			QuestionBoard q1 = qBoard.get();	
//			assertEquals("질문드립니다.", q1.getSubject());
//		}	
//	}
	
//	@Test
//	@DisplayName("조회 테스트3")
//	public void searchQuestion3() {
//				
//		List<QuestionBoard> qBoard = qBoardRepository.findBySubject("연봉얼마?");
//		
//		// 검색한 값을 가져와서 첫번재칸에 있는 id값을 가져와서 맞는지 확인
//			QuestionBoard q3 = qBoard.get(0);
//			assertEquals(3, q3.getId());			
//	}
	
//	@Test
//	@DisplayName("조회 테스트4")
//	public void searchQuestion4() {
//				
//		List<QuestionBoard> qBoard = qBoardRepository.findBySubjectAndContent("안녕", "안녕");
//		
//		// 검색한 값을 가져와서 첫번재칸에 있는 id값을 가져와서 맞는지 확인
//			QuestionBoard q4 = qBoard.get(0);
//			assertEquals(9, q4.getId());			
//	}
	
//	@Test
//	@DisplayName("조회 테스트5")
//	public void searchQuestion5() {
//				
//		List<QuestionBoard> qBoard = qBoardRepository.findBySubjectLike("%안녕%");
//	
//			assertEquals(5, qBoard.size());
//	}
	
//	@Test
//	@DisplayName("조회 테스트6")
//	public void searchQuestion6() {
//				
//		List<QuestionBoard> qBoard = qBoardRepository.findBySubject("ANY QUESTION?");
//	
//		QuestionBoard qSubject = qBoard.get(0);
//		
//		qSubject.setSubject("저는 2번글입니다.");
//		
//		qBoardRepository.save(qSubject);
//			
//	}
	
	
//	@Test
//	@DisplayName("조회 테스트7")
//	public void searchQuestion7() {
//		
//		List<QuestionBoard> qBoard = qBoardRepository.findAll();
//		System.out.println("삭제 전=>" + qBoard.size());
//		
//		qBoardRepository.deleteById(3);
//				
//		System.out.println("삭제 후=>"+qBoard.size());
//				
//	}
}
