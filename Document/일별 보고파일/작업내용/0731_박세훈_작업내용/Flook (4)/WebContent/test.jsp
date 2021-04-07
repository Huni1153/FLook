<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd ">
<!-- <html xmlns="http://www.w3.org/1999/xhtml "> -->
<meta http-equiv="X-UA-Compatible" content="IE=9" />
<script type="javascript" src="https://maps.google.co.kr/maps/api/js?v=3.exp&region=KR"></script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyAE_LJbtqgkiZ04HJ3X00smAU_lnv0lZxw&sensor=false"></script>
<!-- GoogoleMap Asynchronously Loading the API ********************************************* -->
<script type="text/javascript" src="http://maps.google.com/maps/api/js?v=3.3&sensor=true"></script>
<script type="text/javascript">
var geocoder;
var map;
function initialize() {
  geocoder = new google.maps.Geocoder();
  var latlng = new google.maps.LatLng(37.4920538, 126.9841267);
  var mapOptions = {
    zoom: 16,
    center: latlng
  }
  map = new google.maps.Map(document.getElementById('map-canvas'), mapOptions);
}
function codeAddress() {
  var address = document.getElementById('address').value;
  geocoder.geocode( { 'address': address}, function(results, status) {
    if (status == google.maps.GeocoderStatus.OK) {
      map.setCenter(results[0].geometry.location);
      var marker = new google.maps.Marker({
          map: map,
          position: results[0].geometry.location
      });
    } else {
      alert('Geocode was not successful for the following reason: ' + status);
    }
  });
}
google.maps.event.addDomListener(window, 'load', initialize);
</script>

 <div onload="initialize()" id="map-canvas" style="width:500px;height:500px;">
 </div>
<!-- Latitude: 37.4920538
Longitude: 126.9841267 -->
<!-- AIzaSyAE_LJbtqgkiZ04HJ3X00smAU_lnv0lZxw -->