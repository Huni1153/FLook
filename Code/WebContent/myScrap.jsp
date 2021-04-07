<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="profile.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="assets/js/jquery-1.11.1.min.js"></script><!-- nav -->
<script src="js/profile_js/modal.js" type="text/javascript" charset="UTF-8"></script>
<link rel="stylesheet" type="text/css" href="css/myScrap_css/style_common.css" /><!-- 권기호 추가-사진 hover -->
<link rel="stylesheet" type="text/css" href="css/myScrap_css/style1.css" /><!-- 권기호 추가-사진 hover -->
</head>
<body>
	<div id="profile_my_write_recipe_area">
		<% for(int i=0;i<10;i++){ %><!-- 추후 jstl로 변경. -->
			
				<div class="view view-first">
					<img src="img/myRecipe_img/image4.jpg" class="profile_myWrite_recipe"/>
					<div class="mask">
					    <h2>달콤한 식빵바나나롤 뚝딱 만들기</h2>
					    <p>달콤한 뉴텔라잼과 딸기잼으로 식빵바나나롤 초간단하게 만들었어요~</p>
					    <a type="button" id="recipeDeleteBtn" class="info">스크랩 삭제</a>
					</div>
				</div>
		<% } %>
	</div>
		<!-- Modal -->
	<div class="modal fade" id="scrapDeleteModal" role="dialog">
		<div class="modal-dialog2">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" id="closeBtn" class="close"
						data-dismiss="modal">&times;</button>
					<h4 class="modal-title">알림</h4>
				</div>
				<div class="modal-body" id="myWriteRecipe_body">
					<p>스크랩을 정말로 삭제 하시겠습니까?</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="" id="myScrap_modal_yesBtn"
						data-dismiss="modal">예</button>
					<button type="button" class="" id="myScrap_modal_noBtn"
						data-dismiss="modal">아니요</button>
				</div>
			</div>

		</div>
	</div>
	<footer id="profile_footer">
		
	</footer>
</body>
</html>