<!DOCTYPE HTML>
<html>
<head>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/myValidation.js"></script>
<!-- <script src="js/jquery.js" type="text/javascript"></script> -->

<link href="css/myCSS.css" rel="stylesheet">
<title>Sheth User Form</title>
</head>
<style type="text/css">  
.flable {  
 color: red;  
}  
  
.status {  
 font-family: verdana;  
 font-size: 12px;  
}  
  
.uname {  
 color: blue;  
}  
</style>  

<body>

<h2> WelCome User </h2>

	<form id="myform" name="form" action="RegController" method="post">
		<div class="RegForm">
			<label for="fname">First Name:&nbsp;&nbsp;&nbsp;&nbsp;</label> <input name="fname" size="20" id="fname" class="textField" /><br/>
			<label for="lname">Last Name:&nbsp;&nbsp;&nbsp;&nbsp;</label> <input name="lname" size="20" id="lname" class="textField" /><br/>
			<label for="uname">User Name:&nbsp;&nbsp;&nbsp;</label> <input name="uname" size="20" id="uname" class="textField" /><span class="status"></span><br/>
			<label for="email">Email:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label> <input name="email" size="20" id="email" class="textField"  /><br/>
			<label for="phone">Phone NO:&nbsp;&nbsp;&nbsp;&nbsp;</label> <input name="phone" size="20" id="phone" class="textField" /><br/>
			<label for="pass">Password:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label> <input name="pass" type="password" size="20" id="pass" class="textField" /><br/>
			<label for="rpass">Re Password:&nbsp;</label> <input name="rpass" size="20" id="rpass" type="password" class="textField" /><br/>
			
			<p>
				<input class="submit" type="submit" value="SignUp" />
			</p>
		</div>
	</form>
</body>