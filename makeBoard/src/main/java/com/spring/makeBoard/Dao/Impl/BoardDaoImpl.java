package com.spring.makeBoard.Dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.makeBoard.Dao.BoardDao;
import com.spring.makeBoard.dto.BoardDto;

@Repository()
public class BoardDaoImpl implements BoardDao{

	@Autowired
	SqlSession sqlSession;
	String adrr = "com.spring.mappers.BoardMapper";
	
	@Override
	public List<BoardDto> selectAllBoardList() {
		return sqlSession.selectList("com.spring.mappers.BoardMapper.selectBoardAllList");
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
