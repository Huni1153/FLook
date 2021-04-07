<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html id="join_html">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Flook</title>
	<link rel="stylesheet" type="text/css" href="css/profile_css/cs.css">
	<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
</head>
<script type="text/javascript">
/* 추후 통합 시 스크립트 이동의 불편함이 있을것이라 생각되어 따로 script 태그에 작성함.
통합자 마음대로 변경가능.*/
$(document).ready(function(){
	$("#join_submitBtn").click(function(){
		
		/* 아이디중복체크해야됨 */
		if($("#join_name").val().trim()=="") {
			alert("이름은 필수입니다!!!");
			$("#join_name").focus();
			return;
		} else if ($("#join_email").val().trim()=="") {
			alert("이메일(아이디)는 필수입니다!!!");
			$("#join_email").focus();
			return;
		} else if ($("#join_password").val().trim()=="") {
			alert("비밀번호는 필수입니다!!!");
			
			$("#join_password").focus();
			return ;
		} else if($(':radio[name=sex]:checked').val()==null) {
			alert("성별을 체크해 주세요!");
			return;
		} else if($("#join_birthday_yearId").val().trim()=="" || $("#join_birthday_monthId").val().trim()==""|| $("#join_birthday_dayId").val().trim()=="") {
			alert("생년월일은 필수입니다!!");
			if($("#join_birthday_yearId").val().trim()=="") {
				$("#join_birthday_yearId").focus();
			} else if( $("#join_birthday_monthId").val().trim()=="") {
				$("#join_birthday_monthId").focus();
			} else if( $("#join_birthday_dayId").val().trim()=="" ) {
				$("#join_birthday_dayId").focus();
			}
			return ;
			
		}  else if(typeof parseInt($("#join_birthday_yearId").val().trim())!="number" || typeof parseInt($("#join_birthday_monthId").val().trim())!="number" || typeof parseInt($("#join_birthday_dayId").val().trim())!="number") {
			if(typeof parseInt($("#join_birthday_yearId").val().trim())!= "number") {
				$("#join_birthday_yearId").focus();
				alert(typeof $("#join_birthday_yearId").val());
				
				
			} else if (typeof parseInt($("#join_birthday_monthId").val().trim())!="number") {
				$("#join_birthday_monthId").focus();
				
				
			} else // if (typeof parseInt($("#join_birthday_dayId").val().trim)!="number")  
			{
				$("#join_birthday_dayId").focus();
				
				
			}
			alert("생년월일은 숫자만 가능합니다!");
			
			return;
		}
		alert("회원가입이 완료되었습니다!!");
		$("#join_form_id").submit();
		
		
	});
});
</script>
<body>
	<form method="post" action="join" name="join_form_name" id="join_form_id"><!-- 기호추가 -->
		<div>
			<table id="join_table">
				<th id="join_header">회원가입</th>
				<tr><td id="join_name_parent"><input type="text" id="join_name" name="join_name_name" placeholder="이름" size="20px" required value="${requestScope.userName }"/></td></tr>
				<tr><td id="join_email_parent"><input type="text" id="join_email" name="join_email_name" placeholder="이메일 주소" size="20px" required/></td></tr>
				<tr><td id="join_password_parent"><input type="password" id="join_password" name="join_password_name" placeholder="비밀번호" size="20px" required/></td></tr>
				<tr><td id="join_gender" name="join_gender">
					<input type="radio" name="sex" value="female"/>여자
					<input type="radio" name="sex" value="male"/>남자
				</td></tr>
				<tr><td id="join_birthday">
					<input type="text" size="4.9px" id="join_birthday_yearId" name="join_birthday_year" class="join_birthdayInput" placeholder="생년">
					<input type="text" size="3px" id="join_birthday_monthId" name="join_birthday_month" class="join_birthdayInput" placeholder="월">
					<input type="text" size="3px" id="join_birthday_dayId" name="join_birthday_day" class="join_birthdayInput" placeholder="일">
				</td></tr>
				<tr><td><input type="button" id="join_submitBtn" value="회원가입"/></td></tr>
			</table>
		</div>
	</form>
</body>
</html>