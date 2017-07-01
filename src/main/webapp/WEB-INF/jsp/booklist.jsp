<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html >

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LIST OF BOOKS</title>
</head>
<body>
<div class="wrapper">

			<div><%@ include file="../../layout/header.jsp"%></div>
			<div class="content">
				<div class="container-fluid">

					<div class="row">
						<div class="col-md-4">
							
									<h4>List of Books</h4>
								
							
<form action="/Book" method="POST">

<c:forEach items="${books}" var="Book">
								<<img src ="../assets/images/book.jpg" alt="book"  style="width:150px;height:200px;">
								<p><span>ID:</span>${Book.id}</p>
									
									<p><span>BookName:</span>${Book.bookname}</p>
									<p><span>Price:</span>${Book.price}</p>
									<p><span>view:</span></p>
								<div>
										<button type="btn"><a href="../Book/${Book.id}">ViewDetails</a></button>
									</div>
								</c:forEach>
							

						
						
</form>
</div>
</div>
</div>
</div>
</div>


</body>
</html>