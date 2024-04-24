<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<div>
    <form action="/display-discount" method="post">
        <input type="text" name="ProductDescription" placeholder="Mô tả của sản phẩm"> <br>
        <input type="text" name="ListPrice" placeholder="Giá niêm yết của sản phẩm"><br>
        <input type="text" name="DiscountPercent" placeholder="Tỷ lệ chiết khấu (phần trăm)"><br>
        <input type="submit" value="Calculate Discount">

<%--        <button type="submit">Calculate Discount</button>--%>
    </form>

</div>

</body>
</html>