<%-- 
    Document   : result
    Created on : Mar 8, 2016, 10:52:06 PM
    Author     : grsky
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align = "center">Beer Recommendations JSP</h1>
        <p>
            <% 
                List styles = (List)request.getAttribute("styles");
                Iterator it = styles.iterator();
                while (it.hasNext()){
                    out.println("<br>try: "+ it.next());
                }
            %>
            
        </p>
    </body>
</html>
