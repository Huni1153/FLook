<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script src="http://code.jquery.com/jquery-1.11.3.min.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<style>
*{
	margin : 0;
	padding : 0;
}

#all{
	width : 80%;
	margin : 0 auto;
	margin-top:90px;
}
</style>

<script type="text/javascript">
$(document).ready(function(){
	
	$('#btn').click(function(){
		
		$.ajax({
			url: $('#fm').attr('action'),
			type: 'POST',
			data: $('#fm').serialize(),
			success: function(data) {
				$('#res').html(data);
			}
		});
		
	});
	
});
</script>


</head>
<body>
<div id="all">	
	<div class=row>
		
		<form id=fm class="form-horizontal" method="post" action="ajax.do">
			<input class="form-control" id="name" name="name"/>
			<input class="form-control" id="age" name="age"/>
			
			<input type="button" class="btn btn-info" id="btn" value="버튼"/>
		</form>
	
	<br><br><hr>
		<div id="res"></div>
	</div>
</div>
</body>
</html>