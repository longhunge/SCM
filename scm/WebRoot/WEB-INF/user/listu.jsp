<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户地址管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	    <link href="<%=basePath %>bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    
  </head> 
<body>
    <div >
        <div>
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            	地址管理
                        </div>
						<form name="form1" action="" method="post" enctype="multipart/form-data">
						
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>收件人</th>							
                                            <th>地址</th>
											<th>手机号</th>
											<th>操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="address" items="${alist }">
                                          <tr class="gradeC">										    
                                            <td><c:out value="${address.uname }"></c:out></td>
                                            <td><c:out value="${address.uaddress }"></c:out></td>
                                            <td><c:out value="${address.uphone }"></c:out></td>      
                                             <td class="center"><a href="<%=basePath%>address/address_delete.action?address.aid=${address.aid}">删除</a>||<a href="<%=basePath%>address/address_editui.action?address.aid=${address.aid}">编辑</a></td>
                                        </tr>
                                      </c:forEach>
                                    </tbody>
                                </table>
                            </div>      
                        </div>
                    </div>
                </div>
            </div>
	</div>
</body>
</html>
