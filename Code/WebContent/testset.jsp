<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html> 
<head> 
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"> 
	<style> 
	#mask {  
	  position:absolute;  
	  z-index:9000;  
	  background-color:#000;  
	  display:none;  
	  left:0;
	  top:0;
	} 
	.window{
	  display: none;
	  position:absolute;  
	  left:100px;
	  top:100px;
	  z-index:10000;
	}
	</style> 
	<script src="http://code.jquery.com/jquery-latest.js"></script> 
	<script> 
	function wrapWindowByMask(){
		//화면의 높이와 너비를 구한다.
		var maskHeight = $(document).height();  
		var maskWidth = $(window).width();  

		//마스크의 높이와 너비를 화면 것으로 만들어 전체 화면을 채운다.
		$('#mask').css({'width':maskWidth,'height':maskHeight});  

		//애니메이션 효과 - 일단 1초동안 까맣게 됐다가 80% 불투명도로 간다.
		$('#mask').fadeIn(1000);      
		$('#mask').fadeTo("slow",0.8);    

		//윈도우 같은 거 띄운다.
		$('.window').show();
	}

	$(document).ready(function(){
		//검은 막 띄우기
		$('.openMask').click(function(e){
			e.preventDefault();
			wrapWindowByMask();
		});

		//닫기 버튼을 눌렀을 때
		$('.window .close').click(function (e) {  
		    //링크 기본동작은 작동하지 않도록 한다.
		    e.preventDefault();  
		    $('#mask, .window').hide();  
		});       

		//검은 막을 눌렀을 때
	/* 	$('#mask').click(function () {  
		    $(this).hide();  
		    $('.window').hide();  
		});    */   
		// 터치 스크린에서 실수로 레이어를 닫는 경우를 막으려면.
		$('#mask').one('touchstart', function () {  
		    $(this).unbind('click');
		    alert('터치 이벤트일 때는 아무 일도 안 일어난다.');
		});

	});
	</script> 
</head> 
<body> 
	<div id="mask"></div> 
	<div class="window"> 
		<input type="button" href="#" class="close" value="나는야 닫기 버튼(.window .close)"/> 
	</div> 
	<a href="#" class="openMask">검은 막 띄우기</a> 
</body> 
</html>