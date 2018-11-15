
<%@page import="java.util.List"%>
<%@page import="com.Model.Tank"%>
<%@page import="com.Dao.TankDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tank Inventory</title>
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



<form action="ChartSservlet" >

<%-- <center>
Select tank  :
 <select name="tank"  required >
 <% List<Tank> list = TankDao.getTank();  %>
 
<option value="">Select</option>
<% for(Tank tank2 : list){ %>
<option value="<%=tank2.getId()%>"  ><%=tank2.getTankname()%></option>
<%System.out.println(tank2.getId()); %>
<%} %>
</select>

 <br/>
 <br/>
 


<input type="submit" name="submit" value="ViewChart">
</form>
</center>

 --%>
<div class="main-content">

				<div id="page-wrapper">
					<div class="graphs">						
						<div class="col_3">
						<% List<Tank> list1 = TankDao.getTank();%>
						<% for(Tank tank3 : list1){ %>
						<div class="col-md-3 widget1">
							<div class="r3_counter_box">
								<i class="fa fa-eye"></i>
								<div class="stats">
								  <h5><%=(tank3.getFuelbalance()*100)/1000%><span>%</span></h5>
								  <div class="grow grow3">
									<a href="ChartSservlet?tank=<%= tank3.getId()%>"><p><%=tank3.getTankname() %></p></a>
								  </div>
								</div>
								
							</div>
							</div>
							<%} %>
						<div class="clearfix"> </div>
					
						 </div>
					</div>
				</div>
						
</div>

</form>
 


</body>
</html>