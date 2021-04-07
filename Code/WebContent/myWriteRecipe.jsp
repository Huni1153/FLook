<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="profile.jsp"%>
<html id="myWriteRecipe_html">
<head>
<title>내가 작성한 레시피</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/profile_js/modal.js" type="text/javascript" charset="UTF-8"></script>
<link rel="stylesheet" type="text/css"href="css/myWriteRecipe_css/myWriteRecipe.css">
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
								<a href="modifyRecipe.jsp" class="info">레시피수정</a><a
									type="button" id="recipeDeleteBtn" class="info"
									>레시피 삭제</a>
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
	<div class="modal fade" id="recipeDeleteModal" role="dialog">
		<div class="modal-dialog2">

			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" id="closeBtn" class="close"
						data-dismiss="modal">&times;</button>
					<h4 class="modal-title">알림</h4>
				</div>
				<div class="modal-body" id="myWriteRecipe_body">
					<p>레시피를 정말로 삭제 하시겠습니까?</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="" id="myWriteRecipe_modal_yesBtn"
						data-dismiss="modal">예</button>
					<button type="button" class="" id="myWriteRecipe_modal_noBtn"
						data-dismiss="modal">아니요</button>
				</div>
			</div>

		</div>
	</div>
</body>
</html>