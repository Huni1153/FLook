<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html id="join_html">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Flook</title>
	<link rel="stylesheet" type="text/css" href="css/profile_css/cs.css">
</head>
<body>
	<div>
		<table id="join_table">
			<th id="join_header">회원가입</th>
			<tr><td id="join_name_parent"><input type="text" id="join_name" placeholder="이름" size="20px" required/></td></tr>
			<tr><td id="join_email_parent"><input type="text" id="join_email" placeholder="이메일 주소" size="20px" required/></td></tr>
			<tr><td id="join_password_parent"><input type="text" id="join_password" placeholder="비밀번호" size="20px" required/></td></tr>
			<tr><td id="join_sex">
				<input type="radio" name="sex" value="female"/>여자
				<input type="radio" name="sex" value="male"/>남자
			</td></tr>
			<tr><td id="join_birthday">
				<input type="text" size="4.9px" class="join_birthdayInput" placeholder="생년">
				<input type="text" size="3px" class="join_birthdayInput" placeholder="월">
				<input type="text" size="3px" class="join_birthdayInput" placeholder="일">
			</td></tr>
			<tr><td><input type="button" id="join_submitBtn" value="회원가입"onclick="location.href='Login.html'"/></td></tr>
		</table>
	</div>
</body>
</html>