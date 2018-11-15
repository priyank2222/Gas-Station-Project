<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

  <!-- Datepicker -->
  
  <link rel="stylesheet" href="css/jquery-ui.css">
  <script src="js/jquery-1.1.js"></script>
  <script src="js/jquery-ui.js"></script>
  


    <script>
  $(function() {
    $( "#datepicker" ).datepicker();
  });
  $(function() {
	    $( "#datepicker1" ).datepicker();
	  });
  </script>

</head>
<body>
<form action="ShiftController" method="get">
<div class="sign-up">
<div class="sign-u">
							<div class="sign-up1" >
								<h4>Select Date* :</h4>
							</div>
						<div class="sign-up2" >
							<input type="date" name="date" id="datepicker"/>
						
							<div class="clearfix"> </div>
							<br/>
						  	 to
						  	 <br/>
						  	 <br/>
							<input type="date" name="date1" id="datepicker1"/>				
						</div>
						</div>
						
						</div>
						<br/>
						<br/>
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