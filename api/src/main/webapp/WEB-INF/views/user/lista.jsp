<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista</title>
</head>
<body>
	<div class="container">

		<div class="panel-defualt"></div>
		<table class="table table-striped table-condensed">
			<thead>
				<tr>
					<th>Id do Hotel</th>
					<th>Cidade</th>
					<th>id do Quarto</th>
					<th>Valor Total</th>
					<th>Valor Adulto</th>
					<th>Valor Criança</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="h" items="${hoteis}">
					<tr>
						<td>${h.id}</td>
						<td>${h.cityName}</td>
						<c:forEach var="r" items="${h.rooms}">
							<td>${r.roomID}</td>
							<td>${r.categoryName}</td>
							<td>${r.totalViagem}</td>
							<td>${r.price.adult}</td>
							<td>${r.price.child}</td>
						</c:forEach>
					<tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

</body>
</html>