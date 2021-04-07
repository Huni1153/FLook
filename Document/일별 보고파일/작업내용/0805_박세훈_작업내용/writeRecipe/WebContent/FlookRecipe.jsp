<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="margin.jsp"%>
<!DOCTYPE html>
<html id="myRecipe_html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flook 레시피</title>

<link href="css/flookRecipe_css/myRecipeCSS.css" rel="stylesheet" type="text/css"></link>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/flookRecipe_css/test3.css" type="text/css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>
<body class="myRecipe_body">
	<div class="myRecipe_container">
		<form class="myRecipe_form">
			<div class="container">
				<div id="myRecipe_title">
					<span id="myRecipe_span_title">Flook 요리사</span>
				</div>
				<div class="myRecipe_element" id="myRecipe_category">
					<div class="myRecipe_MainCategory">
						<ul class="nav nav-pills">
						<li id="myRecipe_li_categoryName1"><span id="myRecipe_span_categoryName1" class="myRecipe_span_value" id="">방법별</span></li>
							<li class="active"><a data-toggle="tab" href="#home">밥/죽/스프</a></li>
							<li><a data-toggle="tab" href="#menu1">만두/면류</a></li>
							<li><a data-toggle="tab" href="#menu2">국</a></li>
							<li><a data-toggle="tab" href="#menu3">찌개/전골/탕</a></li>
							<li><a data-toggle="tab" href="#menu4">조림</a></li>
							<li><a data-toggle="tab" href="#menu5">볶음</a></li>
							<li><a data-toggle="tab" href="#menu6">구이</a></li>
							<li><a data-toggle="tab" href="#menu7">튀김/커틀릿</a></li>
							<li><a data-toggle="tab" href="#menu8">부침</a></li>
							<li><a data-toggle="tab" href="#menu9">찜</a></li>
							<li><a data-toggle="tab" href="#menu10">샐러드</a></li>
							<li><a data-toggle="tab" href="#menu11">김치/밑반찬</a></li>
							<li><a data-toggle="tab" href="#menu12">떡/한과</a></li>
							<li><a data-toggle="tab" href="#menu13">빵/과자</a></li>
							<li><a data-toggle="tab" href="#menu14">도시락/간식</a></li>
							<li><a data-toggle="tab" href="#menu15">음료</a></li>
							<li><a data-toggle="tab" href="#menu16">후식</a></li>
							<li><a data-toggle="tab" href="#menu17">양념장</a></li>
							<li><a data-toggle="tab" href="#menu18">그라탕/리조또</a></li>
							<li><a data-toggle="tab" href="#menu19">샌드위치/햄버거</a></li>
							<li><a data-toggle="tab" href="#menu20">야식</a></li>
						</ul>
					</div>
					<div class="myRecipe_MainCategory">
						<ul class="nav nav-pills">
						<li id="myRecipe_li_categoryName2"><span id="myRecipe_span_categoryName2" class="myRecipe_span_value" id="">상황별</span></li>
							<li class="active"><a data-toggle="tab" href="#home">일상</a></li>
							<li><a data-toggle="tab" href="#menu1">손님접대</a></li>
							<li><a data-toggle="tab" href="#menu2">나들이</a></li>
							<li><a data-toggle="tab" href="#menu3">간식</a></li>
							<li><a data-toggle="tab" href="#menu4">초스피드</a></li>
							<li><a data-toggle="tab" href="#menu5">술안주</a></li>
							<li><a data-toggle="tab" href="#menu6">푸드스타일링</a></li>
							<li><a data-toggle="tab" href="#menu7">다이어트쿡</a></li>
							<li><a data-toggle="tab" href="#menu8">영양식</a></li>
							<li><a data-toggle="tab" href="#menu9">야식</a></li>
							<li><a data-toggle="tab" href="#menu10">해장</a></li>
							<li><a data-toggle="tab" href="#menu11">기타</a></li>
						</ul>
					</div>
					<div class="myRecipe_MainCategory">
						<ul class="nav nav-pills">
						<li id="myRecipe_li_categoryName3"><span id="myRecipe_span_categoryName4" class="myRecipe_span_value" id="">나라별</span></li>
							<li class="active"><a data-toggle="tab" href="#home">일상</a></li>
							<li><a data-toggle="tab" href="#menu1">한식</a></li>
							<li><a data-toggle="tab" href="#menu2">양식</a></li>
							<li><a data-toggle="tab" href="#menu3">일식</a></li>
							<li><a data-toggle="tab" href="#menu4">중식</a></li>
							<li><a data-toggle="tab" href="#menu5">기타</a></li>
						</ul>
					</div>
					<div class="myRecipe_MainCategory">
						<ul class="nav nav-pills">
						<li id="myRecipe_li_categoryName4"><span id="myRecipe_span_categoryName4" class="myRecipe_span_value" id="">재료별</span></li>
							<li class="active"><a data-toggle="tab" href="#home">육류</a></li>
							<li><a data-toggle="tab" href="#menu1">해물류</a></li>
							<li><a data-toggle="tab" href="#menu2">건어물류</a></li>
							<li><a data-toggle="tab" href="#menu3">곡류</a></li>
							<li><a data-toggle="tab" href="#menu4">콩/견과류</a></li>
							<li><a data-toggle="tab" href="#menu5">채소류</a></li>
							<li><a data-toggle="tab" href="#menu6">버섯류</a></li>
							<li><a data-toggle="tab" href="#menu7">빵류</a></li>
							<li><a data-toggle="tab" href="#menu8">가공식품류</a></li>
							<li><a data-toggle="tab" href="#menu9">면류/떡류</a></li>
							<li><a data-toggle="tab" href="#menu10">과일류</a></li>
							<li><a data-toggle="tab" href="#menu11">달걀/유제품</a></li>
							<li><a data-toggle="tab" href="#menu12">기타</a></li>
						</ul>
					</div>
				</div>
				<div class="myRecipe_element" id="myRecipe_all_list">
					<div class="tab-content" id="myRecipe_list">
						<div id="home" class="tab-pane fade in active">
							<div class="view view-first">
								<img src="img/flook_img/image6.jpg" />
								<div class="mask">
									<h2>달콤한 식빵바나나롤 뚝딱 만들기</h2>
									<p>달콤한 뉴텔라잼과 딸기잼으로 식빵바나나롤 초간단하게 만들었어요~</p>
									<jsp:include page="fork.jsp"></jsp:include>
								</div>
							</div>
						</div>
						<div id="menu1" class="tab-pane fade">
							<div class="view view-first">
								<img src="img/flook_img/image6.jpg" />
								<div class="mask">
									<h2>Hover Style #1</h2>
									<p>A wonderful serenity has taken possession of my entire
										soul, like these sweet mornings of spring which I enjoy with my
										whole heart.</p>
									<jsp:include page="fork.jsp"></jsp:include>
								</div>
							</div>
						</div>
						<div id="menu2" class="tab-pane fade">
							<div class="view view-first">
								<img src="img/flook_img/image3.jpg" />
								<div class="mask">
									<h2>Hover Style #1</h2>
									<p>A wonderful serenity has taken possession of my entire
										soul, like these sweet mornings of spring which I enjoy with
										my whole heart.</p>
									<jsp:include page="fork.jsp"></jsp:include>
								</div>
							</div>
						</div>
						<div id="menu3" class="tab-pane fade">
							<div class="view view-first">
								<img src="img/flook_img/image4.jpg" />
								<div class="mask">
									<h2>Hover Style #1</h2>
									<p>A wonderful serenity has taken possession of my entire
										soul, like these sweet mornings of spring which I enjoy with
										my whole heart.</p>
									<jsp:include page="fork.jsp"></jsp:include>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>