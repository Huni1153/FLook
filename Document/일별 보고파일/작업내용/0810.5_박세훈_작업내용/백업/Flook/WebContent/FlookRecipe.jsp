<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html id="flookRecipe_html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Flook 레시피</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<link href="css/flookRecipe_css/flookRecipeCSS.css" rel="stylesheet"
	type="text/css"></link>
<link rel="stylesheet" href="css/flookRecipe_css/test3.css"
	type="text/css">
</head>
				<script>
					var method="%%";
					var situation="%%";
					var nation="%%";
					var ingredient="%%";
					
					window.onload = function() {
						asyncSend();
						
						$(".flook_method").click(function(){
							
							method=document.getElementsByClassName("flook_method")[$(".flook_method").index(this)].textContent;
							
							asyncSend();
							 
						});
						$(".flook_situation").click(function(){
							situation=document.getElementsByClassName("flook_situation")[$(".flook_situation").index(this)].textContent;
							
							asyncSend();
						});
						$(".flook_nation").click(function(){
							nation=document.getElementsByClassName("flook_nation")[$(".flook_nation").index(this)].textContent;
						
							asyncSend();
						});
						$(".flook_ingredient").click(function(){
							ingredient=document.getElementsByClassName("flook_ingredient")[$(".flook_ingredient").index(this)].textContent;
							
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
										
										 var tempp=$("#flookRecipe_list");
										 $(tempp).html(req.responseText);
										 
									} else {
										alert("서버 에러발생");
									}
								}
							};
							
							req.open("post", "recipeFlook", true);/*true로 할 경우만 비동기통신*/
							req.setRequestHeader("content-type","application/x-www-form-urlencoded; charset=UTF-8");
							req.send("method="+method+"&"+"situation="+situation+"&nation="+nation+"&ingredient="+ingredient); //*email 서블릿에서 받고 싶을때 getParameter("email") 하믄됨*/
							
						}
					};
				</script>
<body class="flookRecipe_body">
	<div id="flookRecipe_banner"></div>
	<div class="flookRecipe_container">
		<form class="flookRecipe_form">
			<div class="container">
				<div id="flookRecipe_title">
					<span id="flookRecipe_span_title">Flook 요리사</span>
				</div>
				<div class="flookRecipe_element" id="flookRecipe_category">
					<div class="flookRecipe_MainCategory">
						<ul class="nav nav-pills">
							<li id="flookRecipe_li_categoryName1"><span
								id="flookRecipe_span_categoryName1"
								class="flookRecipe_span_value" id="">방법별</span></li>
							<li class="active"><a data-toggle="tab" href="#home"></a>전체</li>
							<li><a data-toggle="tab" href="#menu1">밥/죽/스프</a></li>
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
					<div class="flookRecipe_MainCategory">
						<ul class="nav nav-pills">
							<li id="flookRecipe_li_categoryName2"><span
								id="flookRecipe_span_categoryName2"
								class="flookRecipe_span_value" id="">상황별</span></li>
							<li class="active"><a data-toggle="tab" href="#home">전체</a></li>
							<li><a data-toggle="tab" href="#menu1">일상</a></li>
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
					<div class="flookRecipe_MainCategory">
						<ul class="nav nav-pills">
							<li id="flookRecipe_li_categoryName3"><span
								id="flookRecipe_span_categoryName4"
								class="flookRecipe_span_value" id="">나라별</span></li>
							<li class="active"><a data-toggle="tab" href="#home">전체</a></li>
							<li><a data-toggle="tab" href="#menu1">한식</a></li>
							<li><a data-toggle="tab" href="#menu2">양식</a></li>
							<li><a data-toggle="tab" href="#menu3">일식</a></li>
							<li><a data-toggle="tab" href="#menu4">중식</a></li>
							<li><a data-toggle="tab" href="#menu5">기타</a></li>
						</ul>
					</div>
					<div class="flookRecipe_MainCategory">
						<ul class="nav nav-pills">
							<li id="flookRecipe_li_categoryName4"><span
								id="flookRecipe_span_categoryName4"
								class="flookRecipe_span_value" id="">재료별</span></li>
							<li class="active"><a data-toggle="tab" href="#home">전체</a></li>
							<li><a data-toggle="tab" href="#menu1">육류</a></li>
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
				<script>
					function goSearchRecipe(ca, val) {
						$("#srRecipeFrm [name='" + ca + "']").val(val);
						$("#srRecipeFrm").submit();
					}
				</script>

				<div class="flookRecipe_element" id="flookRecipe_all_list">
					<div class="tab-content" id="flookRecipe_list">
					
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>