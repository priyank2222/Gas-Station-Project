<%@page import="com.Dao.PumpDao"%>
<%@page import="com.Model.Pump"%>
<%@page import="java.util.List"%>
<%@page import="com.Model.Attendant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Attendant</title>
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

</head>
<body>
<section>
<% if(request.getAttribute("attendant")!=null){
	Attendant attendant = (Attendant)request.getAttribute("attendant");
	%>

    <form action="AttendantController">
			<div id="page-wrapper" class="sign-in-wrapper">
				<div class="graphs">
					<div class="sign-up">
						<h3>Attendants Information</h3>
						
						<h5>Personal Information</h5>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>First Name* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="fname" value="<%=attendant.getName()%>" placeholder=" " required=" "/>
								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Last Name* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="lname" value="<%=attendant.getLastname()%>" placeholder=" " required=" "/>
								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Email Address* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="email" value="<%=attendant.getEmail()%>"/>
								
							</div>
							<div class="sign-u">
							<!-- <div class="sign-up1">
								<h4>Location* :</h4>
							</div> -->
							<div class="sign-up2">
								<!-- <form>
									<input type="text" placeholder=" " required=" "/>
								</form> -->
							</div>
							<div class="clearfix"> </div>
						</div>
						<h6>Login Information</h6>
						<!-- <div class="sign-u">
							<div class="sign-up1">
								<h4>User Name* :</h4>
							</div>
							<div class="sign-up2">
								<form>
									<input type="text" name="uname" placeholder=" " required=" "/>
								</form>
							</div>
							<div class="clearfix"> </div>
						</div> -->
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Password* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="password" name="password" value="<%=attendant.getPassword()%>" placeholder=" " required=" "/>
								
							</div>
						
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1" >
								<h4>Select Pump* :</h4>
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
							 <% List<Pump> list = PumpDao.getPump();  %>
							 
							<option value="">Select Pump Assigned To The Attendant</option>
							<% for(Pump pump : list){ %>
							<option value="<%=pump.getId()%>"><%=pump.getPumpname()%></option>
							<%} %>
							</select>
							<div class="clearfix"> </div>
						</div>
						</div>
					
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Shift* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="shift" value="<%=attendant.getShift()%>" placeholder=" " required=" "/>
								
							</div>
						
							<div class="clearfix"> </div>
						</div>
						
						
									<input type="hidden" name = "id" value="<%=attendant.getId() %>">
									<input type="submit" name="submit" value="Update">
								
							
							
							<div class="clearfix"> </div>
						</div>
					</div>
				</div>
			</div>
		<!--footer section start-->
			<!-- <footer>
			   <p>&copy 2015 Easy Admin Panel. All Rights Reserved | Design by <a href="https://w3layouts.com/" target="_blank">w3layouts.</a></p>
			</footer> -->
        <!--footer section end-->
        </form>
        <%} %>
	</section>
	

</body>
</html>