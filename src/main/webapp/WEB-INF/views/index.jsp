<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSON Form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/minty/bootstrap.min.css" />
</head>
<body>
	 <h1>Create Json Here</h1><br>

	
	<form action = "submit">
	  Ref     <input type ="text" name="ref"><br><br>
	  Date    <input type ="text" name="date"><br><br>
	  Currency<input type ="text" name="currency"><br><br>
	  Amount  <input type ="text" name = "amount"><br><br>
	  	
	  	 <!-- <input type= "submit" value= "Create JSON"> -->
	  	 <input type= "button" onclick="createJson(this)" value= "Create JSON">
	</form>
	${json}
	
	<span id= "output"> </span>
	
	  <script type="text/javascript">
	
	/* var  = document.getElementById("info"); */
	
	function createJson(form)  {
		console.log("this is " + form);
		var json = {
			"id": form.id.value,
			"date": form.date.value,
			"type": form.type.value,
			"amount": form.amount.value
		};
		
		var html= JSON.stringify(json);
		document.getElementById('output').innerHTML = html;
		return false;
	}
	

	
	</script>

</body>
</html>