<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        User: ${users.user.nombre}
        <form action="http://josdem-inspiron-5420:7171/talentua-jersey/rest/post/multi" method="POST">
			First name: <input type="text" name="firstname"><br>
			Last name: <input type="text" name="lastname"><br>
			<input type="Submit" value="Enviar">
		</form>
    </body>
</html>
