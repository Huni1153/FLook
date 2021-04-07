$(document).ready(function() {
	//레시피 삭제
	$("#recipeDeleteBtn").click(function() {
		$("#recipeDeleteModal").modal({
			backgroundColor: '#000000', 
			opacity: 0.8,
			backdrop: 'static',
			keyboard: false});
	});
	$("#myWriteRecipe_modal_yesBtn").click(function() {
		// 삭제버튼 클릭시 삭제하러 ㄱㄱ
		window.location.href = "myWriteRecipe.jsp";
	})
	$("#myWriteRecipe_modal_noBtn").click(function() {
		$("#recipeDeleteModal").modal("hide");
	});
	//프로필 수정
	$("#profile_modifyBtn").click(function(){
		$("#profileModifyModal").modal({
			backgroundColor: '#000000', 
			opacity: 0.8,
			backdrop: 'static',
			keyboard: false});
	});
	$("#scrapDeleteBtn").click(function(){
		$("#scrapDeleteModal").modal({
			backgroundColor: '#000000', 
			opacity: 0.8,
			backdrop: 'static',
			keyboard: false});
		
	});
	
});