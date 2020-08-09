package com.spring.makeBoard.dto;

import java.util.Date;

public class BoardDto {

	private int no;
	private String title;
	private String contents;
	private String writer;
	private Date createdAt;
	private Date updatedAt;
	private char noticeYn;
	private int hit;
	private int commentCnt;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public char getNoticeYn() {
		return noticeYn;
	}
	public void setNoticeYn(char noticeYn) {
		this.noticeYn = noticeYn;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getCommentCnt() {
		return commentCnt;
	}
	public void setCommentCnt(int commentCnt) {
		this.commentCnt = commentCnt;
	}
	
	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", noticeYn=" + noticeYn + ", hit=" + hit
				+ ", commentCnt=" + commentCnt + "]";
	}

}
