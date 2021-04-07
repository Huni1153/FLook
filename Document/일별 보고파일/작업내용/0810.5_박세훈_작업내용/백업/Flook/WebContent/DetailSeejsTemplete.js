function detailSee(recipeCode) {
	
	$.ajax({
		url : "detail",
		type : 'POST',
		data : {
			"choiceRecipe" : recipeCode
		},
		success : function(data) {
			$("#tempHereInsert").html(data);
			 /*alert("?"); */
			$("#gg").trigger("click");
			
			$("#bookmarkBtn").click(function(){
				var bookmarkBtnSrc;
				bookmarkBtnSrc=$("#bookmarkBtn").attr("src");
				if(bookmarkBtnSrc==="img/main_img/Bookmark.png") {
					$("#bookmarkBtn").attr("src","img/main_img/unBookmark.png");
					$.ajax({
						url:"ScrapDeleteServlet",
						type:"POST",
						data:{
							"recipeCode" : recipeCode
						},
						success : function(data) {
							alert("스크랩 취소되었습니다.");
						}
					});
				} else {
					$.ajax({
						url:"ScrapAddServlet",
						type:"POST",
						data : {
							"recipeCode" : recipeCode
						},
						success : function(data) {
							$("#bookmarkBtn").attr("src","img/main_img/Bookmark.png");
							alert("스크랩되었습니다.");
						}
					}); // ajax end
				} // else문 end
			});//bookmarkBtn종료.
			$("#heart_Btn").click(function(){
				if($("#heart_Btn").attr("src")==="img/main_img/heart_empty.png") {
					$.ajax({
						url : 'like',
						type:"POST",
						data:{
							"recipeCode" : recipeCode,
							"like" : "N"
						},
						success : function(data) {
							alert("좋아요");
							$("#heart_Btn").attr("src","img/main_img/heart_fill.png");
						}
					}); // ajax종료
				} else {
					$.ajax({
						url:'like',
						type:"POST",
						data:{
							"recipeCode":recipeCode,
							"like" : "Y"
						},
						success : function(data) {
							alert("좋아요취소");
							$("#heart_Btn").attr("src","img/main_img/heart_empty.png");
						}
						
					});//ajax종료
				}//else종료

			});
		}
	});
}

/* 
<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
		data-target="#detailRecipeModal" id="gg" style="display: none;">이거
		봤니?이게 보여?보이면 안되는데;;</button>
		
		*
		*
		*이거 반드시 있어야함
		*
		*/