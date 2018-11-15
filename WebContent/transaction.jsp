

<%@page import="com.Dao.PumpDao"%>
<%@page import="com.Model.Pump"%>
<%@page import="com.Dao.FuelDao"%>
<%@page import="com.Model.Fuel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Transaction</title>

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
<body class="sign-in-up"><jsp:include page="left.jsp"/>

<div class="main-content12">
 
 <a class="toggle-btn  menu-collapsed">
 <i class="fa fa-bars"></i>
 </a>
								

	</div>							






<section>
    <form action="TransactionController">
	


<div id="page-wrapper" class="sign-in-wrapper">
				<div class="graphs">
					<div class="sign-up">
			
					<h3>Transaction</h3>
					<br/>
					<br/>
							<div class="sign-u">
							
							<div class="sign-up1">
								<h4>Enter Fuel* :</h4>
							</div>
							<div class="sign-up2" >
						
							  <select name="fuel" id="fuel" style="width:410px;
							  
							  padding:15px;
						    color:#333;
						    font-size:13px;
						    background:none;   
						    outline:none;
						    margin:4px auto;
						   
						    -webkit-apperance:none;
						    background:#FFF;
							border:1px solid #ECECEC;
						    outline:none;
						    transition: border-color 0.3s;
							-o-transition: border-color 0.3s;
							-ms-transition: border-color 0.3s;
							-moz-transition: border-color 0.3s;
							-webkit-transition: border-color 0.3s;" required>
							 <% List<Fuel> list = FuelDao.getFuel();  %>
							 
							<option value="">Select Fuel</option>
							<% for(Fuel fuel : list){ %>
							<option value="<%=fuel.getFuelid()%>"><%=fuel.getFuelname()%></option>
							<%} %>
							</select>
							
						</div>
						<div class="clearfix"> </div>
						</div>
						
						 
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Fuel Amount* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="amount" 
									title="Please enter valid password which contains one uppercase letter one lower case letter and one numeric number"
									
									
									onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
									
									placeholder=" " 
									
									required
									/>
								
							</div>
							
							<div class="clearfix"> </div>
						</div>
						
						 
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Pump Name* :</h4>
							</div>
							<div class="sign-up2" >
						
							  <select name="pump" id="pump" style="width:410px;
							  
							  padding:15px;
						    color:#333;
						    font-size:13px;
						    background:none;   
						    outline:none;
						    margin:4px auto;
						   
						    -webkit-apperance:none;
						    background:#FFF;
							border:1px solid #ECECEC;
						    outline:none;
						    transition: border-color 0.3s;
							-o-transition: border-color 0.3s;
							-ms-transition: border-color 0.3s;
							-moz-transition: border-color 0.3s;
							-webkit-transition: border-color 0.3s;" required>
							 <% List<Pump> list1 = PumpDao.getPump();  %>
							 
							<option value="">Select Pump</option>
							<% for(Pump pump : list1){ %>
							<option value="<%=pump.getId()%>"><%=pump.getPumpname()%></option>
							<%} %>
							</select>
							
						</div>
						<div class="clearfix"> </div>
						
						</div>
						
						<input type="submit" name="submit" value="Submit">
						<br/>
						<br/>
						
						
						<%Pump pump = new Pump(); %>
						<input type="hidden" name="empid" value="<%=pump.getId() %>">
					</div>
					</div>
					</div>	
</form>
</section>

</body>
</html>