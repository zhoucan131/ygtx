
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="r" uri="http://shiro.apache.org/tags"%>
<html>
<head>
    <title>Title</title>
    
    <%@include file="/common/head.jsp" %>
</head>
<body>

spring mvc
<br>
${book}
<br>
${name}
<img src="<%=request.getContextPath()%>/images/1.jpg">
<br>


<div>


<h1><t:message code="title"></t:message></h1>

<a href="${ctx}/book/toAdd"><t:message code="add.lable"></t:message></a>
<a href="${ctx}/book/listBook"><t:message code="list.lable"></t:message></a>
</div>


<div>
    <r:hasRole name="管理员">
    <a href="${ctx}/book/listAll">查询全部</a><br>
    </r:hasRole>
    <r:hasPermission name="bookmanager:book:edit">
    <a href="${ctx}/test/test1">以为跳转页面</a><br>
    </r:hasPermission>
    <a href="${ctx}/test/test2">使用RestController，再次以为跳转页面</a>
    <a href="${ctx}/book/listSingleBook?bookId=2">返回单个对象</a>
</div>

<div>
    <a href="${ctx}/SysUser/logout">退出系统</a>
</div>


<div>
    <a href="${ctx}/change?locale=zh">中文</a>
    <a href="${ctx}/change?locale=en">英文</a>
</div>

</body>
</html>
