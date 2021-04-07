<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
                    <form action="#">
                        <input type="text" class="form-control search-input" placeholder="Search here...">
                        <i class="fa fa-search"></i>
                    </form>
                </li>
                <% for(int i=0;i<8;i++){ %><!-- jstl로 분류 나와서 해야될거같음. -->
                <li>
                	<a href="#">- 전체보기</a>
                <li>
                <% } %>
                

            </ul>
        </aside>
        
		<div id="search_result">
			<% for(int i=0;i<50;i++) { %>
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
			<% } %>
		</div>

    </div>
</body>
</html>