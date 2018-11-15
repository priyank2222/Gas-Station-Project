
<%@page import="com.Model.Fuel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

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

<section">
<% if(request.getAttribute("fuel")!=null){
	Fuel fuel = (Fuel)request.getAttribute("fuel");
	%>

<form action="FuelController" method="get">
<center>
								<table>
								
								<div class="signin">
							    <div class="signin-rit">
							    <tr>
								 <th>Fuel Name:</th><td> <input type="text" name="fuelname" value="<%=fuel.getFuelname() %>" /></td>
								 </tr>
								</div>
								
								<div class="signin-rit">
								<!-- <tr>
								<th>Fuel Id: </th><td><input type="text" name="fuelid" id="fuelid" /></td>
								 </tr>
								 --> </table>
								</div>
								<input type="hidden" name="id" value="<%=fuel.getFuelid()%>" />
								<input type="submit" name="submit" value="Update" />
								
								</center>
								
</form>
<% }else{ %>
<jsp:include page="left.jsp"/>


<form action = "FuelController" method="get" id="fuelForm">

								
 <div class="main-content12">
 
 <a class="toggle-btn  menu-collapsed">
 <i class="fa fa-bars"></i>
 </a>
								

	</div>							
 

								<section>
								<center>
								<table>

								<div class="signin">
							    <div class="signin-rit">
							     <tr>
								 <th>Fuel Name:</th>
								 <td> <input type="text" name="fuelname"  class="lock" required/>
								 </td>
								 </tr>
								</div>
								</div> 
								
								<!--<div class="signin-rit">
								 <tr>
								<th>Fuel Id: </th><td><input type="text" name="fuelid" id="fuelid" /></td>
								 </tr>
								 
								
								 </div>  --></table>
								
								<input type="submit" value="Submit" name="submit">

								</center>
								</section>
								</form>
							
								
		<!-- <script type="text/javascript">   
    $(document).ready(function () {
        $('#fuelForm').bValidator();
    });
</script>  -->
<%} %>
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.min.js"></script>

								
</body>
</html>