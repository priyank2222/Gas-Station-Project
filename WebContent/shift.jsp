<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Easy Admin Panel an Admin Panel Category Flat Bootstrap Responsive Website Template | Widgets :: w3layouts</title>
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

<br/>
<br/>
<br/>
<form action="ShiftController1" method="get">
<div class="sign-up">
<div class="sign-u">
							<div class="sign-up1" >
								<h4>Select Shift* :</h4>
							</div>
						<div class="sign-up2" >
						
							  <select name="shift" id="shift" style="width:350px;
							  
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
							 
							 
							<option value="">Select Shift</option>
							
							<option value="Day" >Day</option>
							<option value="Night">Night</option>
							
							</select>
							<div class="clearfix"> </div>
						</div>
						</div>
						<!-- <br/>
						<br/>
						<br/>
						<br/>
						<br/>
						<br/>
						<br/>
						<br/>
						<br/>
						<br/> -->
						</div>
					 			<br/>
					 			<br/>
								<center>
									<input type="submit" name="submit" value="Submit">
								</center>
							
							
							<div class="clearfix"> </div>
						


 </div>
 
</form>

</body>

</html>