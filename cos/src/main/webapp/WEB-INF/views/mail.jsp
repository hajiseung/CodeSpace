<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.css">
<script src="https://code.jquery.com/jquery-2.2.4.js"></script>

<style>
body{
background-color: #f5f6f7;
}
#content{
	width: 500px;
	margin: 300px auto;	
}
.kkk{
	height: 100px;
	line-height: 100px;
}
</style>
<title>CODE SPACE</title>
</head>

<body class="text-center">
	<div id="content">
		<h1 class="h3 mb-3 font-weight-normal">CODE SPACE</h1>
		<div class="kkk">회원가입을 진심으로 감사드립니다!!</div>
		<button class="btn btn-lg btn-primary btn-block" style="width: 300px; margin: auto;" onclick="link()">홈페이지로 이동하기</button>
		<p class="mt-5 mb-3 text-muted">&copy; 2018-2019</p>
	</div>
</body>
<script>
function link(){
	location.href="http://localhost:8080/cos/";
}
</script>
</html>
