<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<% 
	String name = (String)request.getAttribute("name");
	String phoneKind = (String)request.getAttribute("phoneKind");

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<!-- 나중에 css 통합 관리 필요 -->
<style type="text/css">
table {
    border-collapse: collapse;
}

table, th, td {
    border: 1px solid black;
}
</style>
<title>설문조사 결과</title>
</head>
<body>
	<h2>스마트폰 설문 조사 결과</h2>
	
	<strong> <%=name %></strong>님께서는 <strong><%=phoneKind %></strong>를 선택하셨습니다.
	<br/><br/>
	<table border="1">
		<thead>
			<tr>
				<th colspan="5">설문조사 현황</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>아이폰</td>
				<td>겔럭시</td>
				<td>베가</td>
				<td>LG폰</td>
				<td>기타</td>
			</tr>
			<tr>
				<td> 명</td>
				<td> 명</td>
				<td> 명</td>
				<td> 명</td>
				<td> 명</td>
			</tr>
		</tbody>
	</table>
	<br/>
	
</body>
</html>