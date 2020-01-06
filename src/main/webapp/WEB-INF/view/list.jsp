<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resource/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
</head>
<body>
	<form action="list" method="post">
		编号:<input type="text" name="id" value="${column.id}"> 关键字:<input
			type="text" name="keywords" value="${column.keywords}"> 描述:<input
			type="text" name="description" value="${column.description}">
		公司名称:<input type="text" name="name" value="${column.name}">
		主营产品:<input type="text" name="goods" value="${column.goods}">
		地址:<input type="text" name="address" value="${column.address}">
		注册资本:<input type="text" name="startmoney" value="${column.startmoney}">--
		<input type="text" name="endmoney" value="${column.endmoney}">
		成立时间:<input type="date" name="startcdate" value="${column.startcdate}">--
		<input type="date" name="endcdate" value="${column.endcdate}">
		年检日期:<input type="date" name="startjdate" value="${column.startjdate}">--
		<input type="date" name="endjdate" value="${column.endjdate}">
		<button>查询</button>
	</form>
	<table class="table">
		<tr>
			<td>编号</td>
			<td>关键字</td>
			<td>概述</td>
			<td>公司名称</td>
			<td>主要产品</td>
			<td>地址</td>
			<td>注册资本（万元）</td>
			<td>成立时间</td>
			<td>年检日期</td>
			<td>年检状态</td>
			<td>备注</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${info.list}" var="c">
			<tr>
				<td>${c.id}</td>
				<td>${c.keywords}</td>
				<td>${c.description}</td>
				<td>${c.name}</td>
				<td>${c.goods}</td>
				<td>${c.address}</td>
				<td>${c.money}</td>
				<td>
					<fmt:formatDate value="${c.cdate}"/>
				</td>
				<td>
					<fmt:formatDate value="${c.jdate}"/>
				</td>
				<td>${c.jtype}</td>
				<td>${c.clowrite}</td>
				<td>
					<a href="toUpdate?id=${c.id}"><input type="button" value="年检审核"></a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="10">
				当前是${info.pageNum}/${info.pages}——共${info.total}条数据 <a
				href="list?pageNum=1&id=${column.id}&keywords=${column.keywords}&description=${column.description}&name=${column.name}&goods=${column.goods}&address=${column.address}&startmoney=${column.startmoney}&endmoney=${column.endmoney}&startcdate=${column.startcdate}&endcdate=${column.endcdate}&startjdate=${column.startjdate}&endjdate=${column.endjdate}">
					<button>首页</button>
			</a> <a
				href="list?pageNum=${info.prePage==0?1:info.prePage}&id=${column.id}&keywords=${column.keywords}&description=${column.description}&name=${column.name}&goods=${column.goods}&address=${column.address}&startmoney=${column.startmoney}&endmoney=${column.endmoney}&startcdate=${column.startcdate}&endcdate=${column.endcdate}&startjdate=${column.startjdate}&endjdate=${column.endjdate}">
					<button>上一页</button>
			</a> <a
				href="list?pageNum=${info.nextPage==0?info.pages:info.nextPage}&id=${column.id}&keywords=${column.keywords}&description=${column.description}&name=${column.name}&goods=${column.goods}&address=${column.address}&startmoney=${column.startmoney}&endmoney=${column.endmoney}&startcdate=${column.startcdate}&endcdate=${column.endcdate}&startjdate=${column.startjdate}&endjdate=${column.endjdate}">
					<button>下一页</button>
			</a> <a
				href="list?pageNum=${info.pages}&id=${column.id}&keywords=${column.keywords}&description=${column.description}&name=${column.name}&goods=${column.goods}&address=${column.address}&startmoney=${column.startmoney}&endmoney=${column.endmoney}&startcdate=${column.startcdate}&endcdate=${column.endcdate}&startjdate=${column.startjdate}&endjdate=${column.endjdate}">
					<button>尾页</button>
			</a>
			</td>
		</tr>
	</table>
</body>
</html>