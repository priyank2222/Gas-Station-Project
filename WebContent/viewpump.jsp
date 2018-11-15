<%@page import="com.Dao.PumpDao"%>
<%@page import="com.Model.Pump"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Easy Admin Panel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
 <!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Graph CSS -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- jQuery -->
<!-- lined-icons -->
<link rel="stylesheet" href="css/icon-font.min.css" type='text/css' />
<!-- //lined-icons -->
<!-- chart -->
<script src="js/Chart.js"></script>
<!-- //chart -->
<!--animate-->
<link href="css/animate.css" rel="stylesheet" type="text/css" media="all">
<script src="js/wow.min.js"></script>
	<script>
		 new WOW().init();
	</script>
<!--//end-animate-->
<!----webfonts--->
<link href='//fonts.googleapis.com/css?family=Cabin:400,400italic,500,500italic,600,600italic,700,700italic' rel='stylesheet' type='text/css'>
<!---//webfonts---> 
 <!-- Meters graphs -->
<script src="js/jquery-1.10.2.min.js"></script>
<!-- Placed js at the end of the document so the pages load faster -->

</head>
<body>
<jsp:include page="left.jsp"/>
<jsp:include page="header.jsp"/>



<% List<Pump> list = PumpDao.getPump();%>
<center>
<table style="border-collapse: separate;
  border-spacing: 50px 0;">
<tr>
<th>Pump Id</th>
<th>Pump Name</th>
<th>Fuel Type Id</th>
<th>Tank Id</th>

<th>Delete</th>
<th>Edit</th>
<% for(Pump pump : list) {%>
</tr>
<tr>
<td style="padding: 10px 0;"> <%=pump.getId()%> </td>
<td style="padding: 10px 0;"> <%=pump.getPumpname()%> </td>
<td style="padding: 10px 0;"> <%=pump.getFuelid()%> </td>
<td style="padding: 10px 0;"> <%=pump.getTankid() %> </td>


<td style="padding: 10px 0;"> <a href="PumpController?submit=Delete&id=<%=pump.getId()%>">Delete</a> </td>
<td style="padding: 10px 0;">
<form action="PumpController">
<input type = "hidden" name="id" value="<%=pump.getId()%>">
<input type="submit" name="submit" value="Edit">
</form>
</td>
</tr>
<%} %>
</table>
<form action="index.jsp">
<input type="submit" value="Home Page"/>

</form>
</center>
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.min.js"></script>


</body>
</html>