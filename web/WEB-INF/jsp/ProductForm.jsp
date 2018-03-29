<%--
  Created by IntelliJ IDEA.
  User: asouqi
  Date: 3/22/18
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <c:if test="${error!=null}">
        <div style="color: red">
        <h5>Error:</h5>
            <ul>
               <c:forEach items="${error}" var="e">
                   <li>${e}</li>
               </c:forEach>
            </ul>
        </div>
    </c:if>

    <form action="/add_product.action" method="post" style="width: 450px">
        <fieldset>
            <legend>Add a product</legend>
            <p>
            <label>Product Name:</label>
            <input type="text" name="txtProductName" tabindex="1"/>
            </p>
            <p>
                <label>Product Detail:</label>
                <input type="text" name="txtProductDetail" tabindex="2"/>
            </p>
            <p>
                <label>Product Price:</label>
                <input type="text" name="txtProductPrice" tabindex="3"/>
            </p>
            <p>
                <input type="reset" tabindex="4"/>
                <input type="submit" value="Add Product" tabindex="5"/>
            </p>
        </fieldset>
    </form>
</body>
</html>
