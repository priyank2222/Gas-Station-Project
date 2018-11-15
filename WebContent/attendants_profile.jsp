<%@page import="com.Dao.PumpDao"%>
<%@page import="com.Model.Pump"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Easy Admin Panel an Admin Panel Category Flat Bootstrap Responsive Website Template | Sign Up :: w3layouts</title>
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

<body class="sign-in-up">


<jsp:include page="left.jsp"/>
<jsp:include page="header.jsp"/>



    <section>
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
								
									<input type="text" name="fname" id="fname" path="fname"
									title="Please enter only characters"
									required pattern="^[a-zA-Z]+$"
									
									onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');"
									placeholder=" " />
							
								
								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Last Name* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="lname" 
									title="Please enter only characters"
									required pattern="^[a-zA-Z]+$"
									
									onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
									
									placeholder=" " />
								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Email Address* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="email"
									title="Please enter valid email address"
									required pattern="^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$"
									
									onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
									
									placeholder=" " 
									
									 />
								<div class="clearfix"> </div>
							</div>
							
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Address* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="address" 
									
									title="Please enter valid address"
									
									
							
									onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');"
									
									placeholder=" " 
									required
									/>
								<div class="clearfix"> </div>
							</div>
							<div class="sign-u">
							<div class="sign-up1">
								<h4>Contact No* :</h4>
								
							</div>
							<div class="sign-up2">
								
									<input type="text" name="contact" 
									title="Please enter valid contact number"
									required pattern="^(\+\d{1,3}[- ]?)?\d{10}$"
									
									onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
									
									placeholder=" " 
									
									/>
								<div class="clearfix"> </div>
							</div>
						<br/>
						<br/>
						
						
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
								<h4>Username* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="uname" 
									title="Please enter valid username"
									required pattern="^[a-z0-9_-]{3,15}$"
									
									onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
									
									placeholder=" " 
									
									
									/>
								
							</div>
						
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Password* :</h4>
							</div>
							<div class="sign-up2">
								
									<input type="password" name="password" 
									title="Please enter valid password which contains one uppercase letter one lower case letter and one numeric number"
									required pattern="^(?=.*\d)(?=.*[a-zA-Z]).{4,8}$"
									
									onchange="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
									
									placeholder=" " 
									
									
									/>
								
							</div>
							
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Shift* :</h4>
							</div>
							<div class="sign-up2" >
							
							<select name="shift" id="shift" style="width:350px;
							  
							  padding:15px;
						    color:#333;
						    font-size:13px;
						    background:none;   
						    outline:none;
						    margin:6px auto;
						   
						    -webkit-apperance:none;
						    background:#FFF;
							border:1px solid #ECECEC;
						    outline:none;
						    transition: border-color 0.3s;
							-o-transition: border-color 0.3s;
							-ms-transition: border-color 0.3s;
							-moz-transition: border-color 0.3s;
							-webkit-transition: border-color 0.3s;" required>
							 
							 
							<option value="">Select Shift</option>
							
							<option value="Day" >Day</option>
							<option value="Night">Night</option>
							
							</select>
							<div class="clearfix"> </div>
						</div>
						</div>
							
							<div class="clearfix"> </div>
						</div>
						
						
						 <div class="sign-u">
							<div class="sign-up1" >
								<h4>Select Pump* :</h4>
							</div>
						<div class="sign-up2" >
						
							  <select name="pump" id="pump" style="width:350px;
							  
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
						
						
					 			
									<input type="submit" name="submit" value="Submit">
								
							
							
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
	</section>
	
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.min.js"></script>



</body>
</html>