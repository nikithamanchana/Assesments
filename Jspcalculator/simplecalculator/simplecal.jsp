<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%   int n1=Integer.parseInt(request.getParameter("num1"));    
 int n2=Integer.parseInt(request.getParameter("num2"));
 int c=0;
		if(request.getParameter("btnsubmit").equals("Addition"))
		{
		c= n1+n2;
		}
		else if(request.getParameter("btnsubmit").equals("Substraction"))
		{
		 c=n1-n2;	
		}
		else if(request.getParameter("btnsubmit").equals("Multiplication"))
		{
		  c=n1*n2;	
		}
		else if(request.getParameter("btnsubmit").equals("Division"))
		{
			c=n1/n2;
		}
		out.print("<h2>"+"Answer is:" +c+"</h2>");
 %>
</body>
</html>