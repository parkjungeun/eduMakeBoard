package com.spring.makeBoard.Dao;

import java.util.List;

import com.spring.makeBoard.dto.BoardDto;

public interface BoardDao {

	//전체 조회
	List<BoardDto> selectAllBoardList();
		
	//상세 조회
	BoardDto selectBoardDetail(int no);
	
	//조회수 증가
	void increaseHitCount(int no);
	
	//입력
	void insertBoard(BoardDto boardDto);
	
	//수정
	void updateBoard(BoardDto boardDto);
	
	//삭제
	void deleteBoard(int no);
}
