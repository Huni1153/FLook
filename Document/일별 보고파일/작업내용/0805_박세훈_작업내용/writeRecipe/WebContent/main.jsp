<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script><!-- nav+all -->
<script src="js/main_js/js.js" type="text/javascript" charset="UTF-8"></script>
<!-- <script src="css/main_css/assets/js/jquery-1.11.1.min.js"></script> --><!-- nav -->
<!-- <script src="css/main_css/assets/js/slick.min.js"></script> --><!-- nav -->
<script src="css/main_css/assets/js/rs-plugin/js/jquery.themepunch.revolution.min.js"></script><!--  -->
<!-- <script src="css/main_css/assets/js/waypoints.min.js"></script> --><!-- nav -->
<script src="css/main_css/assets/js/scripts.js"></script><!-- nav --><!-- temp delete -->
<script src="//rawgit.com/Soldier-B/jquery.toast/master/jquery.toast/jquery.toast.min.js"></script><!-- toastMessage -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script><!-- Bootstrap JavaScript-->
<!-- <script src="js/custom.js"></script> --><!-- Custom JavaScript--><!-- temp delete -->
<!-- <script src="css/main_css/assets/js/rs-plugin/js/jquery.themepunch.plugins.min.js"></script> --><!-- 필요없음. -->

<!-- <script src="//code.jquery.com/jquery-1.6.3.min.js"></script> -->

<!-- test -->
<!-- <script	src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script> -->
<link href="http://codeseven.github.io/toastr/toastr.css"rel="stylesheet" type="text/css" />
<script src="http://codeseven.github.io/toastr/toastr.js"></script>
<script src="js/main_js/myToast.js"></script>
<!--  -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <link href="css/main_css/cs.css" rel="stylesheet" type="text/css"> -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css"><!-- Bootstrap CSS -->
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css"><!-- font Awesome CSS -->
<!-- <link href="css/main.css" rel="stylesheet"> --><!-- temp delete -->
<link rel="stylesheet" href="css/main_css/assets/css/bootstrap.min.css">
<!-- <link rel="stylesheet" href="css/main_css/assets/css/styles.css"> --><!-- nav -->
<link rel="stylesheet" href="//rawgit.com/Soldier-B/jquery.toast/master/jquery.toast/jquery.toast.min.css" /><!-- toastMessage -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- <link rel="stylesheet" type="text/css" href="css/style_common.css" /> --><!-- 권기호 추가-사진 hover -->
<!-- <link rel="stylesheet" type="text/css" href="css/style1.css" /> --><!-- 권기호 추가-사진 hover -->




		
<!-- <link rel="author" href="https://plus.google.com/+Scoopthemes">
<link rel="publisher" href="https://plus.google.com/+Scoopthemes"> -->

<!--      jQuery
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
-->
<!-- Main Styles CSS -->
<!--[if lt IE 9]>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<![endif]-->
<title>FLOOK 나의 최고의 레시피</title>

    

</head><!-- sliding-middle-out -->
<body>
	<jsp:include page="flookNav.jsp"></jsp:include>
    <%-- <header id="main_header" >
        
		<jsp:include page="flookNav.jsp" flush="false"/>
	        <nav class="navbar navbar-default navbar-fixed-top" role="navigation">
                <div class="container" id="main_container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header">
                            <input type="image" src="assets/img/r2d2/logo.png"  class="logo" id="main_logo">
							<a href="" id="main_kindof" class="sliding-middle-out"><span class="main_flook_recipe_btn">Flook레시피</span></a>
							<a href="" id="main_imcooker" class="sliding-middle-out"><span class="main_flook_recipe_btn">나도 요리사</span></a>
							<input type="text" placeholder="search" id="main_search"/>
							<!-- <img src="image/bell.png" id="main_bell" class="main_header_icon"/> -->
							<input type="image" src="image/bell.png" id="main_bell" class="main_header_icon">
							<input type="image" src="image/ShoppingCart.png" id="main_shoppingCart" class="main_header_icon"/>
							<input type="image" src="image/Newspid.png" id="main_newspid" class="main_header_icon"/>
							<a href="" id="main_kindof" class="sliding-middle-out"><span class="main_flook_recipe_btn">음식파트너</span></a>
							<a href="" id="main_kindof" class="sliding-middle-out"><span class="main_flook_recipe_btn">김정윤</span></a>
							<input type="image" src="image/kwongiho.png" id="main_profile" class="main_header_icon"/>
                    </div>
                </div>
        </nav>

    </header> --%>
    <div id="wrapper">
        <div id="mainCarousel" class="carousel slide" data-ride="carousel">
              <!-- Indicators -->
              <ol class="carousel-indicators">
                <li data-target="#mainCarousel" data-slide-to="0" class="active"></li>
                <li data-target="#mainCarousel" data-slide-to="1"></li>
                <li data-target="#mainCarousel" data-slide-to="2"></li>
              </ol>
              <!-- Wrapper for slides -->
              <div class="carousel-inner" role="listbox">
                <div class="item active">
                  <img src="img/main_img/banner/B0PMEC4WED.jpg" alt="..." class="main_banner">
                  <div class="carousel-caption">
                    <h3>Slide Caption</h3>
                  </div>
                </div>
                <div class="item">
                  <img src="img/main_img/banner/banner_slider1.jpg" alt="..." class="main_banner">
                  <div class="carousel-caption">
                    <h3>Slide Caption</h3>
                  </div>
                </div>
                <div class="item">
                  <img src="img/main_img/banner/slider3.jpg" alt="..." class="main_banner">
                  <div class="carousel-caption">
                    <h3>Slide Caption</h3>
                  </div>
                </div>
              </div>
              <!-- Controls -->
              <!-- <a class="left carousel-control" href="#mainCarousel" role="button" data-slide="prev">
                <span class="glyphicon glyphicon-chevron-left"></span>
                <span class="sr-only">Previous</span>
              </a>
              <a class="right carousel-control" href="#mainCarousel" role="button" data-slide="next">
                <span class="glyphicon glyphicon-chevron-right"></span>
                <span class="sr-only">Next</span>
              </a> -->
        </div>

            <hr>
            <hr>
        </div> 
    </div>
    <!-- /#wrapper -->








<div id="main_body">
	<ol>
		<li class="main_li">
			<div id="main_today_recommend">
				<div id="main_today_recomment_title" class="main_today_recommend_div">
					<img src="img/main_img/body/recommend_title.png" id="main_today_recomment_title1" />
				</div>
				<div id="main_today_recomment_main" class="main_today_recommend_div">
					<img src="img/main_img/body/recommend_img1.png" id="main_today_recomment_image1" />
				</div>
				<!-- <div id="main_today_recomment_main_temp"> -->
				<div id="main_today_recomment_sub" class="main_today_recommend_div">
						<% for(int i=2;i<6;i++) { %>
							<img src="img/main_img/recipe/recipe_0000<%=i%>.jpg" id="main_today_recomment_image<%=i %>" class="main_today_image"/>
						<% } %>
						
				</div>
				<!-- </div> -->
			</div>
		</li>
		<li class="main_moreSee_li">
			<p class="main_moreSee">전체보기</p>
		</li>
		
		
		<li class="main_li">
			<div id="main_feeling_recommend">
				<div id="main_feeling_recommend_title" class="main_feeling_recommend_div">
					<img src="img/main_img/body/fityourfeeling.png" id="main_feeling_recomment_image1" class="main_feeling_recommend_div"/>
				</div>			
				<input type="image" src="img/main_img/body/rightButton.png" id="main_rightButton" class="main_rightButton_">
				<div id="main_feeling_recomment_sub" class="main_feeling_recommend_div">
					<% for(int i=0;i<6;i++) { %><!--  --><!--  --><!--  --><!--  --><!--  --><!--  --><!--  --><!--  -->
						<div class="view view-first">
							<img src="img/main_img/recipe/recipe_0000<%=i%>.jpg" id="main_today_recomment_image2" class="main_seasonWeather_image"/>
						</div>
					<%} %>
				</div>
			</div>
			<div id="main_feeling_recommend_change">
				<% for(int i=10;i<18;i++) { %>
					<img src="img/main_img/recipe/recipe_000<%=i%>.jpg" id="main_today_recomment_image2" class="main_seasonWeather_image"/>
				<%} %>
			</div>
		</li>
			
		
		<li class="main_moreSee_li">
			<p class="main_moreSee">전체보기</p>
		</li>
		<li class="main_li">
			<div id="main_situation_recommend">
				<div id="main_situation_recommend_title" class="main_situation_recommend_div">
					<img src="img/main_img/body/whatsituation.png" id="main_situation_recomment_image1" class="main_situation_recommend_div"/>
				</div>
					<input type="image" src="img/main_img/body/rightButton.png" id="main_rightButton" class="main_rightButton_">
					
				
					<div id="main_situation_recomment_sub" class="main_situation_recommend_div">
						<% for(int i=0;i<6;i++) { %>
							<img src="img/main_img/recipe/recipe_0000<%=i%>.jpg" id="main_today_recomment_image2" class="main_seasonWeather_image"/>
						<%} %>
					</div>
				
					
			</div>
					
		</li>
		<li class="main_moreSee_li">
			<p class="main_moreSee">전체보기</p>
		</li>
		<li class="main_li">
			<div id="main_seasonWeather_recommend">
				<div id="main_seasonWeather_recommend_title" class="main_seasonWeather_recommend_div">
					<img src="img/main_img/body/thisseasonorweather.png" id="main_seasonWeather_recomment_image1" class="main_seasonWeather_recommend_div"/>
				</div>
					<input type="image" src="img/main_img/body/rightButton.png" id="main_rightButton" class="main_rightButton_">
					
				
				<div id="main_seasonWeather_recomment_sub" class="main_seasonWeather_recommend_div">
					<% for(int i=0;i<6;i++) { %><!-- jstl로바껴야됨 -->
						<img src="img/main_img/recipe/recipe_0000<%=i%>.jpg" id="main_today_recomment_image2" class="main_seasonWeather_image"/>
					<%} %>
				</div>
			</div>
		</li>
		<li class="main_moreSee_li">
			<p class="main_moreSee">전체보기</p>
		</li>
		<li class="main_li">
			<div id="main_movie_recommend">
				<div id="main_movie_recommend_title" class="main_movie_recommend_div">
					
				</div>
				<div id="main_movie_recomment_main" class="main_movie_recommend_div">
					
					<video width="450" height="320" controls><source src="movie/BackTeacher_1.mp4" type="video/mp4"></video>
					<video width="450" height="320" controls><source src="movie/BackTeacher_2.mp4" type="video/mp4"></video>
					<video width="450" height="320" controls><source src="movie/BackTeacherGamingMouse.mp4" type="video/mp4"></video>
				
				
					
				</div>
			</div>
		</li>
	</ol>
</div>
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal" id="tempBtn">
  Flook 요리사 레시피 조회
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="ttt">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Recipe Only See</h4>
      </div>
      <div class="modal-body">
      
        <div id="recipe_see">
			<div id="recipe_complete">
				<img src="img/main_img/body/slide1.jpg" id="recipe_main_img">
				
			</div>
			<div id="recipe_name">
				<h1 id="recipe_name_see">레시피명</h2>
				<input type="button" value="수정" id="recipe_modify_see">
				<input type="button" value="삭제" id="recipe_delete_see">
				<input type="image" src="img/main_img/Share.png" class="recipe_see_button" id="shareBtn">
				<input type="image" src="img/main_img/heart_empty.png" class="recipe_see_button" id="heart_Btn">
				<input type="image" src="img/main_img/Bookmark.png" class="recipe_see_button" id="bookmarkBtn">
			</div>
			<div id="recipe_categori_see">
				<span id="recipe_kindof_see" class="recipe_categori">볶음</span>
				<span id="recipe_life_see" class="recipe_categori">일상</span>
				<span id="recipe_nation_see" class="recipe_categori">한식</span>
				<span id="recipe_meet_see" class="recipe_categori">육류</span>
			</div>
			<div id="recipe_description_see">
				<h4 id="recipe_description_title_see">레시피 설명.</h4>
				<textarea id="recipe_description_textarea_see"></textarea>
			</div>
			<div id="recipe_infomation_description_see">
				<p>분량 : 3인분</p>
				<p>조리시간 : 30분이내</p>
				<p>난이도 : 쉬움</p>
			</div>
			<div id="recipe_use_ingredient">
				<form method="get" action="">
					<h2 id="recipe_name_see">사용된 재료</h2><input type="button" value="계량법">
						<div id="recipe_main_ingredient">
							<h5>주재료</h6>
							<p><input type="checkbox" name="recipe_ingredient">김치 한포기</p>
							<p><input type="checkbox" name="recipe_ingredient">쌀 300g</p>
							<p><input type="checkbox" name="recipe_ingredient">돼지고기 100g</p>
						</div>
						<div id="recipe_sub_ingredient">
							<h5>부재료</h5>
							<p><input type="checkbox" name="recipe_ingredient">소금1T</p>
						</div>
					<input type="button" value="장바구니에 추가" id="recipe_ingredient_add_cart">
				</form>
				
			</div>
				<div id="recipe_cooking_course">
					<!-- jstl나올자리 -->
					<div class="block"><img src="img/main_img/body/feeling_img1.png" class="recipe_cooking_course_img"><textarea class="recipe_cooking_course_infomation"></textarea></div>
					<div class="block"><img src="img/main_img/body/feeling_img2.png" class="recipe_cooking_course_img"><textarea class="recipe_cooking_course_infomation"></textarea></div>
					<div class="block"><img src="img/main_img/body/feeling_img3.png" class="recipe_cooking_course_img"><textarea class="recipe_cooking_course_infomation"></textarea></div>
				
				</div>
			</div>
      </div>
      <jsp:include page="commentList_jsw.jsp"></jsp:include>
      <jsp:include page="commentWrite_jsw.jsp"></jsp:include>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <!-- <button type="button" class="btn btn-primary">Save changes</button> -->
      </div>
    </div>
  </div>
</div>
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal2" id="tempBtn">
  나도 요리사 레시피 조회
</button>
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="ttt">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Recipe Only See</h4>
      </div>
      <div class="modal-body">
      
        <div id="recipe_see">
			<div id="recipe_complete">
				<img src="img/main_img/body/slide1.jpg" id="recipe_main_img">
			</div>
			<div id="recipe_name">
				<h1 id="recipe_name_see">레시피명</h2>
				<input type="button" value="수정" id="recipe_modify_see">
				<input type="button" value="삭제" id="recipe_delete_see">
				<input type="image" src="img/main_img/Share.png" class="recipe_see_button" id="shareBtn">
				<input type="image" src="img/main_img/heart_empty.png" class="recipe_see_button" id="heart_Btn">
				<input type="image" src="img/main_img/Bookmark.png" class="recipe_see_button" id="bookmarkBtn">
			</div>
			<div id="recipe_categori_see">
				<span id="recipe_kindof_see" class="recipe_categori">볶음</span>
				<span id="recipe_life_see" class="recipe_categori">일상</span>
				<span id="recipe_nation_see" class="recipe_categori">한식</span>
				<span id="recipe_meet_see" class="recipe_categori">육류</span>
			</div>
			<div id="recipe_description_image">
				<img src="img/main_img/KakaoTalk_20150731_154845675.png" id="recipe_userImg">
			</div>
			<div id="recipe_description_see">
				<h4 id="recipe_description_title_see">사용자 한마디</h4>
				<textarea id="recipe_description_textarea_see"></textarea>
			</div>
			<div id="recipe_infomation_description_see">
				<p>분량 : 3인분</p>
				<p>조리시간 : 30분이내</p>
				<p>난이도 : 쉬움</p>
			</div>
			<div id="recipe_use_ingredient">
				<form method="get" action="">
					<h2 id="recipe_name_see">사용된 재료</h2><input type="button" value="계량법">
						<div id="recipe_main_ingredient">
							<h5>주재료</h6>
							<p><input type="checkbox" name="recipe_ingredient">김치 한포기</p>
							<p><input type="checkbox" name="recipe_ingredient">쌀 300g</p>
							<p><input type="checkbox" name="recipe_ingredient">돼지고기 100g</p>
						</div>
						<div id="recipe_sub_ingredient">
							<h5>부재료</h5>
							<p><input type="checkbox" name="recipe_ingredient">소금1T</p>
						</div>
					<input type="button" value="장바구니에 추가" id="recipe_ingredient_add_cart">
				</form>
				
			</div>
				<div id="recipe_cooking_course">
					<!-- jstl나올자리 -->
					<div class="block"><img src="img/main_img/body/feeling_img1.png" class="recipe_cooking_course_img"><textarea class="recipe_cooking_course_infomation"></textarea></div>
					<div class="block"><img src="img/main_img/body/feeling_img2.png" class="recipe_cooking_course_img"><textarea class="recipe_cooking_course_infomation"></textarea></div>
					<div class="block"><img src="img/main_img/body/feeling_img3.png" class="recipe_cooking_course_img"><textarea class="recipe_cooking_course_infomation"></textarea></div>
				
				</div>
			</div>
      </div>
      <jsp:include page="commentList_jsw.jsp"></jsp:include>
      <jsp:include page="commentWrite_jsw.jsp"></jsp:include>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <!-- <button type="button" class="btn btn-primary">Save changes</button> -->
      </div>
    </div>
  </div>
</div>
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal3" id="tempBtn">
  동영상 레시피 조회
</button>
<div class="modal fade" id="myModal3" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" id="ttt">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Recipe Only See</h4>
      </div>
      <div class="modal-body">
      
        <div id="recipe_see">
			<div id="recipe_complete">
				<video width="450" height="320" controls><source src="movie/BackTeacher_1.mp4" type="video/mp4"></video>
			</div>
			<div id="recipe_name">
				<h1 id="recipe_name_see">레시피명</h2>
				<input type="button" value="수정" id="recipe_modify_see">
				<input type="button" value="삭제" id="recipe_delete_see">
				<input type="image" src="img/main_img/Share.png" class="recipe_see_button" id="shareBtn">
				<!-- <input type="image" src="img/main_img/heart_empty.png" class="recipe_see_button" id="heart_Btn"> -->
				<img src="img/main_img/heart_empty.png" class="recipe_see_button" id="heart_Btn">
				<!-- <input type="image" src="img/main_img/Bookmark.png" class="recipe_see_button" id="bookmarkBtn"> -->
				<img src="img/main_img/Bookmark.png" class="recipe_see_button" id="bookmarkBtn">
				<script type="text/javascript">
				/*차후에 형이 편하신곳으로 코드 빼시면 됩니다.*/
				
					
				$("#heart_Btn").click(function(){
						if($("#heart_Btn").attr("src")=="img/main_img/heart_empty.png") {
							$("#heart_Btn").attr("src","img/main_img/heart_fill.png");					
						} else {
							$("#heart_Btn").attr("src","img/main_img/heart_empty.png")
						}
					});
				$("#bookmarkBtn").click(function(){
						 if( $("#bookmarkBtn").attr("src")=="img/main_img/Bookmark.png") {
							$("#bookmarkBtn").attr("src","img/main_img/unBookmark.png");
						 } else {
							 $("#bookmarkBtn").attr("src","img/main_img/Bookmark.png");
						 } 
					});
				
				
				</script>
			</div>
			<div id="recipe_categori_see">
				<span id="recipe_kindof_see" class="recipe_categori">볶음</span>
				<span id="recipe_life_see" class="recipe_categori">일상</span>
				<span id="recipe_nation_see" class="recipe_categori">한식</span>
				<span id="recipe_meet_see" class="recipe_categori">육류</span>
			</div>
			<div id="recipe_description_see">
				<h4 id="recipe_description_title_see">레시피 설명.</h4>
				<textarea id="recipe_description_textarea_see"></textarea>
			</div>
			<div id="recipe_infomation_description_see">
				<p>분량 : 3인분</p>
				<p>조리시간 : 30분이내</p>
				<p>난이도 : 쉬움</p>
			</div>
			<div id="recipe_use_ingredient">
				<form method="get" action="">
					<h2 id="recipe_name_see">사용된 재료</h2><input type="button" value="계량법">
						<div id="recipe_main_ingredient">
							<h5>주재료</h6>
							<p><input type="checkbox" name="recipe_ingredient">김치 한포기</p>
							<p><input type="checkbox" name="recipe_ingredient">쌀 300g</p>
							<p><input type="checkbox" name="recipe_ingredient">돼지고기 100g</p>
						</div>
						<div id="recipe_sub_ingredient">
							<h5>부재료</h5>
							<p><input type="checkbox" name="recipe_ingredient">소금1T</p>
						</div>
					<input type="button" value="장바구니에 추가" id="recipe_ingredient_add_cart">
				</form>
				
			</div>
				<div id="recipe_cooking_course">
					<!-- jstl나올자리 -->
					<div class="block"><img src="img/main_img/body/feeling_img1.png" class="recipe_cooking_course_img"><textarea class="recipe_cooking_course_infomation"></textarea></div>
					<div class="block"><img src="img/main_img/body/feeling_img2.png" class="recipe_cooking_course_img"><textarea class="recipe_cooking_course_infomation"></textarea></div>
					<div class="block"><img src="img/main_img/body/feeling_img3.png" class="recipe_cooking_course_img"><textarea class="recipe_cooking_course_infomation"></textarea></div>
				
				</div>
			</div>
      </div>
      <jsp:include page="commentList_jsw.jsp"></jsp:include>
      <jsp:include page="commentWrite_jsw.jsp"></jsp:include>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <!-- <button type="button" class="btn btn-primary">Save changes</button> -->
      </div>
    </div>
  </div>
</div>
</body>
</html>