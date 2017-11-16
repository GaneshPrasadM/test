
<%@ page import="java.sql.*" %>
<% Class.forName("oracle.jdbc.driver.OracleDriver"); %>

<html lang="en">
<head>
<!-- Theme Made By www.w3schools.com - No Copyright -->
<title>Bootstrap Theme Company Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet" type="text/css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body id="myPage" data-spy="scroll" data-target=".navbar"
	data-offset="60">

	

	<script
		src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBu-916DdpKAjTmJNIgngS6HL_kDIKU0aU&callback=myMap"></script>
	<!--
To use this code on your website, get a free API key from Google.
Read more at: https://www.w3schools.com/graphics/google_maps_basic.asp
-->

	<footer class="container-fluid text-center">
		<a href="#myPage" title="To Top"> <span
			class="glyphicon glyphicon-chevron-up"></span>
		</a>
		<p>
			<a href="https://www.ionidea.com" title="Visit w3schools">www.ionidea.com</a>
		</p>
	</footer>

<script type="text/javascript">

function callToController(){
	console.log("Inside Method");
	var localRefId = $('#localRefId').val();
	var QuoteItemID = $('#QuoteItemID').val();
	var country=$("#country option:selected").val();
	var buildingnumber=$('#buildingnumber').val();
	var streetname=$('#streetname').val();
	var postalcode=$('#postalcode').val();
	var lattitude=$('#lattitude').val();
	var longitude=$('#longitude').val();
	var cityname=$('#cityname').val();
	var statename=$('#statename').val();
	var serviceid=$("#serviceid option:selected").val();
	var servicename=$("#serviceid option:selected").text();
	var tech_input=$('#tech-input').val();
	var speed_input=$('#speed-input').val();
	
	post_data={
			'localRefId' : localRefId,
			 'quoteItemID': QuoteItemID,
			 'country' : country,
			 'buildingnumber' : buildingnumber,
			 'streetname' : streetname,
			 'postalcode' : postalcode,
			 'lattitude' : lattitude,
			 'longitude' : longitude,
			 'cityname' : cityname,
			 'statename' : statename,
			 'serviceid' : serviceid,
			 'servicename' : servicename,
			 'tech_input' : tech_input,
			 'speed_input' : speed_input
	}
	post_data=JSON.stringify(post_data);
	console.log(post_data);
	$.ajax({
		type : "POST",
		url : 'myMapping',
		data : post_data,
		contentType : 'application/json',
		success : function(response) {
			console.log(JSON.stringify(response));
		}
	});
}
</script>
<div>
</div>
<div class="container">
<h2>Response:</h2>

  
  <p></p>            
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Local Ref Id</th>
        <th>Country</th>
        <th>City</th>
		<th>Address</th>
        <th>Postal Code</th>
        <th>Access Speed</th>
		<th>Technology</th>
        <th>Service</th>
        <th>MRP(Monthly Recurring Price)</th>
		<th>OTP(One Time Price)</th>
        <th>Currency</th>
        <th>Contract Duration</th>
		<th>Provider</th>
		<th>Comments</th>
      </tr>
    </thead>
     <tbody>
	 <% 
	 
            Connection connection = DriverManager.getConnection(
            		"jdbc:oracle:thin:@10.237.59.104:1521:MEERKAT","meerkat","meerkat");

            Statement statement = connection.createStatement();

            String id = request.getParameter("id");  

            ResultSet resultset = 
                statement.executeQuery("select * from webalc2_response") ; 

            while(resultset.next()) {
               
        %>

				<TD><%= resultset.getString("LOCAL_REF_ID") %></TD>
				<TD><%= resultset.getString("COUNTRY") %></TD>
				<TD><%= resultset.getString("CITY_NAME") %></TD>
				<TD><%= resultset.getString("ADDRESS") %></TD>
				<TD><%= resultset.getString("POSTAL_CODE") %></TD>
				<TD><%= resultset.getString("SPEED") %></TD>
				<TD><%= resultset.getString("TECHNOLOGY") %></TD>
				<TD><%= resultset.getString("SERVICE_NAME") %></TD>
				<TD><%= resultset.getString("MRC_VALUE") %></TD>
				<TD><%= resultset.getString("NRC_VALUE") %></TD>
				<TD><%= resultset.getString("CURRENCY") %></TD>
				<TD><%= resultset.getString("CONTRACT_DURATION") %></TD>
				<TD><%= resultset.getString("PROVIDER") %></TD>
				<TD><%= resultset.getString("COMMENTS") %></TD>



			</tbody>
       <% 
           } 
       %>
  </table>
  
</div>

</body>
</html>