package com.spring.makeBoard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.makeBoard.Service.BoardService;
import com.spring.makeBoard.Service.CommentService;
import com.spring.makeBoard.dto.BoardDto;
import com.spring.makeBoard.dto.CommentDto;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@Autowired
	private CommentService commentService;
	
	//1. 게시글 전체 리스트 조회
	@RequestMapping(value = "/boardList.do")
	public ModelAndView selectBoardAllList() {
		List<BoardDto> boardList = boardService.selectAllBoardList();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("BoardList");	//View를 list.jsp로 설정
		mv.addObject("boardList", boardList);		//list.jsp 로 list 값이 전달

		return mv;
	}
	
	//2. 게시글 상세보기
	@RequestMapping(value = "/boardDetail.do")
	public ModelAndView selectBoardDetail(int no) {
		BoardDto boardDto = boardService.selectBoardDetail(no);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("BoardDetail");	
		mv.addObject("boardDto", boardDto);	
		
		List<CommentDto> commentList = commentService.selectAllCommentList(no);
		mv.addObject("commentList", commentList);
		return mv;
	}


	//2-1.게시글 수정하기
	@RequestMapping(value = "/boardUpdate.do")
	public String updateBoard(BoardDto boardDto) {
		boardService.updateBoard(boardDto);
		return "redirect:/boardDetail.do?no="+boardDto.getNo();
	}
	
	//3. 게시글 작성하기
	@RequestMapping(value = "/boardInsert.do")
	public String insertBoard(BoardDto boardDto) {
		boardService.insertBoard(boardDto);
		return "redirect:/boardList.do";
	}
	
	
	//4. 게시글 삭제하기
	@RequestMapping(value = "/boardDelete.do")
	public ModelAndView deleteBoard(int seq) {
		boardService.deleteBoard(seq);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("BoardList");	//View를 list.jsp로 설정
		return mv;
	}
	
	@RequestMapping(value = "/boardWrite.do")
	public String write() {
		return "BoardWrite";
	}
	
	//5. 게시글 수정화면 보이기
	@RequestMapping(value = "/boardModify.do")
	public ModelAndView modify(int no) {
		BoardDto boardDto = boardService.selectBoardDetail(no);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("BoardModify");	
		mv.addObject("boardDto", boardDto);	
		return mv;
	}
	
	//1.댓글 수정하기
	@RequestMapping(value = "/commentUpdate.do")
	public String updateComment(CommentDto commentDto) {
		commentService.updateComment(commentDto);
		return "redirect:/boardDetail.do?no="+commentDto.getBoardNo();
	}
	
	//1-2.댓글  수정화면 보이기
	@RequestMapping(value = "/commentModify.do")
	public ModelAndView modifyComment(CommentDto commentDto) {

		ModelAndView mv = new ModelAndView();

		return mv;
	}
		
	//2. 댓글 작성하기
	@RequestMapping(value = "/commentInsert.do")
	public String insertComment(CommentDto commentDto) {
		commentService.insertComment(commentDto);
		return "redirect:/boardDetail.do?no="+commentDto.getBoardNo();
	}
	
	
	//3. 댓글 삭제하기
	@RequestMapping(value = "/commentDelete.do")
	public String deleteComment(int no, int board_no) {
		commentService.deleteComment(no);
		return "redirect:/boardDetail.do?no="+board_no;
	}
	
}
