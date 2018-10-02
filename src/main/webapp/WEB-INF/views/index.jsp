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

	<form onsubmit= "return create_json(this);">
	  Customer ID<input type ="text" name="id"><br><br>
	  Date       <input type ="text" name="date"><br><br>
	  Currency Type<input type ="text" name="type"><br><br>
	  Total      <input type ="text" name = "total"><br><br>
	  	
	  	 <input type= "submit" value= "Create JSON">
	</form>

	
	<pre id= "output"> </pre>
	
	  <script type="text/javascript">
	
	var  = document.getElementById("info");
	
	function createJson(form)  {
		var json = {
			"id": form.id.value,
			"date": form.date.value,
			"type": form.type.value,
			"amount": form.amount.value
		};
		
		var html= JSON.stringify(json, 0, 4);
		document.getElementById('output').innerHTML = html;
		return false;
	}
	

	
	</script>

</body>
</html>