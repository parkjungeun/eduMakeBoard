<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
	<title>게시판</title>
	<link rel = "stylesheet" href="../../resources/static/css/BoardList.css"></link>
</head>

<script type="text/javascript">
	function goUrl(url) {
		location.href=url;
	}
</script>

<body>
	<div class="board_list_wrap">
		<input type="button" value = "글쓰기" class ="btn" onclick="goUrl('/boardWrite.do');"/>
		
		<table class="board_list">
			<caption>게시판 만들기</caption>
			<thead>
				<tr>
					<th>No</th>
					<th>제목</th>
					<th>내용</th>
					<th>작성자</th>
					<th>작성일</th>
					<th>조회수</th>
				</tr>
			</thead>
	
			<tbody>
			
				<c:choose>
					 <c:when test="${fn:length(boardList) eq 0 }" >
					 	<td colspan="7"> 등록된 게시글이 없습니다. </td>
					 </c:when>
					 
					  <c:otherwise>
						<c:forEach var="row" items="${boardList}" varStatus="status">
							<tr>
								<td>${status.count}</td>
								<td style="display:none;">${row.no}</td>
								<td> 
									<c:set var = "notice" value="${row.noticeYn}" />
									<c:if test="${fn:indexOf(notice,'Y') == 0}"> [★]   </c:if> 
									<a href="/boardDetail.do?no=${row.no}">  ${row.title}</a> [${row.commentCnt}]	
								</td>
								<td> ${row.contents} </td>
								<td>${row.writer}</td>
								<td>
									<fmt:formatDate value="${row.createdAt}" pattern="yyyy-MM-dd" />
								</td>
								<td>${row.hit}</td>
							</tr>
						</c:forEach>
					  </c:otherwise>
				</c:choose>
									
			</tbody>
		</table>
	</div>
</body>
</html>