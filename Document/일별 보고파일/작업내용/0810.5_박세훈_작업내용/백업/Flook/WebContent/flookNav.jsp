<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Bootstrap JavaScript-->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="css/main_css/assets/js/slick.min.js"></script>
<script
	src="css/main_css/assets/js/rs-plugin/js/jquery.themepunch.plugins.min.js"></script>
<script
	src="css/main_css/assets/js/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
<script src="css/main_css/assets/js/waypoints.min.js"></script>
<script src="css/main_css/assets/js/scripts.js"></script>
<!-- flookRecipe조회 스크립트 -->
<script src="js/simpleRecipe_js/flookRecipe.js" type="text/JavaScript"
	charset="UTF-8"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
	<script src="js/profile_js/myWriteRecipe.js" type="text/javascript"
	charset="UTF-8"></script>
<!-- Bootstrap CSS-->
<link rel="stylesheet" href="css/main_css/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="css/main_css/assets/css/styles.css">
<link rel="stylesheet" type="text/css" href="css/profile_css/cs.css">
<link href="css/viewCart_css/viewCart.css" rel="stylesheet">
<link href="css/main_css/cs.css" rel="stylesheet">
<!-- 부트스트랩 js파일(드롭박스)위해서 사용 -->
<header id="main_header">
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation"
		id="flookNav_bar">
		<div class="container" id="main_container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header" id="main_content">
				<input type="image" src="css/main_css/assets/img/r2d2/logo.png"
					class="logo" id="main_logo" onclick="location.href='main.jsp'">
				<!-- flookRecipe 목록 조회 -->
				<form method="post" action="recipeFlook"
					id="flookNav_flookRecipe_form" style="display: inline">
					<a href="FlookRecipe.jsp" id="main_kindof" onclick="flookRecipe();"
						class="sliding-middle-out" style="text-decoration: none"><span
						class="main_flook_recipe_btn" id="flookNav_flookRecipeBtn">Flook레시피</span></a>
				</form>
				<a href="myRecipe.jsp" id="main_imcooker" class="sliding-middle-out"
					style="text-decoration: none"><span
					class="main_flook_recipe_btn">나도 요리사</span></a>
				<!-- <input type="text"placeholder="search" id="main_search" /> -->
				<form method="post" action="search" id="flookNav_search_form"
					style="display: inline">
					<input type="text" placeholder="search" id="main_search"
						name="search_input_keyword"></input>
				</form>
				<script type="text/javascript">
					$('#main_search').keypress(function(event) {
						if (event.which == 13) {
							$("#flookNav_search_form").submit();
						}
					});
				</script>
				<!-- <img src="img/main_img/bell.png" id="main_bell" class="main_header_icon"/> -->
				<!-- <input type="image" src="img/main_img/bell.png" id="main_bell" class="main_header_icon"> -->


				<div style="display: block-inline;" class="dropdown"
					id="flookNav_bell">
					<a id="dLabel1" data-target="#" data-toggle="dropdown"
						aria-haspopup="true" role="button" aria-expanded="false"> <input
						type="image" src="img/main_img/bell.png" id="main_bell"
						class="main_header_icon"><span class="caret"></span>
					</a>
					<ul id="viewAlarm_alarm" class="dropdown-menu" role="menu"
						aria-labelledby="dLabel">
						<div class="eventAlarm_table">
							<table>
								<tr>
									<td rowspan="2"><input type="image"
										id="friendsList_profileImg"
										src="img/profile_img/10345982_852744308099397_1882240356207679456_n.jpg" /></td>
									<td>김정윤님이 리코타치즈샐러드 게시물을 좋아합니다.</td>
									<td rowspan="2"><input type="image"
										id="eventAlarm_table_foodImg"
										src="img/profile_img/1301-609224-Grilled-tun-steks--l-nicoise-recipe.jpg" /></td>
								</tr>
								<tr>
									<td>4시간 전</td>
								</tr>
							</table>
						</div>
						<div class="eventAlarmMain_space"></div>
						<div class="eventAlarm_table">
							<table>
								<tr>
									<td rowspan="2"><input type="image"
										id="friendsList_profileImg"
										src="img/profile_img/10345982_852744308099397_1882240356207679456_n.jpg" /></td>
									<td>김정윤님이 리코타치즈샐러드 게시물을 좋아합니다.</td>
									<td rowspan="2"><input type="image"
										id="eventAlarm_table_foodImg"
										src="img/profile_img/1301-609224-Grilled-tun-steks--l-nicoise-recipe.jpg" /></td>
								</tr>
								<tr>
									<td>4시간 전</td>
								</tr>
							</table>
						</div>
						<div class="eventAlarmMain_space"></div>
						<div class="eventAlarm_table">
							<table>
								<tr>
									<td rowspan="2"><input type="image"
										id="friendsList_profileImg"
										src="img/profile_img/10345982_852744308099397_1882240356207679456_n.jpg" /></td>
									<td>김정윤님이 리코타치즈샐러드 게시물을 좋아합니다.</td>
									<td rowspan="2"><input type="image"
										id="eventAlarm_table_foodImg"
										src="img/profile_img/1301-609224-Grilled-tun-steks--l-nicoise-recipe.jpg" /></td>
								</tr>
								<tr>
									<td>4시간 전</td>
								</tr>
							</table>
						</div>
						<div class="eventAlarmMain_space"></div>
						<div id="eventAlarm_table_moreBtn">
							<a href="eventAlarmMain.jsp">+ 더 보기</a>
						</div>
					</ul>

				</div>

				<!-- <input type="image" src="img/main_img/ShoppingCart.png" id="main_shoppingCart" class="main_header_icon"/> -->
				<script>
				$(document).ready(function(){
					$("#dLabel2").click(function(){
						$.ajax({
							url:'CartServlet',
							type:'POST',
							data:{"cartKindOf":"readOnly"},
							success : function(data) {
								$("#viewCart_cart").append(data);
							}
						});
					});
				});
				</script>
				<div style="display: inline-block;" class="dropdown"
					id="flookNav_cart">
					<!--	클릭했을때 리스트가 출력되는 방식 부트스트랩 적용되었으므로 class명 변경하면 안됨  -->
					<a id="dLabel2" data-target="#" data-toggle="dropdown"
						aria-haspopup="true" role="button" aria-expanded="false"> <input
						type="image" src="img/main_img/ShoppingCart.png"
						id="main_shoppingCart" class="main_header_icon"> <span
						class="caret"></span>

					</a>

					<ul id="viewCart_cart" class="dropdown-menu" role="menu"
						aria-labelledby="dLabel">
						<!-- 가로 400 세로 200 스롤바 적용 리스트 스타일 박스 -->
						
					</ul>
				</div>


				<input type="image" src="img/main_img/Newspid.png" id="main_newspid"
					class="main_header_icon" onclick="location.href='newsFeed'" />
				<a href="#" onclick="myRecipe()" id="main_kindof" class="sliding-middle-out"
					style="text-decoration: none"><span
					class="main_flook_recipe_btn"><c:if
							test="${sessionScope.userName != null}">${sessionScope.userName}</c:if></span></a>
				<input type="image" src="${sessionScope.userImage}"
					id="main_profile" class="main_header_icon" />
			</div>
		</div>
	</nav>
</header>
