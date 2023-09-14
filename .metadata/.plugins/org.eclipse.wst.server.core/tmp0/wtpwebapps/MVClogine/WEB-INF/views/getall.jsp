<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>get all student page</title>
</head>
<body>
	<h1>Get all data from db</h1>

	<table border=1>
		<thead>
			<tr>
				<th>id</th>
				<th>firstname</th>
				<th>lastname</th>
				
				<th>phoneno</th>
				<th>Action</th>

				</tr>
		</thead>
		<tbody>
			<c:forEach items="${stdlist}" var="stdlist">
				<tr>
					<td><c:out value="${stdlist.id}" /></td>
					<td><c:out value="${stdlist.firstname}" /></td>
					<td><c:out value="${stdlist.lastname}" /></td>
					<td><c:out value="${stdlist.phoneno}" /></td>

					<td><a href="editstudent?id=<c:out value='${stdlist.id}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="delete?id=<c:out value='${stdlist.id}' />">Delete</a></td>


				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>