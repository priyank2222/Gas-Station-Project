<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Setup Details</title>
<link href="css/animate.css" rel="stylesheet" type="text/css" media="all">
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
<body background-image="pump.jpg">
<center>
Select Fuel Attached With Pumps:
</br>
</br>
<%
	int i;
	String s1 = request.getParameter("pump_no");
	int s3=Integer.parseInt(s1);
	for(i=0;i<s3;i++)
	{
%>
<div class="sign-u">

Select Fuel Attached With Pump <%=i+1 %> :<select id="pump">
<option value="Petrol">Petrol</option>
<option value="Diesel">Diesel</option>
<option value="Power">Power</option>
<option value="2T-Mix">2T-Mix</option>


</select>
</div>
</br>
</br>
<%}%>
Select Fuel Attached With Tanks:
</br>
</br>
<% 
	int j;
	String s2=request.getParameter("tank_no");
	int s4=Integer.parseInt(s2);
	for(j=0;j<s4;j++)
	{
%>
<div class="sign-u">


Select Fuel Attached With Tank <%=j+1 %> :<select id="pump">
<option value="Petrol">Petrol</option>
<option value="Diesel">Diesel</option>
<option value="Power">Power</option>
<option value="2T-Mix">2T-Mix</option>

</select>
</div>
</br>
</br>
<%} %>
<% 
	int d,f;
	String z1=request.getParameter("pump_no");
	int l1=Integer.parseInt(z1);
	String z2=request.getParameter("tank_no");
	int l2=Integer.parseInt(z2);
	for(d=1;d<=l1;d++)
		{
%>
<div class="sign-u">
Select Tank attached with pump<%=d %> :<select id="pump">
<%
	for(f=0;f<l2;f++)
		{%>
<option value="Petrol">tank<%=f+1 %></option>
<%} %>
</select>
</br>
</br>
<%} %>
</br>
</br>

<input type="submit" value="submit">
</center>
</body>
</html>