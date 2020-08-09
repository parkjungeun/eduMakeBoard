<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>게시판</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel = "stylesheet" href="../../resources/static/css/BoardWrite.css"></link>
</head>

<script type="text/javascript">
	function goUrl(url) {
		location.href=url;
	}
</script>

<body>
		<table class="board_write_form" >
			<tr>
				<td> 조회수 </td>
				<td> ${boardDto.hit} </td>
			</tr>
				        
			<tr>
				<td> 제목 </td>
				<td> ${boardDto.title} </td>
			</tr>
			
			<tr>
				<td> 작성자 </td>
				<td> ${boardDto.writer} </td>
			</tr>
			
			<tr>
				<td> 공지사항 </td>
				<td>
					${boardDto.noticeYn}
				</td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td> ${boardDto.contents} </td>	
			</tr>
			
			<tr class="btn" align="center" valign="middle">
	            <td colspan="2">
	            	<input type="button" value="수정" onclick="location.href='/boardModify.do?no=${boardDto.no}'">
	                <input type="button" value="목록" onclick="goUrl('/boardList.do');">
	                <input type="button" value="삭제" onclick="location.href='/boardDelete.do?no=${boardDto.no}'">                  
	            </td>
	        </tr>
	        
	     </table>
	     
	     <h3> 댓글  </h3> 
	     <jsp:include page="CommentList.jsp" />
	     

		<form method="get" name="CommentForm" action="/commentInsert.do">
			<table class="comment_write_form" >	        
				<tr>
					<td> 작성자 </td>
					<td>
						<input name="createdUser" id="writer" type="text" />
					</td>
					
					<td colspan="2" rowspan="2" align="right"> 
		        		<input type="submit" value="저장" >
		        	</td>	
				</tr>
				<tr>
					<td> 내용  </td>
					<td>
						<textarea name="contents" id="contents" cols="72" rows="5"></textarea>					
					</td>	
				</tr>
				
		        <input type="hidden" name="boardNo" value="${boardDto.no}" />
		        
		     </table>
		</form>
</body>
</html>