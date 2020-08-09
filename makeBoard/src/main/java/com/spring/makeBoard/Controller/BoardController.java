package com.spring.makeBoard.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.makeBoard.Service.BoardService;
import com.spring.makeBoard.dto.BoardDto;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;

	//1. 게시글 리스트 조회
	@RequestMapping(value = "/boardlist.do")
	public ModelAndView selectBoard() {
		List<BoardDto> list = boardService.selectAllBoardList();
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Boardlist");	//View를 list.jsp로 설정
		mv.addObject("list", list);		//list.jsp 로 list 값이 전달
		return mv;
	}
	
	
	
	//입력
	
	//수정
	
	//삭제
}
