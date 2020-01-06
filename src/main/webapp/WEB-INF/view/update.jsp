<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css" 
href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<script type="text/javascript">
	function update() {
		var p = $("form").serialize();
		$.post("update",p,function(obj){
			if(obj){
				alert("审核成功!")
				location.href = "update?id"+id;
			}else {
				alert("审核失败!");
			}
		},"json")
	}
</script>
</head>
<body>
<form action="update" method="post">
	编号:<input type="text" name="id" value="${param.id}"><br>
	关键字:<input type="text" name="keywords"><br>
	概述:<input type="text" name="discription"><br>
	公司名称:<input type="text" name="name"><br>
	主营产品:<input type="text" name="goods"><br>
	地址:<input type="text" name="address"><br>
	注册资本（万元）:<input type="text" name="money"><br>
	成立时间:<input type="date" name="cdate"><br>
	年检日期:<input type="date" name="jdate"><br>
	年检状态:<input type="text" name="jtype"><br>
	备注:<input type="text" name="clowrite"><br>
	<input type="submit" value="提交">
</form>
</body>
</html>