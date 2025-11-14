<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/Lab2_Java3_Fall2025_Block2/form/update" method="post">
<div>FULLNAME</div>
<input name="fullname" value="${user.fullname}"><br>
<div>GENDER</div>
<input type="radio" name="gender" value="true" ${user.gender == 'true' ? 'checked' : '' } >  Male <br>
<input type="radio" name="gender" value="false" ${user.gender == 'false' ? 'checked' : '' } >  Female <br>
<div>COUNTRY</div>
<select name="country">
<option value="VietNam" ${user.country == "VN" ? 'selected' : '' }> Việt Nam</option>
<option value="My" ${user.country == "My" ? 'selected' : '' }> Mẽo</option>
<option value="CN" ${user.country == "cN" ? 'selected' : '' }> Tung quủa</option>
</select>
<hr/>
<p> Gender: ${user.gender } </p>
<button formaction="/Lab2_Java3_Fall2025_Block2/form/create">Create</button>
<button>Update</button>
${CapNhat}
</form>
</body>
</html>