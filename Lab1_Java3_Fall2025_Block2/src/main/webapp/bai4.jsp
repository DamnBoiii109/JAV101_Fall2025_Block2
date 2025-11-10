<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
	<form method="post">
		<button formaction="/Lab1_Java3_Fall2025_Block2/nv/insert">Thêm</button>
		<button formaction="/Lab1_Java3_Fall2025_Block2/nv/delete">Xóa</button>
		<button formaction="/Lab1_Java3_Fall2025_Block2/nv/update">Sửa</button>
		<button formaction="/Lab1_Java3_Fall2025_Block2/nv/find">Tìm Kiếm</button>
	</form>
</body>
</html>