<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head><title>OPAH</title></head>
<body>

		<spring:url value="${'/dados/pesquisar'}" var="save"/>
       	<form:form modelAttribute="pesquisa" action="${save }" method="post">
		  
		  <label for="hotel">Id cidade:</label>
		  <input type="text" name="hotel" /> <br />
		  
		  <label for="dataCheckin">data Checkin:</label>
		  <input type="text" name="dataCheckin" /> <br />
		  
		  <label for="dataCheckout">data Checkout:</label>
		  <input type="text" name="dataCheckout" /> <br />
		  
		  <label for="qtdAdultos">qtd Adulto:</label>
		  <input type="text" name="qtdAdultos" /> <br />
		  
		  <label for="qtdCriancas">qtd Criança:</label>
		  <input type="text" name="qtdCriancas" /> <br />
		  
		  <input type="submit" value="Register" />
	  </form:form>
       
</body>
</html>