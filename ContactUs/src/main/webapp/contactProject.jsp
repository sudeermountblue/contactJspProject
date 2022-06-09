<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="contactUs.css">
</head>
<body>
<div id="mainContainer">
	<div class="pageContainer">
		 <div class="headerPage">
		   <h1>Contact Us</h1>
		   <p>Please fill the form in a decent manner</p>
		 </div><br>
		 <div >
			 <form action="JspServlet" method="Post">
				 <label for="name">Full Name *</label><br>
				 <input type="text" id="name" name="name"><br>
				 <label for="email">E-mail *</label><br>
				 <input type="email" id="email" name="email"><br>
				 <label  for="message" >Message *</label><br>
				 <textarea rows="5" cols="25" name="message" ></textarea><br><br>
				 <input type="submit">
			 </form>
		 </div>
	</div>
</div>
</body>
</html>