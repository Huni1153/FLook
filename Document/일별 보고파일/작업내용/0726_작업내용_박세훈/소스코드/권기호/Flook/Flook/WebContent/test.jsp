<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd ">
<!-- <html xmlns="http://www.w3.org/1999/xhtml "> -->

	
		<script type="javascript" src="https://maps.google.com/maps/api/js?v=3.exp&region=KR"></script>
	
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAE_LJbtqgkiZ04HJ3X00smAU_lnv0lZxw&sensor=false"></script>
    <script>		
		function initialize() {
		    var mapOptions = {
          		center: new google.maps.LatLng(37.537355,127.009591), //좌표
          		zoom: 17, //확대정도
          		mapTypeId: google.maps.MapTypeId.ROADMAP //기본지도사용(위성지도및 기타지도도있음~)
        	};
        	var map = new google.maps.Map(document.getElementById("map_canvas"),mapOptions);
      		}
		
	</script>
<body onload="initialize()">
	<div id="map_canvas" style="width:500px;height:500px;">
	</div>
</body>
<!-- Latitude: 37.4920538
Longitude: 126.9841267 -->
<!-- AIzaSyAE_LJbtqgkiZ04HJ3X00smAU_lnv0lZxw -->

