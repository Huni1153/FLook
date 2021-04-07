<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="margin.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="flookNav.jsp" flush="false"/>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<link rel="stylesheet" type="text/css" href="css/profile_css/cs.css">
<link rel="stylesheet" type="text/css" href="css/profile_css/editProfile.css">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="css/profile_css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

</head>
<body>
	<div id="profile_simple" width="100%">
	<table id="profile_header_tb">
		<tr>
			<td><input type="image" src="img/profile_img/Like-100 (1).png"
				width="50px"></td>
			<td><input type="image" id="profile_profileImg"
				src="img/profile_img/10345982_852744308099397_1882240356207679456_n.jpg"
				width="70px"></td>
			<td><input type="image" src="img/profile_img/Create New-100.png"
				width="50px"></td> 
		</tr>
		<tr>
			<td>받은 좋아요</td>
			<td></td>
			<td>등록한 레시피</td>
		</tr>
		<tr>
			<td>10개</td>
			<td><strong><h3>김정윤</h3></strong></td>
			<td>20개</td>
		</tr>
	</table>
	<div width="100%">
		<input type="button" value="프로필 수정" id="profile_modifyBtn" width="30%"
			class="myButton"  data-toggle="modal"
				data-target="#myModal" />
	</div>
	</div>
	<div id="profile_content" width="100%">
		<table id="profile_menu_table" width="70%" height="100%">
			<tr>
				<td>
					<table class="profile_menuTb">
						<tr>
							<td><a href="graph.jsp" class="sliding-middle-out"><label class="profile_font_color">취향 분석표</label></a></td>
							<td><a href="myWriteRecipe.jsp" class="sliding-middle-out"><label class="profile_font_color">내가 작성한 레시피</label></a></td>
							<td><a href="myScrap.jsp" class="sliding-middle-out"><label class="profile_font_color">My 스크랩</label></a></td>
							<td>
								<!-- <a href="#" class="sliding-middle-out" id="profil_moreBtn">더 보기</a> -->
								<!-- 
								<ul id="profile_more">
									<li><a href="#">모든 소식</a></li>
									<li><a href="#">친구 목록</a></li>
									<li><a href="#">활동 내역</a></li>
								</ul>
								 -->
								<div class="dropdown">
									<a id="dLabel" type="button" data-toggle="dropdown"
										aria-haspopup="true" aria-expanded="false"><label class="profile_font_color">더 보기</label> <span
										class="caret"></span>
									</a>
									<ul class="dropdown-menu" role="menu" aria-labelledby="dLabel">
										<li><a href="eventAlarmMain.jsp">모든 소식</a></li>
										<li><a href="friendsList.jsp">친구 목록</a></li>
										<li><a href="#">활동 내역</a></li>
									</ul>
								</div>
							</td>

						</tr>
					</table>
				</td>
				<td>
					<table class="profile_menuTb" id="profile_menuTb2" width="70%">
						<tr>
							<td><a href="following.jsp" class="sliding-middle-out"><label class="profile_font_color">팔로잉</label></a></td>
							<td><a href="follower.jsp" class="sliding-middle-out"><label class="profile_font_color">팔로워</label></a></td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
	<footer id="profile_footer"> </footer>
	
	
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">Modal title</h4>
				</div>
				<div class="modal-body">
					<div id="account-setting-popup">
						<div class="inner-shadow"></div>
						<div class="photo-wrapper">
							<span class="user-photo"> <img alt="Ui_kit_78"
								src="https://d12hfz37g51hrt.cloudfront.net/user/1595456/original/9b2b62fbda850211e90db1d54985c7a8d840dc35.jpg" />
							</span>
							<div class="name-and-upload">
								<span class="name">myNickName<span id="upload-user-photo"
									class="upload"></span></span>
							</div>
						</div>
						<div>
							<div>
								<div>
									<div>
										<label class="title">이메일</label>
										<label class="field">abcde8@naver.com</label>
										<button class="change-email" data-password-initialized="false">변경하기</button>
									</div>
									<div>
										<label class="title">닉네임</label>
										<input type="text" name="user[name]" value="myNickName" />
									</div>
									<div>
										<div class="profile_div_facebook"><label>페이스북 연동</label></div>
										<div class="profile_div_facebook"><img
										src="http://umanitoba.ca/faculties/kinrec/media/facebook_icon.png"
										style="width: 100px; height: 100px;"></div>
										<div class="facebookswitch">
											<input type="checkbox" name="facebookswitch"
											class="facebookswitch-checkbox" id="myfacebookswitch"
											checked>
											<label class="facebookswitch-label" for="myfacebookswitch">
												<span class="facebookswitch-inner"></span>
												<span class="facebookswitch-switch"></span>
											</label>
										</div>
									</div>
									<div>
										<label>인스타그램 연동</label>
										<img
										src="http://vignette4.wikia.nocookie.net/gracehelbig/images/a/a5/Instagram_icon.png/revision/latest/scale-to-width-down/480?cb=20140524234907"
										style="width: 100px; height: 100px;">
										<div class="instagramswitch">
											<input type="checkbox" name="instagramswitch"
											class="instagramswitch-checkbox" id="myinstagramswitch"
											checked>
											<label class="instagramswitch-label" for="myinstagramswitch">
												<span class="instagramswitch-inner"></span>
												<span class="instagramswitch-switch"></span>
											</label>
										</div>
									</div>
									<div class="password">
										<label>비밀번호 변경</label>
										<button id="showtoast">비밀번호 변경</button>
	
										<label class="title">비밀번호 변경</label>
										<label class="field"><input class="current"
											name="password[password_ori]" type="password"
											placeholder="기존 비밀번호" style="display: none;" /> <input
											class="new" name="password[password_new]" type="password"
											placeholder="새 비밀번호" /> <input class="confirm"
											name="password[password_confirm]" type="password"
											placeholder="새 비밀번호 확인" /></label>
									</div>
								</div>
							</div>
						</div>

						<a href="#" type="button" class="deactivate">탈퇴하기</a>
						<button class="submit">확인</button>
						<button class="cancel">취소</button>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary" data-dismiss="modal">Save
						changes</button>
				</div>
			</div>
		</div>
	</div>
	
</body>
</html>