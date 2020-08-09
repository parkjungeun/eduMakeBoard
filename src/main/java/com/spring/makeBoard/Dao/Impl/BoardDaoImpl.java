package com.spring.makeBoard.Dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.makeBoard.Dao.BoardDao;
import com.spring.makeBoard.dto.BoardDto;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao{

	@Autowired
	SqlSession sqlSession;
	String adrr = "com.spring.mappers.BoardMapper";
	
	@Override
	public List<BoardDto> selectAllBoardList() {
		return sqlSession.selectList(adrr + ".selectBoardAllList");
	}

	@Override
	public BoardDto selectBoardDetail(int no) {
		return sqlSession.selectOne(adrr + ".selectBoardDetail", no);
	}
	
	@Override
	public void increaseHitCount(int no) {
		sqlSession.update(adrr + ".increaseHitCount", no);
	}

	@Override
	public void insertBoard(BoardDto boardDto) {
		sqlSession.insert(adrr+".insertBoard", boardDto);
	}

	@Override
	public void updateBoard(BoardDto boardDto) {
		sqlSession.update(adrr+".updateBoard", boardDto);
	}

	@Override
	public void deleteBoard(int no) {
		sqlSession.delete(adrr+".deleteBoard", no);
	}

}
