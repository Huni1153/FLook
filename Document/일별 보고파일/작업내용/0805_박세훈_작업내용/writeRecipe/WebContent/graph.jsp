<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="profile.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	
	<link rel="stylesheet" href="css/graph_css/style.css"><!-- doughnutChart -->
	<link href="https://d12hfz37g51hrt.cloudfront.net/assets/application/users-e181c3d18f0acf6faa94df158c9b3512.css"
	media="screen" rel="stylesheet" type="text/css" /><!-- 나라사진 끌어다 쓰려고 -->
    <script src='http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js'></script><!-- doughnutChart -->
	<script src="js/graph_js/index.js"></script><!-- doughnutChart -->
	<script type="text/javascript" src="https://www.google.com/jsapi"></script><!-- 국가 -->
	<script src="js/graph_js/nation.js"></script><!-- doughnutChart -->
	<script src="https://d12hfz37g51hrt.cloudfront.net/assets/application/users-04e4ff1a9c741e554926d84f7a12d79d.js"	type="text/javascript"></script><!-- 선호재료 -->
	<script src="https://d12hfz37g51hrt.cloudfront.net/assets/d3.min-e50a165b97a54da6306340a6ee37b203.js" type="text/javascript"></script><!-- 재료 -->
</head>
<body>
    <div id="chart_area">
    	<div id="doughnutChart" class="chart"></div>
    </div>
   
	<div id="contents">
		
		
		<section id="taste">
		<div class="card sorted-by-rating" id="favorite-nations">
			<div class="row header">
				<h2 class="small">선호국가</h2>
				<span class="flavor-text">양식 음식을 좋아하시네요
				</span>
			</div>
			<div class="row map">
				<span class="marker icon-favorite-1" data-nation-id="2"></span><span
					class="marker icon-favorite-2" data-nation-id="1"></span><span
					class="marker icon-favorite-3" data-nation-id="5"></span>
			</div>
			<% for(int i=1;i<4;i++) { %>
			
				<div class="row best">
					<div class="col-2 left">
						<span class="icon-favorite-<%=i%>"></span><a
							href="/users/0JisbXCHBhiO/movies?filter%5Bnation%5D%5B%5D=2"
							class="name">미국</a>
					</div>
					<div class="col-2">89%</div>
					<div class="col-2 right">38편</div>
				</div>
			<% } %>
			
			<button class="expand" id="show-more-nations">
				<span class="icon-more"></span>더 보기
			</button>
			<script type="text/javascript">
				(function() {
					$('#show-more-nations').on('click', function() {
						$('#favorite-nations .runner-ups').show();
						$(this).parent().addClass('expanded');
						$(this).remove();
						try {
							return $('#taste').masonry();
						} catch (_error) {
						}
					});

				}).call(this);
			</script>
		</div>	
		<div class="card sorted-by-rating" id="favorite-genres">
			<div class="row header">
				<h2 class="small">선호재료</h2>
				<span class="flavor-text">전생의 원수는 닭</span>
			</div>
			<!-- <div class="row chart">
				<div class="col-1">
					<svg data-distribution="[10, 9, 8, 7]" id="favorite-genres-chart"></svg>
					<img class="thumbnail"
						onerror="utils.loadDefaultImg(this, &#39;medium&#39;);"
						src="https://d12hfz37g51hrt.cloudfront.net/user/1595457/medium/4013b90ba44e55e5dbea7ad5c7337907c7a1d4dd.jpg" /> --><!-- 프로필이미지
				</div>
			</div> -->
			<div class="row best">
			<%for(int i=1;i<4;i++){ %>
				<div class="genre">
					<span class="icon-favorite-1"></span><a
						href="/users/0JisbXCHBhiO/movies?filter%5Bgenre%5D%5B%5D=46"
						class="name">치킨</a><span class="stat"> <strong
						class="rating"><%= i*18%></strong>/<strong class="count">108</strong>마리
					</span>
				</div>
			<% } %>
				
			</div>
			<div class="runner-ups">
			<% for(int i=1;i<5;i++) { %>
				<div class="row">
					<div class="col-2 left">
						<a href="/users/0JisbXCHBhiO/movies?filter%5Bgenre%5D%5B%5D=35"
							class="name">닭계</a>
					</div>
					<div class="col-2">63%</div>
					<div class="col-2 right">7마리
					</div>
				</div>
			<% } %>
			</div>
		</div>
		
	</section>
	
	</div>
</body>
</html>