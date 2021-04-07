<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Case</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<nav class="navbar navbar-default">
			<div class="container-fluid">
				<div>
					<ul class="nav navbar-nav">
						<li class="active"><a href="#graph.jsp">취향분석표</a></li>
						<li><a href="#myWriteRecipe.jsp">내가 작성한 레시피</a></li>
						<li><a href="#myScrap.jsp">MY스크랩</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="#">더 보기 <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="#eventAlarmMain.jsp">모든 소식</a></li>
								<li><a href="#friendsList.jsp">친구 목록</a></li>
								<li><a href="#">활동 내역</a></li>
							</ul></li>
						<li><a href="following.jsp">팔로윙</a></li>
						<li><a href="follower.jsp">팔로워</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</div>

</body>
</html>
