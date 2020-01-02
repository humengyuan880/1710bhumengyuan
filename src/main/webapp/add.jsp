<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/index_work.css"
	rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form action="add" method="post" enctype="multipart/form-data">
		商品名称:<input type="text" name="gname"><br> 尺寸<input
			type="text" name="size"><br> 单价<input type="text"
			name="price"><br> 数量<input type="text" name="count"><br>
		标签<input type="text" name="biaoq"><br> 商品图片<input
			type="file" name="myFile"><br> 商品种类<select id="pz"
			name="brand.bid">
			<option>请选择</option>
		</select> <select name="skind.sname" id="pzz">
			<option>请选择</option>
		</select> <input type="submit" value="新增">
	</form>
	<script type="text/javascript">
		//复选框
		$(function() {
			$.post("findbrand", function(obj) {
				for ( var i in obj) {
					$("#pz").append(
							"<option value="+obj[i].bid+">" + obj[i].bname
									+ "</option>")
				}
			}, "json")

			$.post("findskind", function(obj) {
				for ( var i in obj) {
					$("#pzz").append(
							"<option value="+obj[i].sid+">" + obj[i].sname
									+ "</option>")
				}
			}, "json")

		})
	</script>
</body>
</html>