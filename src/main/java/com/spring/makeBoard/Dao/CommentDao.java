package com.spring.makeBoard.Dao;

import java.util.List;

import com.spring.makeBoard.dto.CommentDto;

public interface CommentDao {
	
	//전체 조회
	List<CommentDto> selectAllCommentList(int no);
	
	//입력
	void insertComment(CommentDto commentDto);
	
	//수정
	void updateComment(CommentDto commentDto);
	
	//삭제
	void deleteComment(int no);
	
	//갯수 조회
	int commentNum(int no);
}
