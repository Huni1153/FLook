<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<!-- <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script> -->
<!-- <link rel="stylesheet" type="text/css"
	href="css/myWriteRecipe_css/myWriteRecipe.css"> -->


<div class="container">

	<!-- Trigger the modal with a button -->
</div>
<!-- Modal -->
<div class="modal fade" id="detailRecipeModal" role="dialog">
	<div id="detailRecipeBackground">
		<div class="modal-dialog2" id="detailRecipeModalContent">
			<div class="modal-content" id="detailRecipe_modal">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel"></h4>
				</div>
				<div class="modal-body" id="testUserIdTag">
					<div id="recipe_see">
						<div id="recipe_see_section1">
							<div id="recipe_description_image">
								<img src="${userUIBean.userImage }" id="recipe_userImg">
							</div>
							<div id="recipe_description_see">
								<h4 id="recipe_description_title_see">사용자 한마디</h4>
								<textarea id="recipe_description_textarea_see">${userUIBean.recipeDescription }</textarea>
							</div>
							<div id="recipe_event">
								<input type="image" src="img/main_img/Share.png" class="recipe_see_button" id="shareBtn"> 
								<input type="image" src="img/main_img/heart_empty.png" class="recipe_see_button" id="heart_Btn" value="${post.postCode }">
								<input type="image" src="img/main_img/unBookmark.png" class="recipe_see_button" id="bookmarkBtn" value="${post.postCode }">
							</div>
							<div id="recipe_name">
								<h1 id="recipe_name_see">${userUIBean.recipeName }</h1>
								<form action="modifyRecipe" style="display: inline">
								<input type="submit" value="수정" id="recipe_modify_see"><input type="hidden" value='${recipeCode}' name="recipeCode"/>
								</form>
								<a type="button" id="recipe_delete_see" class="info"
												href="javascript:myRecipeDelete2('${recipeCode}')">삭제</a>
							</div>

							<div id="recipe_infomation_description_see">
								<p>
									조리시간 :
									<c:choose>
										<c:when test="${userUIBean.cookingTime eq '120' }">2시간 이내</c:when>
										<c:when test="${userUIBean.cookingTime eq '120over' }">2시간 이상</c:when>
										<c:otherwise>${userUIBean.cookingTime}분 이내</c:otherwise>
									</c:choose>
								</p>
								<p>난이도 : 쉬움</p>
							</div>
							<div id="recipe_use_ingredient">
								<form method="get" action="" id="ingredient_list">
									<h4 id="recipe_name_see">사용된 재료</h4>
									<p style="display: inline">
										<c:choose>
											<c:when test="${userUIBean.personNumber<5 }">${userUIBean.personNumber }인분</c:when>
											<c:otherwise>5인분 이상</c:otherwise>
										</c:choose>
									</p>
									<!-- <input type="button" value="계량법"> -->
									<div id="recipe_main_ingredient">
										<h5>주재료</h5>
										<c:forEach var="mainIngredient"
											items="${userUIBean.mainIngredientList }">
											<p>
												<input type="checkbox" name="recipe_ingredientM" >${mainIngredient.ingredientName }
												${mainIngredient.ingredientAmount }${mainIngredient.ingredientUnit }"
											</p>

										</c:forEach>
									</div>
									<div id="recipe_sub_ingredient">
										<h5>부재료</h5>
										<c:forEach var="subIngredient"
											items="${userUIBean.subIngredientList }">
											<p>
												<input type="checkbox" name="recipe_ingredient" >${subIngredient.ingredientName }
												${subIngredient.ingredientAmount }${subIngredient.ingredientUnit }
											</p>

										</c:forEach>
									</div>
									<script type="text/javascript">
										$(document).ready(function(){
											$("#recipe_ingredient_add_cart").click(function(){
												$.ajax({
													url:'CartServlet',
													type:'POST',
													data:{"cartKindOf" : "addCart" , "ingredient_list" : $("#ingredient_list").serialize()},
													success:function(data) {
														alert("consol에 ㅊ가할껴 확인 후 이메세지확인");
													}
												});
											})
										});
									</script>
									<input type="button" value="장바구니에 추가"
										id="recipe_ingredient_add_cart" onclick="location.href='javascript:hi();''">
								</form>

							</div>
						</div>
						<div id="recipe_see_section2">
							<div id="recipe_complete"
								style="width: 300px; height: 300px;">
								<img src='${requestScope.userUIBean.completeImage}'
									id="recipe_main_img" />
							</div>

							<div id="recipe_categori_see">
								<h3>카테고리 정보</h3>
								<span id="recipe_nation_see" class="recipe_categori">나라별${userUIBean.countryCategory }</span>
								<span id="recipe_life_see" class="recipe_categori">재료별${userUIBean.ingredientCategory }</span>
								<span id="recipe_kindof_see" class="recipe_categori">분류별${userUIBean.kindCategory }</span>
								<span id="recipe_meet_see" class="recipe_categori">상황별${userUIBean.situationCategory }</span>
								<span class="recipe_categori">방법별${userUIBean.methodCategory }</span>
							</div>
							<div id="recipe_cooking_course">
								<!-- jstl나올자리 -->
								<h3>레시피</h3>
								<c:forEach var="cooking" items="${userUIBean.cookingList}">
									<div class="block">
										<img src='${cooking.cookingImage}'
											class="recipe_cooking_course_img">
										<textarea class="recipe_cooking_course_infomation">${cooking.cookingDescription }</textarea>
									</div>
								</c:forEach>
								<div>
									<!-- 댓글 나오는 곳 -->
								<%-- 	<jsp:include page="commentWrite_jsw.jsp"></jsp:include>
									<jsp:include page="commentForm.jsp"></jsp:include> --%>
									<c:forEach var="comment" items="${requestScope.commentList }">
										<div id="comment_writer_container">
											<div class="comment-main-level" id="${comment.commentCode }">
												<!-- Avatar -->
												<div class="comment-avatar">
													<img src="${sessionScope.userImage }" alt="">
												</div>
												<div class="comment-box">
													<div class="comment-head ">
														<!-- by-author  -->
														<a href="http://creaticode.com/blog" id="writer_name">${sessionScope.userName }</a>
														<p id="writen_date">${comment.commentDate }</p>
														<!--작가  -->
														<p class="comment-content">${comment.commentContents }</p>
														<div>
															<a type="button" id="comment_modify_button"
																href="javascript:modifyButton('${requestScope.comment.commentCode }')">수정</a>
															<a type="button" id="comment_delete_button"
																href="javascript:deleteButton('${requestScope.comment.commentCode }')">삭제</a>
														</div>
													</div>
												</div>
											</div>
										</div>
									</c:forEach>
								</div>
							</div>
							<button type="button" data-dismiss="modal" id="myDetailRecipeViewCloseBtn">확인</button>
						</div>
					</div>
				</div>
				<div class="modal-footer" id="recipe_see_section3">
					<!-- <button type="button" class="btn btn-primary">Save changes</button> -->
				</div>
			</div>
		</div>
	</div>
</div>
<div class="modal fade" id="detailRecipeDeleteModal" role="dialog">
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