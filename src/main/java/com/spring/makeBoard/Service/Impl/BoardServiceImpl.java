package com.spring.makeBoard.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.makeBoard.Dao.BoardDao;
import com.spring.makeBoard.Service.BoardService;
import com.spring.makeBoard.dto.BoardDto;

@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public List<BoardDto> selectAllBoardList() {
		//모든 게시글 조회
		return boardDao.selectAllBoardList();
	}

	@Override
	public BoardDto selectBoardDetail(int no) {
		boardDao.increaseHitCount(no);
		return boardDao.selectBoardDetail(no);
	}

	@Override
	public void insertBoard(BoardDto boardDto) {
		boardDao.insertBoard(boardDto);
	}

	@Override
	public void updateBoard(BoardDto boardDto) {
		boardDao.updateBoard(boardDto);
	}

	@Override
	public void deleteBoard(int no) {
		boardDao.deleteBoard(no);
	}


}
