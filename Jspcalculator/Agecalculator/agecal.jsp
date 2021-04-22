<%@page contentType="text/html" pageEncoding="UTF-8"%>
 <%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>

<%
            String cal =request.getParameter("cal");

            int yearcal= Integer.parseInt(cal.substring(0, 4));
            int monthcal = Integer.parseInt(cal.substring(5, 7));
            int daycal= Integer.parseInt(cal.substring(8, 10));

            DateFormat dateFormat = new SimpleDateFormat("yyyy");
            java.util.Date date = new java.util.Date();
            int thisYear = Integer.parseInt(dateFormat.format(date));

            dateFormat = new SimpleDateFormat("MM");
            date = new java.util.Date();
            int thisMonth = Integer.parseInt(dateFormat.format(date));

            dateFormat = new SimpleDateFormat("dd");
            date = new java.util.Date();
            int thisDay = Integer.parseInt(dateFormat.format(date));

            int age = thisYear - yearcal;


            if (thisMonth < monthcal) {
                age = age - 1;
        }

          if (thisMonth == monthcal && thisDay < daycal) {
                age = age - 1;
        }
       out.print("<h2>"+"Your age is:"+age+"</h2>");    
%>
</body>
</html>