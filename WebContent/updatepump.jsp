<%@page import="com.Dao.TankDao"%>
<%@page import="com.Model.Tank"%>
<%@page import="com.Dao.AttendantDao"%>
<%@page import="com.Model.Attendant"%>
<%@page import="java.util.List"%>
<%@page import="com.Model.Pump"%>
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

<div class="main-content12">
 
 <a class="toggle-btn  menu-collapsed">
 <i class="fa fa-bars"></i>
 </a>
								

	</div>							



<form action="PumpController" >
<% if(request.getAttribute("pump")!=null){
	Pump pump = (Pump)request.getAttribute("pump");
	%> 
<center>

<h3>Select  Tank Attached With Pump:</h3> 
</br>
</br>
<%-- <input type="hidden" name="size" value="<%=request.getParameter("tank_no")%>"> --%>
 
<label>Select Tank Attached With Pump</label>
  <select name="tank" id="tank1" required  >
 <% List<Tank> list = TankDao.getTank();  %>
 
<option value="">Select</option>
<% for(Tank tank : list){ %>
<option value="<%=tank.getId()%>"><%=tank.getTankname()%></option>
<%} %>
</select>
 </div>
</br>
</br>
<br/>
<br/>


<%-- <h3>Select Attendant Assigned To The Pump:</h3>
<br/>
<br/>

<label>Select Attendant Assigned to the Pump </label>
  <select name="attendant" id="attendant" >
 <% List<Attendant> list1 = AttendantDao.getAttendant();  %>
 
<option value="sel">Select</option>
<% for(Attendant attendant : list1){ %>
<option value="<%=attendant.getId()%>"><%=attendant.getName()%></option>
<%} %>

</select>
 --%>
 
  </div>
 
 
</br>
</br>

<h3>Give The New Name Of Pump:</h3>
</br>
</br>


Enter the New Name of the Pump:<input type="text" name="name" value="<%=pump.getPumpname()%>">
<br/>
<br/>


<input type="hidden" name="fueltype" value="<%=pump.getFuelid()%>">
<input type="hidden" name="id" value="<%=pump.getId()%>" />
<input type="submit" name="submit" value="Update">
</div>
<%} %>
</form>
</center>

<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.min.js"></script>
  
 
</body>
</html>