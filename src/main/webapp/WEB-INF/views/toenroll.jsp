<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h2> 2017년 1학기에 신청할 예상 교과목 입력</h2>

<form action="DoApplication" method="GET">
<p> 수강년도: <input type="text" size="20" name="year" id="year"></p>
<p> 학기: <input type="text" size="20" name="grade" id="grade"></p>
<p> 교과코드: <input type="text" size="20" name="code" id="code"></p>
<p> 교과목명: <input type="text" size="20" name="name" id="name"></p>
<p> 구분: <input type="text" size="20" name="division" id="division"></p>
<p> 학점: <input type="text" size="20" name="score" id="score"></p>
<p><input type="submit" size="20" value="수강신청" name="press" id="press"></p>
</form>

</body>
</html>