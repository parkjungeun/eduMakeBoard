package com.spring.makeBoard.dto;

import java.util.Date;

public class BoardDto {

	private int seqNo;
	private String title;
	private String content;
	private String writer;
	private Date cdate;
	private Date udate;
	private String noticeYn;
	private int views;
	private int replyCnt;
	/*
	// 댓글 관련 Col
	private int seqNo;
	private int commentSeqNo;
	private String commentWriter;
	private String commentContent;
	private Date commentCdate;
	private Date commentUdate;
	*/
	

	public int getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(int seqNo) {
		this.seqNo = seqNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Date getUdate() {
		return udate;
	}

	public void setUdate(Date udate) {
		this.udate = udate;
	}

	public String getNoticeYn() {
		return noticeYn;
	}

	public void setNoticeYn(String noticeYn) {
		this.noticeYn = noticeYn;
	}
	
	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getReplyCnt() {
		return replyCnt;
	}

	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}

	@Override
	public String toString() {
		return "BoardDto [seqNo=" + seqNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", cdate=" + cdate + ", udate=" + udate + ", noticeYn=" + noticeYn + ", views=" + views
				+ ", replyCnt=" + replyCnt + "]";
	}

}
