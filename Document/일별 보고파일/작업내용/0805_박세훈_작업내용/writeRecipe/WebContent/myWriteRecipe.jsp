<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html id="myWriteRecipe_html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="css/myWriteRecipe_css/myWriteRecipe.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	  <link rel="stylesheet" href="css/check_css/check.css">
<title>Insert title here</title>

</head>
<body id="myWriteRecipe_body">
	<div id="myWriteRecipe_container">
		<div id="myWriteRecipe_content">
			<div id="myWriteRecipe_elements">
				<div class="header_jsw">
					<div class="main_jsw">
						<%
							for (int i = 0; i < 6; i++) {
						%>
						<div class="view view-first">
							<img src="img/myRecipe_img/image1.jpg" />
							<div class="mask">
								<h2>달콤한 식빵바나나롤 뚝딱 만들기</h2>
								<p>달콤한 뉴텔라잼과 딸기잼으로 식빵바나나롤 초간단하게 만들었어요~</p>
								<a href="modifyRecipe.jsp" class="info">레시피수정</a> <button type="button" class="btn btn-info btn-lg" data-toggle="check" data-target="#myModal">레시피삭제</button>
							</div>
						</div>
						<%
							}
						%>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Modal -->
	<div class="modal fade" id="myModal" role="dialog">
		<div class="check-modal">

			<!-- Modal content-->
			<div class="check-content">
				<div class="check-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="check-title">알림</h4>
				</div>
				<div class="check-body">
					<p>정말로 삭제 하시겠습니까?</p>
				</div>
				<div class="check-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">예</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">아니요</button>
				</div>
			</div>

		</div>
	</div>
</body>
</html>