<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link rel="stylesheet" href="style.css" type="text/css">
  <title>Delete</title>
</head>
<body>
<div class="buttons">
  <div class="delete form">
    <form action="connect.jsp" method="POST">
      <h3>What item would you like to delete?</h3></label><br>
      <input type="text" name="deleteditemname" value=""><br>
      <input type="submit" value="Delete">
    </form>
  </div>
  <button type="button" onclick="window.location.href='index.jsp'">Homepage</button>
</div>

</body>
</html>
