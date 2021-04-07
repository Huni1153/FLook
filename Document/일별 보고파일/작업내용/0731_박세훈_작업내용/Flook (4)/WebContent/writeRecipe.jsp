<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html id="Write_html">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>레시피 작성</title>
<!-- Bootstrap -->
<link href="bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>

<script>
	$(document)
			.ready(
					function() {
						$('#write_addMainIngredientButton')
								.on(
										'click',
										function() {
											var mainIngredientTable = $('#write_mainIngredient')
											$(mainIngredientTable)
													.find('li:last')
													.after(
															'<li><input type="text" placeholder="재료" /><input type="text" placeholder="수량" /><select><option>g</option><option>개</option><option>종이컵</option><option>숟가락</option><option>줌</option><option>직접입력</option></select><button class="write_modMainIngredientButton" onclick="deleteLine(this);">-</button></li>');
											//$(this).html('hi');

										});
						$('#write_addSubIngredientButton')
								.on(
										'click',
										function() {
											var subIngredientTable = $('#write_subIngredient')

											$(subIngredientTable)
													.find('li:last')
													.after(
															'<li><input type="text" placeholder="재료" /><input type="text" placeholder="수량" /><select><option>g</option><option>개</option><option>종이컵</option><option>숟가락</option><option>줌</option><option>직접입력</option></select><button class="write_modSubIngredientButton" onclick="deleteLine(this);">-</button></li>');

										});
						$('#write_addRecipeButton')
								.on(
										'click',
										function() {
											var cookingProgress = $('#write_cooking_progress');
											$(cookingProgress)
													.find('li:last')
													.after(
															'<li><img alt="" src="img/write_img/pic_none3.gif" class="write_img_pic"></td><td><textarea class="write_textarea_step" placeholder="예) 조리방법을 상세하게 설명하여요~" style="height:147px; width:610px; resize:none;"></textarea><button class="write_modRecipeButton" onclick="deleteLine(this);">-</button></li>');

										});
					})
					function deleteLine(obj) {
					    var tr = $(obj).parent();
					    
					    //라인 삭제
					    tr.remove();
					}
	/* function addResource(prev_step,init_json){
		var step=0;
		$("#write_mainIngredient [id^liResource_]").each(function(){
			var tmp=$(this).prop('id').replace('liResource_','');
			var tmp_step=parseInt(tmp,10);
		});
		step++;
		
		var str='<tr><td><input type="text" placeholder="재료" name=mainIngredient id="write_mainIngredient_'+step+'"></td>"';
		//str+='<td><input type="text" placeholder="수량" name=mainIngredientAmount id="write_mainIngredientAmount_'+step+'"/></td>';
		//str+='<td><select class="write_mainIngredientUnit"id="write_mainIngredientUnit_'+step+'"><option>g</option></select></td>;
		//str+='<td><button onclick="deleteMainIngredient(this);">-</button></td></tr>';
		if(typedef prev_step=='undefined'||prev_step===null||prev_step==0){
			$(str).appendTo('#write_mainIngredient');
		}
		else{
			$(str).insertAfter("#liResource_"+prev_step);
		}
		if (typeof init_json !== 'undefined' && init_json !== null && init_json['nm']) {
			
		}

	} */
</script>

<link href="css/writeRecipe_css/writeRecipe.css" rel="stylesheet" type="text/css"></link>
</head>
<body id="Write_body">
<div id="Write_container">
	<form id="Write_form" class="Write_form">
		<div id="write_element1" class="write_element">
			<div id="write_name_scope">
				<img alt="" id="write_photo" src="img/write_img/pic_none4.gif"  style="width: 210px; height: 210px; cursor:pointer">
				<label class="labelBox" id="Write_recipeName">레시피명 </label> <input type="text" id="write_input_recipeName" size="82" placeholder="예)쉽게만드는 나만의 레시피!">
				<img alt=""src="img/write_img/lock.png" id="write_img_lock">
				<select id="write_selete_private">
					<option>전체공개</option>
					<option>친구공개</option>
					<option>비공개</option>
				</select>
			</div>
			<div id="write_recipeDiscription">
				<label class="labelBox" id="write_label_recipeDiscription">사용자 한마디 </label>
				<textarea name="recipeDiscription" id="write_input_recipeDiscription"  placeholder="예) 나만의 레시피를 간단히 설명해주세요." style="height:100px; width:610px; resize:none;"></textarea>
			</div>
			<div id="write_category">
				<label class="labelBox" id="write_label_category">카테고리</label>
			<select>
				<option>방법별</option><option>밥/죽/스프</option><option>만두/면류</option><option>국</option>
				<option>찌개/전골/탕</option><option>조림</option><option>볶음</option><option>구이</option>
				<option>튀김/커틀릿</option><option>부침</option><option>찜</option><option>샐러드</option>
				<option>김치/밑반찬</option><option>떡/한과</option><option>빵/과자</option><option>도시락/간식</option>
				<option>음료</option><option>후식</option><option>양념장</option><option>그라탕/리조또</option>
				<option>샌드위치/햄버버</option><option>야식</option>
			</select>
			<select>
				<option>상황별</option><option>일상</option><option>손님접대</option><option>나들리</option><option>간식</option>
				<option>초스피드</option><option>술안주</option><option>푸드스타일링</option><option>다이어트쿡</option>
				<option>영양식</option><option>야식</option><option>해장</option><option>기타</option>
			</select>
			<select>
				<option>나라별</option><option>한식</option><option>양식</option>
				<option>일식</option><option>중식</option><option>기타</option>
			</select>
			<select>
				<option>재료별</option><option>육류</option><option>해물류</option><option>건어물류</option><option>곡류</option>
				<option>콩/견과류</option><option>채소류</option><option>버섯류</option><option>빵류</option><option>가공식품류</option>
				<option>면류/떡류</option><option>과일류</option><option>달걀/유제품</option><option>기타</option>
			</select>
			</div>
			<div id="write_cookInfo">
				<label class="labelBox" id="write_label_cookInfo">요리정보  </label> <select>
					<option>인원</option>
					<option>1인분</option><option>2인분</option><option>3인분</option><option>4인분</option><option>5인분이상</option>
				</select> <select>
					<option>시간</option>
					<option>5분 이내</option><option>10분 이내</option><option>15분 이내</option><option>30분 이내</option>
					<option>60분 이내</option><option>90분 이내</option><option>2시간 이내</option><option>2시간 이상</option>
				</select> <select>
					<option>난이도</option>
					<option>쉬움</option>
					<option>보통</option>
					<option>어려움</option>
				</select>
			</div>
			<div id="write_tag">
				<label class="labelBox" id="write_label_tag">태그달기</label> <input type="text" id="write_input_tag" size="82" placeholder="예)#어쩌구#저쩌구">
			</div>
		</div>
		<div id="write_element2" class="write_element">
			<div id="write_finishPhoto">
			
			</div>
		</div>
		<div id="write_element3" class="write_element">
			<div>
				<ul id="write_mainIngredient">
					<li>
						<label id="write_label_mainIngredient">주재료</label><img alt="" src="img/write_img/question.png">
					</li>
					<li>
						<input type="text" placeholder="재료" />
						<input type="text" placeholder="수량" />
						<select id="write_mainIngredientUnit">
							<option>g</option><option>개</option><option>종이컵</option>
							<option>숟가락</option><option>줌</option><option>직접입력</option>
						</select>
						<input type="button" class="write_modMainIngredientButton" value="-">
					</li>
				</ul>
				<div>
					<input type="button" id="write_addMainIngredientButton" value="+ 재료 추가">
				</div>
			</div>
			<div>
				<ul id="write_subIngredient">
					<li>
						<label id="write_label_subIngredient">부재료</label>
					</li>
					<li>
						<input type="text" placeholder="재료" />
						<input type="text" placeholder="수량" />
						<select id="write_subIngredientUnit">
							<option>g</option><option>개</option><option>종이컵</option>
							<option>숟가락</option><option>줌</option><option>직접입력</option>
						</select>
						<input type="button" class="write_modSubIngredientButton" value="-">
					</li>
				</ul>
				<div>
					<input type="button" id="write_addSubIngredientButton" value="+ 재료 추가">
				</div>
			</div>
		</div>
		<div id="write_element4" class="write_element">
			<ul id="write_cooking_progress">
				<li><label>조리사진　　　　　　　　</label><label>●  조리방법</label></li>
					<li><img alt="" src="img/write_img/pic_none3.gif" class="write_img_pic" style="width: 140px; height: 140px; cursor:pointer">
					<textarea  class="write_textarea_step" placeholder="예) 조리방법을 상세하게 설명하여요~" style="height:147px; width:610px; resize:none;"></textarea>
					<input type="button" class="write_modRecipeButton" value="-">
					</li>
				</ul>
				<div>
					<input type="button" id="write_addRecipeButton" value="+ 순서 추가">
				</div>
			<div id="write_confirm_cancel">
				<input type="button" value="확인" id="write_input_submit"onclick="location.href='main.jsp'">
				<input type="button" value="취소" id="write_input_cancel"onclick="location.href='main.jsp'">
			</div>
		</div>
	
	
		<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
		<!-- Include all compiled plugins (below), or include individual files as needed -->
		<script src="bootstrap/dist/js/bootstrap.min.js"></script>
</form>
</div>
</body>
</html>