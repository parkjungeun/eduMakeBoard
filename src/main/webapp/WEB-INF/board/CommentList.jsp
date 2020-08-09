<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table class="comment_list">
			<tbody>
			
				<c:choose>
					 <c:when test="${fn:length(commentList) eq 0 }" >
					 	<td colspan="2"> 등록된 댓글이 없습니다. </td>
					 </c:when>
					 
					  <c:otherwise>
						<c:forEach var="row" items="${commentList}" varStatus="status">
							<tr>
								<td>작성자  : ${row.createdUser} &nbsp;&nbsp;&nbsp;&nbsp;</td>
								<td></td>
								<td>
									작성일 : <fmt:formatDate value="${row.createdAt}" pattern="yyyy-MM-dd" />
								</td>
							</tr>
							<tr>
								<td colspan="2"> ${row.contents} </td>
								<td>
									<input type="button" value="수정" onclick="location.href='/commentModify.do?no=${row.no}'">
									<input type="button" value="삭제" onclick="location.href='/commentDelete.do?no=${row.no}&board_no=${row.boardNo}'">
								</td>
							</tr>
						</c:forEach>
					  </c:otherwise>
				</c:choose>
									
			</tbody>
		</table>
	</div>
</body>
</html>