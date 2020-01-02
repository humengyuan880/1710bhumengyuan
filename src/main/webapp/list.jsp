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
<script type="text/javascript">
	function fan() {
		$("[name=cc]:checked").each(function() {
			this.checked = !this.checked;
		})
	}
</script>
</head>
<body>
	<input type="button" onclick="dels()" value="批量删除">
	<table>
		<tr>
			<td><input type="checkbox" onclick="fan()"></td>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>尺寸</td>
			<td>单价</td>
			<td>数量</td>
			<td>标签</td>
			<td>商品图片</td>
			<td>商品种类</td>
			<td>操作</td>
		</tr>

		<c:forEach items="${pp.list}" var="aa">
			<tr>

				<td><input type="checkbox" name="cc" value="${aa.gid}">
				</td>
				<td>${aa.gid}</td>
				<td>${aa.gname}</td>
				<td>${aa.size}</td>
				<td>${aa.price}</td>
				<td>${aa.count}</td>
				<td>${aa.biaoq}</td>
				<td><img alt="无照片" src="${aa.img}" width="100px" height="100px"></td>
				<td>${aa.brand.bname }</td>
				<td><a href="upd.jsp?gid=${aa.gid}">修改</a></td>
			</tr>
		</c:forEach>

		<tr>
			<td colspan="10">当前${pp.pageNum}/${pp.pages}共${pp.total}条 <a
				href="list.do?pageNum=${pp.firstPage}">首页</a> <a
				href="list.do?pageNum=${pp.prePage}">上一页</a> <a
				href="list.do?pageNum=${pp.nextPage}">下一页</a> <a
				href="list.do?pageNum=${pp.lastPage}">末页</a>
			</td>
		</tr>
		<tr>
			<a href="add.jsp">添加</a>
		</tr>
	</table>
	<script type="text/javascript">
		function fan() {
			$("[name='cc']").each(function() {
				this.checked = !this.checked;
			})
		}
		function dels() {
			$("[name=cc]:checked").map(function() {
				return $(this).val()
			}).get().join(",");
		}

		$.post("dels", {
			"ids" : ids
		}, function(obj) {
			if (obj) {
				if (confirm("确认删除吗")) {
					histroy.go(0);
				}
			}
		});

		/* 	function dels() {
				$("[name=cc]:checked").map(function() {
					return $(this).val();
				}).get().join(",");
			}
			$.post("dels", {
				"ids" : ids
			}, function(obj) {
				if (obj) {
					if (confirm("确认删除吗"))
						histroy.go(0);
				}
			}) */
		/*  function  dels(){
		  var ids = $("[name='cc']:checked").map(function(){
			  return  $(this).val();
		  }).get().join(",");
		  alert(ids)
		  $.post("dels",{"ids":ids},function(obj){
			  if(obj){
				  if(confirm("确认删除吗")){
					  history.go(0)
				  }
			  }
		  },"json")
		 } */
	</script>
</body>
</html>