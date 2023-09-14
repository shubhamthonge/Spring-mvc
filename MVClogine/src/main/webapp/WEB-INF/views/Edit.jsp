<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Edit Student </h1>
${studentdata}
<form action="update" method="post">

id<input type="text" name="id1" value="${stdlist.id}"></br></br> 
firstname <input type="text" name="fname1" value="${stdlist.fname}"></br></br>
lastname <input type="text" name="lname1" value="${stdlist.lname}"></br></br>
phoneno <input type="text" name="pno1" value="${stdlist.pno}"></br></br>
<input type="submit" value="edit">

</body>
</html>