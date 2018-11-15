
<%@page import="com.Dao.AttendantDao"%>
<%@page import="com.Model.Attendant"%>
<%@page import="com.Dao.TankDao"%>
<%@page import="com.Model.Tank"%>
<%@page import="com.Dao.FuelDao"%>
<%@page import="java.util.List"%>
<%@page import="com.Model.Fuel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pump</title>
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


</head>
<body >

<jsp:include page="left.jsp"/>
<jsp:include page="header.jsp"/>



<center>
<form action="PumpController">



<h3>Select Tank Attached With Pumps:</h3>
</br>
</br>
<%-- <input type="hidden" name="size" value="<%=request.getParameter("tank_no")%>"> --%>
<% 
	int j;
	// String s3=request.getParameter("pump_no"); 
	 String s3=(String)session.getAttribute("key");	
	int pumps=Integer.parseInt(s3);
	for(j=1;j<=pumps;j++)
	{
%>
<div class="sign-u">

<% String name = "pump"+j; %>
 
 
<label>Select Tank Attached With Pump <%=j %> </label>
  <select name="tank" id="tank1" required>
 <% List<Tank> list = TankDao.getTank();  %>
 
<option value="">Select</option>
<% for(Tank tank : list){ %>
<option value="<%=tank.getId()%>"><%=tank.getTankname()%></option>
<%} %>
</select>
 </div>
</br>
</br>
<%} %>
</br>
</br>

<%-- <h3>Select Attendants Assigned To The Pumps</h3>
</br>
</br>

<% 
	int k;
	 String s4=(String)session.getAttribute("key"); 
//	String s4  = request.getParameter("pump_no");
	int pumps1=Integer.parseInt(s4);
	for(k=1;k<=pumps1;k++)
	{
%>




<label>Select Attendant Assigned To The Pump <%=k %> </label>
  <select name="attendant" id="tank1" required >
 <% List<Attendant> list = AttendantDao.getAttendant();  %>
 
<option value="">Select</option>
<% for(Attendant attendant : list){ %>
<option value="<%=attendant.getId()%>"><%=attendant.getName()%></option>
<%} %>
</select>
 </div>
</br>
</br>
<%} %>

 --%>
 
 <h3>Give The Name Of Pumps:</h3>
<br/>
<br/>

<% 
	int z;
	String l3=(String)session.getAttribute("key");
	int l5=Integer.parseInt(l3);
	for(z=0;z<l5;z++)
	{
%>
<div class="sign-u">


Give the Name of Pump <%=z+1 %> :<input type="text" name="name" required>
</br>
</br>
<%}%>




<input type="hidden" name="pumps" value="<%=pumps%>" />

<input type="submit" name="submit" value="Submit">
</div>
</form>
</center>

</body>
</html>