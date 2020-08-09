package com.spring.makeBoard.dto;

import java.util.Date;

public class CommentDto {
	private int no;
	private int boardNo;
	private String contents;
	private int depth;
	private Date createdAt;
	private String createdUser;
	private Date updatedAt;
	private String updatedUser;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}
	
	@Override
	public String toString() {
		return "CommentDto [no=" + no + ", boardNo=" + boardNo + ", contents=" + contents + ", depth=" + depth
				+ ", createdAt=" + createdAt + ", createdUser=" + createdUser + ", updatedAt=" + updatedAt
				+ ", updatedUser=" + updatedUser + "]";
	}
	
}
