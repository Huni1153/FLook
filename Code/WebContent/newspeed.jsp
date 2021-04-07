<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>뉴스피드</title>
<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="js.js" charset="UTF-8"></script>
<link rel="stylesheet" type="text/css" href="css/profile_css/cs.css">
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="newspeed_toggleBtn_outer">
		<div class="btn-group" data-toggle="buttons" id="newspeed_toggleBtn">
			<label class="btn btn-primary active"> <input type="radio"
				name="options" id="option1" autocomplete="off" checked>인기순
			</label> <label class="btn btn-primary"> <input type="radio"
				name="options" id="option2" autocomplete="off">최신순
			</label>
		</div>
	</div>

	<div id="newspeed_post">
		<table id="newspeed_post_table">
			<tr>
				<td id="newspeed_profileImg_width"><input type="image"
					id="newspeed_profileImg"
					src="img/profile_img/10345982_852744308099397_1882240356207679456_n.jpg" /></td>
				<td>김정윤님이 리코타치즈샐러드 게시물을 좋아합니다.</td>
			</tr>
			<tr>
				<td colspan="2"><input type="image" id="newspeed_post_food"
					src="img/profile_img/1301-609224-Grilled-tun-steks--l-nicoise-recipe.jpg" /></td>
			</tr>
		</table>
		<table id="newspeed_post_bottom_outer">
			<tr>
				<td id="newspeed_post_bottom_hits_td">
					<table id="newspeed_post_bottom_hits">
						<tr>
							<td><input type="image" src="img/profile_img/Visible-50.png"
								width="30px" /></td>
							<td>조회수</td>
							<td>29,000</td>
						</tr>
					</table>
				</td>
				<td id="newspeed_post_bottom_like_td">
					<table id="newspeed_post_bottom_like">
						<tr>
							<td><input type="image" src="img/profile_img/Like-100.png"
								width="30px" /></td>
							<td>100</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
	<div id="newspeed_post">
		<table id="newspeed_post_table">
			<tr>
				<td id="newspeed_profileImg_width"><input type="image"
					id="newspeed_profileImg"
					src="img/profile_img/10345982_852744308099397_1882240356207679456_n.jpg" /></td>
				<td>김정윤님이 리코타치즈샐러드 게시물을 좋아합니다.</td>
			</tr>
			<tr>
				<td colspan="2"><input type="image" id="newspeed_post_food"
					src="img/profile_img/1301-609224-Grilled-tun-steks--l-nicoise-recipe.jpg" /></td>
			</tr>
		</table>
		<table id="newspeed_post_bottom_outer">
			<tr>
				<td id="newspeed_post_bottom_hits_td">
					<table id="newspeed_post_bottom_hits">
						<tr>
							<td><input type="image" src="img/profile_img/Visible-50.png"
								width="30px" /></td>
							<td>조회수</td>
							<td>29,000</td>
						</tr>
					</table>
				</td>
				<td id="newspeed_post_bottom_like_td">
					<table id="newspeed_post_bottom_like">
						<tr>
							<td><input type="image" src="img/profile_img/Like-100.png"
								width="30px" /></td>
							<td>100</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
	<div id="newspeed_post">
		<table id="newspeed_post_table">
			<tr>
				<td id="newspeed_profileImg_width"><input type="image"
					id="newspeed_profileImg"
					src="img/profile_img/10345982_852744308099397_1882240356207679456_n.jpg" /></td>
				<td>김정윤님이 리코타치즈샐러드 게시물을 좋아합니다.</td>
			</tr>
			<tr>
				<td colspan="2"><input type="image" id="newspeed_post_food"
					src="img/profile_img/1301-609224-Grilled-tun-steks--l-nicoise-recipe.jpg" /></td>
			</tr>
		</table>
		<table id="newspeed_post_bottom_outer">
			<tr>
				<td id="newspeed_post_bottom_hits_td">
					<table id="newspeed_post_bottom_hits">
						<tr>
							<td><input type="image" src="img/profile_img/Visible-50.png"
								width="30px" /></td>
							<td>조회수</td>
							<td>29,000</td>
						</tr>
					</table>
				</td>
				<td id="newspeed_post_bottom_like_td">
					<table id="newspeed_post_bottom_like">
						<tr>
							<td><input type="image" src="img/profile_img/Like-100.png"
								width="30px" /></td>
							<td>100</td>
						</tr>
					</table>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>