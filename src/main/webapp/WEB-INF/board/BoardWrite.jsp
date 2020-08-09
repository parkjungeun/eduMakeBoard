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

	function check(){
        var title = document.writeForm.title;
        var writer = document.writeForm.writer;
        var contents = document.writeForm.contents;
                
        if(title.value==""){
            alert("제목을 입력해주세요.");
            title.focus();
            return false;
        }else if(writer.value==""){
            alert("작성자를 입력해주세요.");
            writer.focus();
            return false;
        }else if(contents.value==""){
            alert("내용을 입력해주세요.");
            contents.focus();
            return false;
        }else{
            alert("글이 등록됩니다.");

            if(document.writeForm.checkYn.checked == true) {
            	document.writeForm.noticeYn.value = 'Y';
            }
            else {
            	document.writeForm.noticeYn.value = 'N';
            }

            return true;
        }
    }

</script>

<body>
	<form method="get" name="writeForm" onsubmit="return check()" action="/boardInsert.do">
		<table class="board_write_form" >	        
			<tr>
				<td> 제목 </td>
				<td>
					<input name="title" id="title" type="text" />
				</td>
			</tr>
			
			<tr>
				<td> 작성자 </td>
				<td>
					<input name="writer" id="writer" type="text" />
				</td>
			</tr>
			
			<tr>
				<td> 공지사항 </td>
				<td>
					<input name="checkYn" id="checkYn" type="checkbox"/>
					<input type="hidden" name="noticeYn" />
				</td>
			</tr>
			<tr>
				<td> 내용 </td>
				<td>
					<textarea name="contents" id="contents" cols="72" rows="15"></textarea>					
				</td>	
			</tr>
			
			<tr class="btn" align="center" valign="middle">
	            <td colspan="2">
	                <input type="reset"  value="작성취소" >
	                <input type="submit" value="저장" >
	                <input type="button" value="뒤로가기" onclick="goUrl('/boardList.do');">            
	            </td>
	        </tr>	
	     </table>
	</form>
</body>
</html>