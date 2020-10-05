<%-- 
    Document   : editnote
    Created on : Oct 4, 2020, 8:32:49 PM
    Author     : 562187
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Simple Note Keeper - Edit Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>Edit Note</h2>
        <form action ="note" method ="post">
            Title:<input type="text" name="title" value="${refreshedNote.title}">
            <br>
            Contents: 
            <textarea name ="contents" rows = "5">${refreshedNote.contents}</textarea>
            <br>
            <input type ="submit" value ="save">
        </form>
 
    </body>
</html>
