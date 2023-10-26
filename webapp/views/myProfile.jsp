<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 폼</title>
<link href="${pageContext.request.contextPath}/assets/css/reset.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/assets/css/setting.css" rel="stylesheet" type="text/css">


</head>
<body>
<jsp:include page="includes/header.jsp"></jsp:include>

<div id="container">

	<ul id="settingsMenu">
		<li class="selected"><a>내 정보</a></li>
		<li><a class="setting_sub">내 정보 수정</a></li>
		<li><a>강아지</a></li>
		<li class="noBorder"><a class="setting_sub">강아지 카드</a></li>
		<li><a class="setting_sub">강아지 등록</a></li>
		<li><a>패밀리</a></li>
		<li><a class="setting_sub">패밀리 목록</a></li>
		<li class="noBorder"><a class="setting_sub">패밀리 신청 관리</a></li>
		<li><a class="setting_sub">패밀리 검색</a></li>
		<li class="last_li"><a>회원탈퇴</a></li>
	</ul>
	
	
	<div>
	
		<h1>내 정보</h1>
		
	</div>

</div>


</body>
</html>