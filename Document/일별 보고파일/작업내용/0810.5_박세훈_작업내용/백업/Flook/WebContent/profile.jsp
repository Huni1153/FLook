<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>프로필 정보</title>
<link rel="stylesheet" type="text/css" href="css/profile_css/cs.css">
<!-- 합쳐지고 최소화된 최신 CSS -->
<!-- 부가적인 테마 -->
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="js/profile_js/modal.js" type="text/javascript"
	charset="UTF-8"></script>
<script src="js/profile_js/profileModify.js" type="text/javascript"
	charset="UTF-8"></script>
<script src="js/profile_js/myWriteRecipe.js" type="text/javascript"
	charset="UTF-8"></script>
</head>
<body>
	<jsp:include page="flookNav.jsp" flush="false" />
	<div id="profileBody_body">
		<div id="profile_margin"></div>
		<div id="profile_container" id="profile_container">
			<div id="profile_simple" width="100%">
				<table id="profile_header_tb">
					<tr>
						<td><input type="image"
							src="img/profile_img/Like-100 (1).png" width="50px"></td>
						<td><input type="image" id="profile_profileImg"
							src="${sessionScope.userImage }" width="70px"></td>
						<td><input type="image"
							src="img/profile_img/Create New-100.png" width="50px"></td>
					</tr>
					<tr>
						<td>받은 좋아요</td>
						<td></td>
						<td>등록한 레시피</td>
					</tr>
					<tr>
						<td>10개</td>
						<td><strong><h3>${sessionScope.userName }</h3></strong></td>
						<td>20개</td>
					</tr>
				</table>
				<div width="100%">
					<input type="button" value="프로필 수정" id="profile_modifyBtn"
						width="30%" class="myButton" />
				</div>
			</div>
			<div class="container">
				<nav class="navbar navbar-default">
				<div class="container-fluid">
					<div>
						<ul class="nav navbar-nav" id="profile_navbar-nav">
							<li class="profile_nav"><a href="#" onclick="myGraph()">취향분석표</a></li>
							<li class="profile_nav"><a href="#" onclick="myRecipe()">내가
									작성한 레시피</a></li>
							<li class="profile_nav"><a href="#" onclick="myScrap()">MY스크랩</a></li>
							<li class="dropdown" id="profile_navMore"><a
								class="dropdown-toggle" data-toggle="dropdown" href="#">더 보기
									<span class="caret"></span>
							</a>
								<ul class="dropdown-menu">
									<li><a href="eventAlarmMain.jsp">모든 소식</a></li>
									<li><a href="friendsList.jsp">친구 목록</a></li>
									<li><a href="#">활동 내역</a></li>
								</ul></li>
							<li class="profile_nav"><a href="FollowingList">팔로</a></li>
							<li class="profile_nav"><a href="FollowerList">팔로워</a></li>
						</ul>
					</div>
				</div>
				</nav>
			</div>
			<footer id="profile_footer"> </footer>


			<!-- 프로필 수정 modal -->
			<div class="modal fade" id="profileModifyModal" tabindex="-1"
				role="dialog" data-backdrop="static">
				<div class="modal-dialog" role="document"
					id="profile_profileModify_modal">
					<!-- modal content -->
					<div class="modal-content" id="profile_profileModify_content">
						<div class="modal-header">
							<button type="button" class="close" data-dismiss="modal"
								aria-label="Close">
								<span aria-hidden="true">&times;</span>
							</button>
							<h4 class="modal-title" id="myModalLabel">프로필 수정</h4>
						</div>
						<div class="modal-body">
							<div id="account-setting-popup">
								<div class="inner-shadow"></div>
								<div class="photo-wrapper" id="photo-wrapper">
									<span class="user-photo"> <img alt="Ui_kit_78"
										src="https://d12hfz37g51hrt.cloudfront.net/user/1595456/original/9b2b62fbda850211e90db1d54985c7a8d840dc35.jpg" />
									</span>
									<div class="name-and-upload">
										<span class="name">myNickName<span
											id="upload-user-photo" class="upload"></span></span>
									</div>
								</div>
								<div id="profile_body">
									<div class="profile_body_content">
										<label class="profile_profileValue">이메일</label> <label
											class="field">abcde8@naver.com</label> <input type="button"
											class="change-email" id="profile_chageEmailBtn" value="변경하기">
										<!-- data-password-initialized="false" -->
									</div>
									<div class="profile_body_content">
										<label class="profile_profileValue">닉네임</label> <input
											type="text" name="user[name]" value="myNickName"
											id="profile_nickName" />
									</div>

									<div class="profile_body_content">
										<label class="profile_profileValue">페이스북 연동</label> <img
											src="http://umanitoba.ca/faculties/kinrec/media/facebook_icon.png"
											style="width: 100px; height: 100px;">
										<!-- <div class="facebookswitch"> -->
										<input type="checkbox" name="facebookswitch"
											class="facebookswitch-checkbox" id="myfacebookswitch" checked>
										<label class="facebookswitch-label" for="myfacebookswitch">
											<span class="facebookswitch-inner"></span> <span
											class="facebookswitch-switch"></span>
										</label>
									</div>
									<div class="profile_body_content">
										<label class="profile_profileValue">비밀번호 변경</label> <input
											type="button" id="profile_changePassword" value="비밀번호 변경">

										<div id="profile_newPassword" style="display: none">
											<div>
												<input class="newPassword" name="" type="password"
													placeholder="기존 비밀번호" />
											</div>
											<div>
												<input class="newPassword" name="" type="password"
													placeholder="새 비밀번호" />
											</div>
											<div>
												<input class="newPassword" name="" type="password"
													placeholder="새 비밀번호 확인" />
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="modal-footer">
							<a href="#" type="button" class="" id="profilw_dropMember">탈퇴하기</a>
							<button type="button" class="" id="profile_closeBtn"
								data-dismiss="modal">취소</button>
							<button type="button" class="" id="profile_saveChanges"
								data-dismiss="modal">확인</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>