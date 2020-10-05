<%-- 
    Document   : viewnote
    Created on : Oct 4, 2020, 8:32:31 PM
    Author     : 562187
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper - View Notes</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        
        <p><b>Title:</b>${refreshedNote.title}</p>
        <p><b>Contents:</b>${refreshedNote.contents}</p>
        <br>
        <p></p>
        <br>
        <a href = "note?edit">Edit</a>
        
        
    </body>
</html>
