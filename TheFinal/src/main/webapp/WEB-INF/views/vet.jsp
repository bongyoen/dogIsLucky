<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">	</script>
<script type="text/javascript">

	$(function(){
		 
		 $.getJSON("https://extreme-ip-lookup.com/json", function(data){
			 console.log(data);
			 $("h3").text(data.city+data.query+ "//  너의 위치 = 위도: " + data.lat + " 경도: " +data.lon  );
		 });


		
	})
	
	



	
		
	</script>
</head>
<body>
<h1>
	FinalProject_병원예약페이지입니다.
</h1>
<h2>

</h2>
<h3>
</h3>
	<a href="/vbusiness/main">비즈니스</a>
	<a href="/vprivate/main">일반사용자</a>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
