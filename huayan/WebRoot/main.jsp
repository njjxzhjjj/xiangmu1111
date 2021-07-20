<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body style="background-color: pink;">
    <form action="/huayan/liuyan/addAll" method="post">
  		Title:<input type="text" name="timu"><br>
  		Author:<input type="text" name="zuozhe"><br>
  		Content:<textarea  type="text" cols="15" rows="15" name="content"></textarea><br>
  		<input type="submit" value="submit">
  		<input type="reset" value="cancel">
  		</form>
  		<hr> 
    <h3>共15条留言，共3页，第1页</h3>
    <a href="">上一页</a>
     <a href="">下一页</a>
     

	
    <table id="tb" width="800px" border="1px" cellpadding="0px" cellspacing="0px">
    <tr>
    	<td align="center">几楼</td>
    	<td align="center">作者：小芳</td>
    	<td align="center">IP：已记录</td>
    	<td align="center" >时间：2001-12-09 13:07:13</td>
    </tr>
    	<tr>
   		<td align="center" rowspan="2">标题：</td> 
   		</tr>
   		<tr>
        <td align="center">内容：</td>
        </tr>
    
	<c:forEach items="${sessionScope.liuyans}" var="liuyans" >
        <tr>
            <td align="center">${liuyans.timu}</td>
            <td align="center">${liuyans.content}</td>
            <td align="center">IP：已记录</td>
        	<td align="center" >时间：2021-07-19 20:37:40</td>
          <%--  <td align="center"><fmt:formatDate value="${ll.time}" type="both" pattern="yyyy-MM-dd HH:mm:ss"/></td> --%> 
        
        </tr>
        
    </c:forEach>
    
	</table>
    
  </body>
</html>
