package com.spring.makeBoard.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.makeBoard.Dao.BoardDao;
import com.spring.makeBoard.Service.BoardService;
import com.spring.makeBoard.dto.BoardDto;

@Service("BoardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public List<BoardDto> selectAllBoardList() {
		//모든 게시글 조회
		return boardDao.selectAllBoardList();
	}

	@Override
	public BoardDto selectBoard(int seq) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(BoardDto boardDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteBoard(int seq) {
		// TODO Auto-generated method stub
		
	}


}
