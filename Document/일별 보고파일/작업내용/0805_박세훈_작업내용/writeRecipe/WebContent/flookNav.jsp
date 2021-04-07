<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script src="css/main_css/assets/js/jquery-1.11.1.min.js"></script>
<script src="css/main_css/assets/js/slick.min.js"></script>
<script
	src="css/main_css/assets/js/rs-plugin/js/jquery.themepunch.plugins.min.js"></script>
<script
	src="css/main_css/assets/js/rs-plugin/js/jquery.themepunch.revolution.min.js"></script>
<script src="css/main_css/assets/js/waypoints.min.js"></script>
<script src="css/main_css/assets/js/scripts.js"></script>
<link rel="stylesheet" href="css/main_css/assets/css/bootstrap.min.css">
<link rel="stylesheet" href="css/main_css/assets/css/styles.css">

<link rel="stylesheet" type="text/css" href="css/profile_css/cs.css">
<!-- 알림벨 사용위해 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<!-- 부트스트랩 js파일(드롭박스)위해서 사용 -->
<link href="css/viewCart_css/viewCart.css" rel="stylesheet">
<link href="css/main_css/cs.css" rel="stylesheet">
<header id="main_header">
	<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
		<div class="container" id="main_container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<input type="image" src="css/main_css/assets/img/r2d2/logo.png"
					class="logo" id="main_logo" onclick="location.href='main.jsp'">
				<a href="FlookRecipe.jsp" id="main_kindof"
					class="sliding-middle-out"><span class="main_flook_recipe_btn">Flook레시피</span></a>
				<a href="myRecipe.jsp" id="main_imcooker" class="sliding-middle-out"><span
					class="main_flook_recipe_btn">나도 요리사</span></a> <input type="text"
					placeholder="search" id="main_search" />
				<!-- <img src="img/main_img/bell.png" id="main_bell" class="main_header_icon"/> -->
				<!-- <input type="image" src="img/main_img/bell.png" id="main_bell" class="main_header_icon"> -->

				<div style="display: block-inline;" class="dropdown">
					<a id="dLabel" data-target="#" data-toggle="dropdown"
						aria-haspopup="true" role="button" aria-expanded="false"> <input
						type="image" src="img/main_img/bell.png" id="main_bell"
						class="main_header_icon"><span class="caret"></span>
					</a>
					<ul id="viewAlarm_alarm"class="dropdown-menu" role="menu" aria-labelledby="dLabel">
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

				<div style="display: inline-block;" class="dropdown">
					<!--	클릭했을때 리스트가 출력되는 방식 부트스트랩 적용되었으므로 class명 변경하면 안됨  -->
					<a id="dLabel" data-target="#" data-toggle="dropdown"
						aria-haspopup="true" role="button" aria-expanded="false"> <input
						type="image" src="img/main_img/ShoppingCart.png"
						id="main_shoppingCart" class="main_header_icon"> <span
						class="caret"></span>

					</a>

					<ul id="viewCart_cart" class="dropdown-menu" role="menu"
						aria-labelledby="dLabel">
						<!-- 가로 400 세로 200 스롤바 적용 리스트 스타일 박스 -->
						<ul>
							<label>채소/과일</label>
							<li role="separator" class="divider"></li>
							<!-- 라인 나누는 줄 -->
							<li role="presentation">

								<div class="viewCart_ingredient">
									<img class="viewCart_ingredient_img"
										src="img/viewCart_img/boochoo.png"">부추 1줌 / 부추삼겹살
								</div>
								<div class="viewCart_marker_delete">
									<img class="viewCart_marker_img"
										src="img/viewCart_img/marker.png"> <a href="#"><img
										class="viewCart_delete_img"
										src="img/viewCart_img/paper_basket.png" id="delToast"></a>
								</div>
							</li>
							<li role="presentation"><div class="viewCart_ingredient">
									<img class="viewCart_ingredient_img"
										src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSXZFwXpwfSEO9sNg5EMqFLInK_RKDp_atdOqZ0GVkCL_dkBbB5kg">양파
									2개/양파절임
								</div>
								<div class="viewCart_marker_delete">
									<img class="viewCart_marker_img"
										src="img/viewCart_img/marker.png"> <a href="#"><img
										class="viewCart_delete_img"
										src="img/viewCart_img/paper_basket.png" class="delToast"></a>
								</div></li>
						</ul>
						<ul>
							<label>정육/난류</label>
							<li role="separator" class="divider"></li>
							<li role="presentation">

								<div class="viewCart_ingredient"">
									<img class="viewCart_ingredient_img"
										src="http://www.njkoreabbq.com/wp-content/uploads/2014/03/sam.png">삼겹살
									600g / 부추삼겹살
								</div>
								<div class="viewCart_marker_delete">
									<img class="viewCart_marker_img"
										src="img/viewCart_img/marker.png""> <a href="#"><img
										class="viewCart_delete_img"
										src="img/viewCart_img/paper_basket.png"></a>
								</div>
							</li>
						</ul>
				</div>


				<input type="image" src="img/main_img/Newspid.png" id="main_newspid"
					class="main_header_icon" onclick="location.href='newspeed.jsp'" />
				<a href="" id="main_kindof" class="sliding-middle-out"><span
					class="main_flook_recipe_btn">음식파트너</span></a> <a href="profile.jsp"
					id="main_kindof" class="sliding-middle-out"><span
					class="main_flook_recipe_btn">김정윤</span></a> <input type="image"
					src="img/main_img/kwongiho.png" id="main_profile"
					class="main_header_icon" />
			</div>
		</div>
	</nav>
</header>
