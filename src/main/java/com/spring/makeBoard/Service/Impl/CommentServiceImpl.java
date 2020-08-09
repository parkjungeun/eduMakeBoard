package com.spring.makeBoard.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.spring.makeBoard.Dao.CommentDao;
import com.spring.makeBoard.Service.CommentService;
import com.spring.makeBoard.dto.CommentDto;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentDao commentDao;

	@Override
	public List<CommentDto> selectAllCommentList(int no) {
		// TODO Auto-generated method stub
		return commentDao.selectAllCommentList(no);
	}

	@Override
	public void insertComment(CommentDto commentDto) {
		commentDao.insertComment(commentDto);
	}

	@Override
	public void updateComment(CommentDto commentDto) {
		commentDao.updateComment(commentDto);
	}

	@Override
	public void deleteComment(int no) {
		commentDao.deleteComment(no);
	}

	@Override
	public int commentNum(int no) {
		return commentDao.commentNum(no);
	}


}
