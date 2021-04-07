<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<c:forEach var="cartList" items="${requestScope.cartList }">
<li role="presentation" style="height:50px;">
	<div class="viewCart_ingredient">
	      <img class="viewCart_ingredient_img"
	         src="${cart.completeImage }">${cart.ingredientName} ${cart.ingredientAmount }${cart.ingredientUnit }/${cart.recipeName }
	</div>
	<div class="viewCart_marker_delete">
	   <img class="viewCart_marker_img"
	      src="img/viewCart_img/marker.png"> <a href="#"><img
	      class="viewCart_delete_img"
	      src="img/viewCart_img/paper_basket.png" class="delToast"></a>
	</div>
 </li>
</c:forEach>