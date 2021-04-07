$(document).ready(function() {
	// 레시피 삭제
	/*
	 * $("#recipeDeleteBtn").click(function() { $("#recipeDeleteModal").modal({
	 * backgroundColor: '#000000', opacity: 0.8, backdrop: 'static', keyboard:
	 * false}); }); $("#myWriteRecipe_modal_yesBtn").click(function() { // 삭제버튼
	 * 클릭시 삭제하러 ㄱㄱ window.location.href = "myWriteRecipe.jsp"; })
	 * $("#myWriteRecipe_modal_noBtn").click(function() {
	 * $("#recipeDeleteModal").modal("hide"); });
	 */

	// 레시피 상세조회
/*	$("#myRecipeDetailViewBtn").click(function() {
		var detail = document.getElementById("detail");
		
		 * alert("상세조회하러가자"); detail.submit();
		 
		$("#detailRecipeModal").modal({
			backgroundColor : '#000000',
			opacity : 0.8,
			backdrop : 'static',
			keyboard : false
		});
		$("#myDetailRecipeViewCloseBtn").click(function() {
			$("#detailRecipeModal").modal("hide");
		})
	})*/

	// 프로필 수정
	$("#profile_modifyBtn").click(function() {
		$("#profileModifyModal").modal({
			backgroundColor : '#000000',
			opacity : 0.8,
			backdrop : 'static',
			keyboard : false
		});
	});
	$("#scrapDeleteBtn").click(function() {
		$("#scrapDeleteModal").modal({
			backgroundColor : '#000000',
			opacity : 0.8,
			backdrop : 'static',
			keyboard : false
		});
	});
	
});
/*
 * function myRecipeDetailView(code) { alert(code); asyncSend(); function
 * getXR() { var req; try { req = new XMLHttpRequest(); } catch (e) { try { req =
 * new ActionXObject("Msxml2.XMLHTTP"); } catch (q) { req = new
 * ActionObject("Microsoft.XMLHTTP"); } } return req; } function asyncSend() {
 * var req = getXR();
 * 
 * req.onreadystatechange = function() { if (req.readyState == 4) { if
 * (req.status == 200) { $("#myModal2").modal({ backgroundColor : '#000000',
 * opacity : 0.8, backdrop : 'static', keyboard : false });
 * $("#myDetailRecipeViewCloseBtn").click(function() {
 * $("#myModal2").modal("hide"); }) $("#recipe_name_see").val(req.responseText);
 * $("#testUserIdTag").html(req.responseText); } else { alert("서버 에러발생"); } } };
 * req.open("post", "detail", true); req.setRequestHeader("content-type",
 * "application/x-www-form-urlencoded; charset=UTF-8"); req.send("recipeCode=" +
 * code); // *email 서블릿에서 받고 싶을때 // getParameter("email") 하믄됨 } }
 */

function myRecipeDelete2(code)
{
	alert(code);
	$("#detailRecipeDeleteModal").modal({
		backgroundColor : '#000000',
		opacity : 0.8,
		backdrop : 'static',
		keyboard : false
	});
	$("#myWriteRecipe_modal_yesBtn")
			.click(
					function() {
						// 삭제버튼 클릭시 삭제하러 ㄱㄱ
						/*--------*/
						asyncSend();
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
									} else {
										alert("서버 에러발생");
									}
								}
							};
							req.open("post", "deleteMyRecipe", true);
							req
									.setRequestHeader("content-type",
											"application/x-www-form-urlencoded; charset=UTF-8");
							req.send("recipeCode=" + code); // *email 서블릿에서 받고
							// 싶을때
							// getParameter("email")
							// 하믄됨
						}
						/*--------*/
					})
	$("#myWriteRecipe_modal_noBtn").click(function() {
		$("#recipeDeleteModal").modal("hide");
	});
}

function myRecipeDelete(code) {

	alert(code);
	$("#recipeDeleteModal").modal({
		backgroundColor : '#000000',
		opacity : 0.8,
		backdrop : 'static',
		keyboard : false
	});
	$("#myWriteRecipe_modal_yesBtn")
			.click(
					function() {
						// 삭제버튼 클릭시 삭제하러 ㄱㄱ
						/*--------*/
						asyncSend();
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
									} else {
										alert("서버 에러발생");
									}
								}
							};
							req.open("post", "deleteMyRecipe", true);
							req
									.setRequestHeader("content-type",
											"application/x-www-form-urlencoded; charset=UTF-8");
							req.send("recipeCode=" + code); // *email 서블릿에서 받고
							// 싶을때
							// getParameter("email")
							// 하믄됨
						}
						/*--------*/
					})
	$("#myWriteRecipe_modal_noBtn").click(function() {
		$("#recipeDeleteModal").modal("hide");
	});
}