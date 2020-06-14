<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp" %>
    <link rel="stylesheet" type="text/css" href="css/main.css">
</head>
<body>

书本新增
<f:form action="${ctx}/book/addBook" method="post" modelAttribute="book">
    书名：<f:input path="bookName"/><f:errors path="*" cssClass="body"/><br>
    价格：<f:input path="price"/><br>
    <input type="submit" value="确定">
</f:form>

<%--书本新增--%>
<%--<f:form action="${ctx}/book/addBook" method="post" modelAttribute="book">--%>
    <%--书名：<f:input path="bookName"/><f:errors path="bookName" cssClass="body"/><br>--%>
    <%--价格：<f:input path="price"/><f:errors path="price" cssClass="body"/><br>--%>
    <%--<input type="submit" value="确定">--%>
<%--</f:form>--%>

</body>
</html>
