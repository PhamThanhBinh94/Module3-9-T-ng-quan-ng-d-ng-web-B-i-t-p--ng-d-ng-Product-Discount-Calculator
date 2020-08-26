<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 8/26/2020
  Time: 2:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Bài tập: Ứng dụng Product Discount Calculator</title>
  </head>
  <body>
  <h2>Calculator</h2>
  <form action="/index" method="post">
    <label>List Price</label><br>
    <input type="text" name="listPrice" placeholder="LISTPRICE" ><br>
    <label>Discount Percent</label><br>
    <input type="text" name="DiscountPercent" placeholder="DISCOUNTPERCENT"><br>
    <input type="submit" id="submit" value="Calculate Discount">
  </form>
  </body>
</html>
