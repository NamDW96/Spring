<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>상품목록 출력(EL & JSTL)</h3>
	
	${orderCommand.orderItem} 안에 orderItem 3개방에 각각 orderItem 객체를 가지고 있다.<br>
	{orderCommand.orderItem} 
	<hr>
	<ul>
		<c:forEach items="${orderCommand.orderItem}" var="orderitem">
		<li>
			${orderitem.itemid} - ${orderitem.num} - ${orderitem.remark} 		
		</li>
		</c:forEach>
	</ul>
</body>
</html>