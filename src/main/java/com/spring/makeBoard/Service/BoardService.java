package com.spring.makeBoard.Service;

import java.util.List;
import com.spring.makeBoard.dto.BoardDto;

public interface BoardService {

	//전체 조회
	List<BoardDto> selectAllBoardList();
		
	//상세 조회
	BoardDto selectBoardDetail(int no);
	
	//입력
	void insertBoard(BoardDto boardDto);
	
	//수정
	void updateBoard(BoardDto boardDto);
	
	//삭제
	void deleteBoard(int no);
	
}
