<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="writeRecipe" enctype="multipart/form-data" method="post">
작성자 : <input type="text" name="name"/><br/>
첫번째 파일 <input type="file" name="filename"/>  <input type="file" name="filename"/>
<br/>
세번째 파일 <input type="file" name="filename2"/>
<br/><select name="personNumber">
					<option value="0">인원</option>
					<option value="1">1인분</option>
					<option value="2">2인분</option>
					<option value="3">3인분</option>
					<option value="4">4인분</option>
					<option value="5">5인분이상</option>
				</select>
<input type="submit" value="업로드"/>
</form>

</body>
</html>