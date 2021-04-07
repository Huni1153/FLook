<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html id="myRecipe_html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>나만의 레시피</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link href="css/myRecipe_css/myRecipeCSS.css" rel="stylesheet" type="text/css"></link>
<link rel="stylesheet" href="css/myRecipe_css/test3.css" type="text/css">
</head>
<body class="myRecipe_body">
				<script>
					var method=0;
					var situation=0;
					var nation=0;
					var ingredient=0;
					window.onload = function() {
						
						$(".myRecipe_method").click(function(){
							method=$(".myRecipe_method").index(this);
							asyncSend();
							 
						});
						$(".myRecipe_situation").click(function(){
							situation = $(".myRecipe_situation").index(this);
							asyncSend();
						});
						$(".myRecipe_nation").click(function(){
							nation = $(".myRecipe_nation").index(this);
							asyncSend();
						});
						$(".myRecipe_ingredient").click(function(){
							ingredient=$(".myRecipe_ingredient").index(this);
							asyncSend();
						});
						
						function getXR() {
							var req;
							try {
								req = new XMLHttpRequest();
							} catch (e) {
								try {
									req = new ActionXObject("Msxml2.XMLHTTP");
								} catch (q) {
									req = new ActionObject("Microsoft.XMLHTTP");
								}
							}
							return req;
						}
						function asyncSend() {
							var req = getXR();
							req.onreadystatechange = function() {
								if (req.readyState == 4) {
									if (req.status == 200) {
										  /* $("#myRecipe_list").append(req.responseText); 
										 alert(req.responseText);   */
										 var tempp=$("#myRecipe_list");
										 $(tempp).html(req.responseText);
										 
									} else {
										alert("서버 에러발생");
									}
								}
							};
							
							req.open("post", "UserRecipeServlet", true);/*true로 할 경우만 비동기통신*/
							req.setRequestHeader("content-type","application/x-www-form-urlencoded; charset=UTF-8");
							req.send("method="+method+"&"+"situation="+situation+"&nation="+nation+"&ingredient="+ingredient); //*email 서블릿에서 받고 싶을때 getParameter("email") 하믄됨*/
							
						}
					};
				</script>
<div id="myRecipe_banner"></div>
	<div class="myRecipe_container">
		<form class="myRecipe_form">
			<div class="container">
				<div id="myRecipe_title">
					<span id="myRecipe_span_title">나도 요리사</span>
				</div>
				<div class="myRecipe_element" id="myRecipe_category">
					<div class="myRecipe_MainCategory">
						<ul class="nav nav-pills">
						<li id="myRecipe_li_categoryName1"><span id="myRecipe_span_categoryName1" class="myRecipe_span_value" id="">방법별</span></li>
							<li class="active"><a data-toggle="tab" href="#home" class="myRecipe_method">밥/죽/스프</a></li>
							<li><a data-toggle="tab" href="#menu1" class='myRecipe_method' value="만두/면류" >만두/면류</a></li>
							<li><a data-toggle="tab" href="#menu2" class="myRecipe_method" >국</a></li>
							<li><a data-toggle="tab" href="#menu3" class="myRecipe_method">찌개/전골/탕</a></li>
							<li><a data-toggle="tab" href="#menu4" class="myRecipe_method" value="조림">조림</a></li>
							<li><a data-toggle="tab" href="#menu5" class="myRecipe_method">볶음</a></li>
							<li><a data-toggle="tab" href="#menu6" class="myRecipe_method">구이</a></li>
							<li><a data-toggle="tab" href="#menu7" class="myRecipe_method">튀김/커틀릿</a></li>
							<li><a data-toggle="tab" href="#menu8" class="myRecipe_method">부침</a></li>
							<li><a data-toggle="tab" href="#menu9" class="myRecipe_method">찜</a></li>
							<li><a data-toggle="tab" href="#menu10" class="myRecipe_method">샐러드</a></li>
							<li><a data-toggle="tab" href="#menu11" class="myRecipe_method">김치/밑반찬</a></li>
							<li><a data-toggle="tab" href="#menu12" class="myRecipe_method">떡/한과</a></li>
							<li><a data-toggle="tab" href="#menu13" class="myRecipe_method">빵/과자</a></li>
							<li><a data-toggle="tab" href="#menu14" class="myRecipe_method">도시락/간식</a></li>
							<li><a data-toggle="tab" href="#menu15" class="myRecipe_method">음료</a></li>
							<li><a data-toggle="tab" href="#menu16" class="myRecipe_method">후식</a></li>
							<li><a data-toggle="tab" href="#menu17" class="myRecipe_method">양념장</a></li>
							<li><a data-toggle="tab" href="#menu18" class="myRecipe_method">그라탕/리조또</a></li>
							<li><a data-toggle="tab" href="#menu19" class="myRecipe_method">샌드위치/햄버거</a></li>
							<li><a data-toggle="tab" href="#menu20" class="myRecipe_method">야식</a></li>
						</ul>
					</div>
					<div class="myRecipe_MainCategory">
						<ul class="nav nav-pills">
						<li id="myRecipe_li_categoryName2"><span id="myRecipe_span_categoryName2" class="myRecipe_span_value" id="">상황별</span></li>
							<li class="active"><a data-toggle="tab" href="#home" class="myRecipe_situation">일상</a></li>
							<li><a data-toggle="tab" href="#menu1" class="myRecipe_situation">손님접대</a></li>
							<li><a data-toggle="tab" href="#menu2" class="myRecipe_situation">나들이</a></li>
							<li><a data-toggle="tab" href="#menu3" class="myRecipe_situation">간식</a></li>
							<li><a data-toggle="tab" href="#menu4" class="myRecipe_situation">초스피드</a></li>
							<li><a data-toggle="tab" href="#menu5" class="myRecipe_situation">술안주</a></li>
							<li><a data-toggle="tab" href="#menu6" class="myRecipe_situation">푸드스타일링</a></li>
							<li><a data-toggle="tab" href="#menu7" class="myRecipe_situation">다이어트쿡</a></li>
							<li><a data-toggle="tab" href="#menu8" class="myRecipe_situation">영양식</a></li>
							<li><a data-toggle="tab" href="#menu9" class="myRecipe_situation">야식</a></li>
							<li><a data-toggle="tab" href="#menu10" class="myRecipe_situation">해장</a></li>
							<li><a data-toggle="tab" href="#menu11" class="myRecipe_situation">기타</a></li>
						</ul>
					</div>
					<div class="myRecipe_MainCategory">
						<ul class="nav nav-pills">
						<li id="myRecipe_li_categoryName3"><span id="myRecipe_span_categoryName4" class="myRecipe_span_value" id="">나라별</span></li>
							<li class="active"><a data-toggle="tab" href="#home" class="myRecipe_nation">일상</a></li>
							<li><a data-toggle="tab" href="#menu1" class="myRecipe_nation">한식</a></li>
							<li><a data-toggle="tab" href="#menu2" class="myRecipe_nation">양식</a></li>
							<li><a data-toggle="tab" href="#menu3" class="myRecipe_nation">일식</a></li>
							<li><a data-toggle="tab" href="#menu4" class="myRecipe_nation">중식</a></li>
							<li><a data-toggle="tab" href="#menu5" class="myRecipe_nation">기타</a></li>
						</ul>
					</div>
					<div class="myRecipe_MainCategory">
						<ul class="nav nav-pills">
						<li id="myRecipe_li_categoryName4"><span id="myRecipe_span_categoryName4" class="myRecipe_span_value" id="">재료별</span></li>
							<li class="active"><a data-toggle="tab" href="#home" class="myRecipe_ingredient">육류</a></li>
							<li><a data-toggle="tab" href="#menu1" class="myRecipe_ingredient">해물류</a></li>
							<li><a data-toggle="tab" href="#menu2" class="myRecipe_ingredient">건어물류</a></li>
							<li><a data-toggle="tab" href="#menu3" class="myRecipe_ingredient">곡류</a></li>
							<li><a data-toggle="tab" href="#menu4" class="myRecipe_ingredient">콩/견과류</a></li>
							<li><a data-toggle="tab" href="#menu5" class="myRecipe_ingredient">채소류</a></li>
							<li><a data-toggle="tab" href="#menu6" class="myRecipe_ingredient">버섯류</a></li>
							<li><a data-toggle="tab" href="#menu7" class="myRecipe_ingredient">빵류</a></li>
							<li><a data-toggle="tab" href="#menu8" class="myRecipe_ingredient">가공식품류</a></li>
							<li><a data-toggle="tab" href="#menu9" class="myRecipe_ingredient">면류/떡류</a></li>
							<li><a data-toggle="tab" href="#menu10" class="myRecipe_ingredient">과일류</a></li>
							<li><a data-toggle="tab" href="#menu11" class="myRecipe_ingredient">달걀/유제품</a></li>
							<li><a data-toggle="tab" href="#menu12" class="myRecipe_ingredient">기타</a></li>
						</ul>
					</div>
				</div>
				<div class="myRecipe_element" id="myRecipe_all_list">
					<div id="myRecipe_recipeWrite">
						<input type="button" id="myRecipe_input_recipeWrite"
							value="레시피 작성하기" onclick="location.href='writeRecipe.jsp'">
					</div>
					<div class="tab-content" id="myRecipe_list">
						
							<%-- <div id="home" class="tab-pane fade in active">
								<div class="view view-first">
									<img src="img/myRecipe_img/image0.jpg" />
									<div class="mask">
										<h2>달콤한 식빵바나나롤 뚝딱 만들기</h2>
										<p>달콤한 뉴텔라잼과 딸기잼으로 식빵바나나롤 초간단하게 만들었어요~</p>
										<jsp:include page="fork.jsp"></jsp:include>
									</div>
								</div>
							</div> --%>
						
						<%-- <c:forEach var="recipe" items="${userRecipeList}">
						<div id="menu1" class='tab-pane fade'>
							<div class="view view-first">
								<img src="img/myRecipe_img/image0.jpg" />
								<div class="mask">
									<h2>${recipe.recipeName}</h2>
									<p>${recipe.recipeDescription}</p>
									<jsp:include page="fork.jsp"></jsp:include>
								</div>
							</div>
						</div>
						</c:forEach> --%>
						<%-- <div id="menu2" class="tab-pane fade">
							<div class="view view-first">
								<img src="img/myRecipe_img/image3.jpg" />
								<div class="mask">
									<h2>Hover Style #1</h2>
									<p>A dddddddd serenity has taken possession of my entire
										soul, like these sweet mornings of spring which I enjoy with
										my whole heart.</p>
									<jsp:include page="fork.jsp"></jsp:include>
								</div>
							</div>
						</div>
						<div id="menu3" class="tab-pane fade">
							<div class="view view-first">
								<img src="img/myRecipe_img/image4.jpg" />
								<div class="mask">
									<h2>Hover Style #1</h2>
									<p>A wonderful serenity has taken possession of my entire
										soul, like these sweet mornings of spring which I enjoy with
										my whole heart.</p>
									<jsp:include page="fork.jsp"></jsp:include>
								</div>
							</div>
						</div> --%>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>