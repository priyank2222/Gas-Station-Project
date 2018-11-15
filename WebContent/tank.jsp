

<%@page import="com.Model.Tank"%>
<%@page import="com.Dao.FuelDao"%>
<%@page import="com.Model.Fuel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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


<title>Tank</title>
</head>
<body>
<jsp:include page="left.jsp"/>

<div class="main-content12">
 
 <a class="toggle-btn  menu-collapsed">
 <i class="fa fa-bars"></i>
 </a>
								

	</div>							
 


<%
	String pump_no = request.getParameter("pump_no");
//	out.println(pump_no);
	session.setAttribute("key",pump_no);%>
<center>
<form action="TankController">
<h3>Select Fuel Attached With Tanks:</h3>
</br>
</br>
<%-- <input type="hidden" name="size" value="<%=request.getParameter("tank_no")%>"> --%>
<% 
	int j;
	String s2=request.getParameter("tank_no");
	int tanks=Integer.parseInt(s2);
	for(j=1;j<=tanks;j++)
	{
%>
<div class="sign-u">

<% String name = "tank"+j; %>
 
 
Select Fuel Attached With Tank <%=j %>: 
  <select name="fuel" id="fuel1" required>
 <% List<Fuel> list = FuelDao.getFuel();  %>
 
<option value="">Select</option>
<% for(Fuel fuel : list){ %>
<option value="<%=fuel.getFuelid()%>"><%=fuel.getFuelname()%></option>
<%} %>
</select>
 </div>
</br>
</br>
<%} %>
</br>
</br>
<h3>Give the Fuel Balance of the Tanks:</h3>
</br>
</br>

<% 
	int k;
	String l2=request.getParameter("tank_no");
	int l4=Integer.parseInt(l2);
	for(k=0;k<l4;k++)
	{
%>
<div class="sign-u">


Give the Fuel Balance of Tank <%=k+1 %> :<input type="text" name="n"

									title="It should not be greater than 1000"
									required pattern="^(\d{1,3}|1000)$"
									
									onblur="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');">
</br>
</br>
<%}%>

<br/>
<br/>
<h3>Give The Name Of Tanks:</h3>
<br/>
<br/>

<% 
	int z;
	String l3=request.getParameter("tank_no");
	int l5=Integer.parseInt(l3);
	for(z=0;z<l5;z++)
	{
%>
<div class="sign-u">


Give the Name of Tank <%=z+1 %> :<input type="text" name="name" required>
</br>
</br>
<%}%>



<input type="hidden" name="tanks" value="<%=tanks%>" />


<input type="submit" name="submit" value="Submit">
</div>
</form>
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.min.js"></script>


</body>

</html>