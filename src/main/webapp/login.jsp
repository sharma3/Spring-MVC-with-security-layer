<%-- 
    Document   : login
    Created on : Apr 12, 2015, 10:37:29 AM
    Author     : Jay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Welcome To Curve MultiLevelMarketing </title>
    </head>
    <body>
        <h2>Login Here</h2>
        <form method="post" action="j_security_check">
            <fieldset>
                <div>
                    <label for="j_username">Username:</label>
                    <input type="text" id="j_username" name="j_username" />
                </div>
                <div>
                    <label for="j_password">Password:</label>
                    <input type="password" id="j_password" name="j_password" />
                </div>
                <input type="submit" value="Submit"/>
                <input type="reset" value="Reset"/>
            </fieldset>
        </form>
    </body>
</html>