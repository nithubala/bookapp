<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Details</title>
</head>
<body>
<%@ include file="../../layout/header.jsp"%>
<form action="../orderItems/addToCart" method="POST">
<div align="left">
<h1>BookDetails</h1>
<c:if test="${empty LOGGED_IN_USER }">
<div class="alert alert-danger" role="alert">
please<strong>Login</strong>to add items to cart.
</div>
</c:if>
							
														<input type="hidden" name="book_id" value="${selectbook.id}" />
							
									
									<p><span>BOOKNAME:</span>${selectbook.bookname}</p>
									<p><span>AUTHORNAME:</span>${selectbook.authorname}</p>
									<p><span>PUBLISHDATE:</span>${selectbook.publishdate}</p>
									<p><span>CONTENT:</span>${selectbook.content}</p>
									<p><span>PRICE:</span>${selectbook.price}</p>
									<p><span>STATUS:</span>${selectbook.status}</p>
									<p><span>Quantity:</span><input type="number" name="quantity" min="1" max="100" step="1" value="0"></p>
									
								
							
							
								
									
										
									<button type="btn" class="btn btn-primary">Add To Cart</button>
									
</div>
</form>
</body>
</html>