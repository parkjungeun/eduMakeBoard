package com.spring.makeBoard.Dao.Impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.makeBoard.Dao.CommentDao;
import com.spring.makeBoard.dto.CommentDto;

@Repository("commentDao")
public class CommentDaoImpl implements CommentDao{

	@Autowired
	SqlSession sqlSession;
	String adrr = "com.spring.mappers.CommentMapper";
	
	@Override
	public List<CommentDto> selectAllCommentList(int no) {
		return sqlSession.selectList(adrr + ".selectAllCommentList", no);
	}

	@Override
	public void insertComment(CommentDto commentDto) {
		sqlSession.insert(adrr+".insertComment", commentDto);
	}

	@Override
	public void updateComment(CommentDto commentDto) {
		sqlSession.update(adrr+".UpdateComment", commentDto);
	}

	@Override
	public void deleteComment(int no) {
		sqlSession.delete(adrr+".deleteComment", no);
	}

	@Override
	public int commentNum(int no) {
		// TODO Auto-generated method stub
		return 0;
	}

}
