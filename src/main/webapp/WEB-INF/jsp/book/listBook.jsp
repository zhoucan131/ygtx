<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="/common/head.jsp" %>
</head>
<body>

<%--书本查询--%>
<%--${bookList}--%>
<%--${pageBean}--%>
<table border="1" width="99%">
    <tr>
        <td>编号</td>
        <td>名称</td>
        <td>文件</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${userFiles}" var="uf">
        <tr>
            <td>${uf.id}</td>
            <td>${uf.remark}</td>
            <td>${uf.score}</td>
            <td><img src="${uf.image}" width="100px" height="100px"></td>
            <td><a href="${ctx}/usersFile/toUpLoad?id=${uf.id}">上传图片</a></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
