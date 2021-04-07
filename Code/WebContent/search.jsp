<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="js/search_js/jquery.js"></script><script src="js/search_js/jquery.raty.js"></script>
<!-- <script src="js/search_js/jquery.js"></script> -->
<script src="js/search_js/labs.js" type="text/javascript"></script>
<script src="js/search_js/search.js" type="text/javascript"></script>
<!-- <script src="js/search_js/custom.js"></script> --><!-- 사이드바 토글 -->

<link rel="stylesheet" href="css/search_css/labs.css" media="screen" type="text/css"><!-- 포크 모이게해줌-->
<link rel="stylesheet" href="css/search_css/style_common.css">

<link rel="stylesheet" href="css/search_css/style1.css">
<link rel="stylesheet" href="css/search_css/main.css">
<link rel="author" href="https://plus.google.com/+Scoopthemes">
<link rel="publisher" href="https://plus.google.com/+Scoopthemes">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"><!-- Bootstrap CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"><!-- font Awesome CSS -->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.search_result_list {
	display : inline;
}
</style>
</head>
<body id="search_body">
	<%-- <jsp:include page="flookNav.jsp"></jsp:include> --%>
    <div id="wrapper">

        <aside id="sideBar">
            <ul class="main-nav">
                <!-- Your Logo Or Site Name -->
                <li class="nav-brand">
                    <a href="#"><img src="css/main_css/assets/img/r2d2/logo.png" alt="" id="search_logo"></a>
                </li>
                <!-- Search -->
                <li class="main-search">
                    <form action="search" method="post" id="search_search_form">
                        <input type="text" class="form-control search-input" placeholder="Search here..." id="search_search" name="search_input_keyword">
                        <i class="fa fa-search"></i>
					<script type="text/javascript">
						$('#search_search').keypress(function(event) {
							if (event.which == 13) {
								$("#search_search_form").submit();
							}
						});
					</script>
					
				</form>
                </li>
                	<li>
                		<a href="#" id="allSee">- 전체보기</a>
                	</li>
                	<li>
                		<a href="#" id="recipeName">- 레시피명</a>
                	</li>
                	<li>
                		<a href="#" id="userName">- 사용자명</a>
                	</li>
                	<li>
                		<a href="#" id="hashTag">- 해시태그</a>
                	</li>
            </ul>
        </aside>
			<script type="text/javascript">
				$(document).ready(function(){
					
					$("#allSee").click(function(){
						$(".search_result_list").show();
					});
					$("#recipeName").click(function(){
						$(".search_result_list").hide();
						$("#search_one_recipeName").show();
						$("#search_three_userRecipeName").show();
					});
					$("#userName").click(function(){
						$(".search_result_list").hide();
						$("#search_five_userList").show();
					});
					$("#hashTag").click(function(){
						$(".search_result_list").hide();
						$("#search_two_recipeHashTag").show();
						$("#search_four_userRecipeHashTag").show();
					});
				});
			</script>
		<div id="search_result">
			<div id="search_one_recipeName" class="search_result_list">
				<c:forEach var="searchData" items="${simpleRecipeByName }">
					<div class="view view-first">
						<img src="img/main_img/banner/banner_slider1.jpg" class="search_result_img"/>
						<div class="mask">
							<h2>달콤한 식빵바나나롤 뚝딱 만들기</h2>
							<p>달콤한 뉴텔라잼과 딸기잼으로 식빵바나나롤 초간단하게 만들었어요~</p>
							<jsp:include page="ratingFork.jsp"></jsp:include>
	                        <a href="#" class="info">레시피수정</a>
	                        <a href="#" class="info">레시피삭제</a>						
						</div>
					</div> 
				</c:forEach>
			</div>
			<div id="search_two_recipeHashTag" class="search_result_list">
				<c:forEach var="searchData" items="${simpleRecipeByHashTag }">
					<div class="view view-first">
						<img src="img/main_img/banner/banner_slider1.jpg" class="search_result_img"/>
						<div class="mask">
							<h2>달콤한 식빵바나나롤 뚝딱 만들기</h2>
							<p>달콤한 뉴텔라잼과 딸기잼으로 식빵바나나롤 초간단하게 만들었어요~</p>
							<jsp:include page="ratingFork.jsp"></jsp:include>
	                        <a href="#" class="info">레시피수정</a>
	                        <a href="#" class="info">레시피삭제</a>						
						</div>
					</div> 
				</c:forEach>
			</div>
			<div id="search_three_userRecipeName" class="search_result_list">
				<c:forEach var="searchData" items="${simpleUserRecipeByName }">
					<div class="view view-first">
						<img src="img/main_img/banner/banner_slider1.jpg" class="search_result_img"/>
						<div class="mask">
							<h2>달콤한 식빵바나나롤 뚝딱 만들기</h2>
							<p>달콤한 뉴텔라잼과 딸기잼으로 식빵바나나롤 초간단하게 만들었어요~</p>
							<jsp:include page="ratingFork.jsp"></jsp:include>
	                        <a href="#" class="info">레시피수정</a>
	                        <a href="#" class="info">레시피삭제</a>						
						</div>
					</div> 
				</c:forEach>
			</div>
			<div id="search_four_userRecipeHashTag" class="search_result_list">
				<c:forEach var="searchData" items="${simpleUserRecipeByHashTag }">
					<div class="view view-first">
						<img src="img/main_img/banner/banner_slider1.jpg" class="search_result_img"/>
						<div class="mask">
							<h2>달콤한 식빵바나나롤 뚝딱 만들기</h2>
							<p>달콤한 뉴텔라잼과 딸기잼으로 식빵바나나롤 초간단하게 만들었어요~</p>
							<jsp:include page="ratingFork.jsp"></jsp:include>
	                        <a href="#" class="info">레시피수정</a>
	                        <a href="#" class="info">레시피삭제</a>						
						</div>
					</div> 
				</c:forEach>
			</div>
			<div id="search_five_userList" class="search_result_list">
				<c:forEach var="searchData" items="${UserList }">
					<div class="view view-first">
						<img src="img/main_img/banner/banner_slider1.jpg" class="search_result_img"/>
						<div class="mask">
							<h2>달콤한 식빵바나나롤 뚝딱 만들기</h2>
							<p>달콤한 뉴텔라잼과 딸기잼으로 식빵바나나롤 초간단하게 만들었어요~</p>
							<jsp:include page="ratingFork.jsp"></jsp:include>
	                        <a href="#" class="info">레시피수정</a>
	                        <a href="#" class="info">레시피삭제</a>						
						</div>
					</div> 
				</c:forEach>
			</div>
			
		</div>

    </div>
</body>
</html>