<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
  <head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
	<link href="css/commentWrite_css/commentWrite_jsw.css" rel="stylesheet">
	<!--  <script src="js/jquery.js"></script>
	<script src="js/bootstrap.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			$('.status').click(function() { $('.arrow').css("left", 0);});
			$('.photos').click(function() { $('.arrow').css("left", 146);});
		});
	</script>
	-->
   </head>

  <body>

	<div class="row">
	<div class="col-md-6 col-md-offset-3">
		<hr>
		<form action="#" method="post" role="form" enctype="multipart/form-data" class="facebook-share-box">
		
			<div class="share">
				<div class="arrow"></div>
				<div class="panel panel-default">
                      <div class="panel-heading"><i class="fa fa-file"></i> 댓글작성하기</div>
                       <div class="comment-avatar"><img src="http://i9.photobucket.com/albums/a88/creaticode/avatar_1_zps8e1c80cd.jpg" alt=""></div>
                      <div class="panel-body">
                        <div class="">
                            <textarea name="message" cols="30" rows="10" id="status_message" class="form-control message" style="height: 40px; overflow: hidden;" placeholder="당신의 생각을 적어주세요"></textarea> 
						</div>
                      </div>
						<div class="panel-footer">

								<div class="row">
									<div class="col-md-5">
										<div class="form-group">
											                                    
											<input type="submit" name="submit" value="작성하기" class="btn btn-primary">                               
										</div>
									</div>
								</div>
						</div>
                    </div>
			</div>
			</form>
			</div>
		
	</div>
	
  </body>
</html>
