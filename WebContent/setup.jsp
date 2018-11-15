<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Easy Admin Panel an Admin Panel Category Flat Bootstrap Responsive Website Template | Sign Up :: w3layouts</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keyword
s" content="Easy Admin Panel Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
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

<div class="main-content12">
 
 <a class="toggle-btn  menu-collapsed">
 <i class="fa fa-bars"></i>
 </a>
								

	</div>							
 
 
    <section>
    <form action="SetupController">
    <!-- <form action="tank.jsp" name="f1"> -->
			<div id="page-wrapper" class="sign-in-wrapper">
			
				<div class="graphs">
					<div class="sign-up">
						<h3>Fuel Station Setup</h3>
						<p class="creating">Having hands on experience in creating innovative designs,I do offer design 
							solutions which harness.</p>
						
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Number of Pumps*:</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="pump_no" id="pump_no"
									
									title="Please enter number between 1-10"
									required pattern="^(1|2|3|4|5|6|7|8|9|10)$"
									
									onblur="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
									
									
									 placeholder=" "  />
							
								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class="sign-u">
							<div class="sign-up1">
								<h4>Number of Tanks*:</h4>
							</div>
							<div class="sign-up2">
								
									<input type="text" name="tank_no" id="tank_no" 
									title="Please enter number between 1-10"
									required pattern="^(1|2|3|4|5|6|7|8|9|10)$"
									
									onblur="this.setCustomValidity(this.validity.patternMismatch ? this.title : '');
									
									
									placeholder=" " />
								
							</div>
						</div>
					
									<input type="submit" name="submit" value="Submit">
								<!-- </form> -->
							
							</form>
							<div class="clearfix"> </div>
						
					</div>
				</div>
			</div>
		<!--footer section start-->
			<footer>
			   
			</footer>
        <!--footer section end-->
	</section>
	
<script src="js/jquery.nicescroll.js"></script>
<script src="js/scripts.js"></script>
<!-- Bootstrap Core JavaScript -->
   <script src="js/bootstrap.min.js"></script>
   <%-- <% 
    request.setAttribute("pump_no",pump_no);

    RequestDispatcher dispatcher = request.getRequestDispatcher("pump.jsp");
    
    %> --%>
</body>

</html>