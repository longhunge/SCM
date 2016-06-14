<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!-- EL表达式支持 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath %>">
    
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<title>供应链后台管理系统</title>
	
    <!-- Bootstrap Core CSS -->
    <link href="<%=basePath %>bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Timeline CSS -->
    <link href="<%=basePath %>dist/css/timeline.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="<%=basePath %>dist/css/sb-admin-2.css" rel="stylesheet">
	
	 <!-- DataTables CSS -->
    <link href="<%=basePath %>bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="<%=basePath %>bower_components/datatables-responsive/css/dataTables.responsive.css" rel="stylesheet">
    <!-- Morris Charts CSS -->
    <link href="<%=basePath %>bower_components/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=basePath %>bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
  </head>
  
  
<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-default navbar-static-top" role="navigation" style="margin-bottom: 0">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="<%=basePath %>table.html">后台管理系统</a>
            </div>
            <!-- /.navbar-header -->
            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="<%=basePath %>#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="<%=basePath %>#">
                                <div>
                                    <strong>用户1</strong>
                                    <span class="pull-right text-muted">
                                        <em>时间</em>
                                    </span>
                                </div>
                                <div>摘要</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="<%=basePath %>#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="<%=basePath %>#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="<%=basePath %>#">
                                <strong>查看所有信息</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>

                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="<%=basePath %>#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="<%=basePath %>#"><i class="fa fa-user fa-fw"></i> 用户信息</a>
                        </li>
                        <li><a href="<%=basePath %>#"><i class="fa fa-gear fa-fw"></i> 设置</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="<%=basePath %>login.html"><i class="fa fa-sign-out fa-fw"></i> 退出</a>
                        </li>
                    </ul>
                    <!-- /.dropdown-user -->
                </li>
                <!-- /.dropdown -->
            </ul>
            <!-- /.navbar-top-links -->

            <div class="navbar-default sidebar" role="navigation">
                <div class="sidebar-nav navbar-collapse">
                    <ul class="nav" id="side-menu">
                          <li>
                            <a href="<%=basePath %>back/user_listui.action"><i class="fa fa-dashboard fa-fw"></i>主页</a>
                        </li>
						<li>
                            <a href="<%=basePath %>product/product_plistui.action"><i class="fa fa-pencil fa-fw"></i> 商品管理</a>
                        </li>
                        <li>
                            <a href="<%=basePath %>brand/brand_blistui.action"><i class="fa fa-bar-chart-o fa-fw"></i>品牌管理</span></a>
                        </li>
						<li>
                            <a href="<%=basePath %>logitics/logitics_listui.action"><i class="fa fa-truck fa-fw"></i> 物流公司管理</a>
                        </li>
						<li>
                            <a href="<%=basePath %>type/type_tlistui.action"><i class="fa fa-android fa-fw"></i>商品类别管理</a>
                        </li>
                        <li>
                            <a href="<%=basePath %>order/order_olistui.action"><i class="fa fa-table fa-fw"></i> -订单管理</a>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>
		
		<!-------------------#######strart#########------------------------>
        <div id="page-wrapper">
		<!-------------------ENd------------------->
        <div class="row">        
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            	商品类别管理
                        </div>
						<form name="form1" action="" method="post" enctype="multipart/form-data">
						<div class="panel-body col-lg-12">
						<div class="row show-grid from-group">
						<div class="input-group  col-lg-6">
						<table cellspacing="4px">
						<tr>
                        	<td>   
                                 <a href="<%=basePath %>type/type_taddui.action"> <button type="button" class="btn btn-inline btn-default">增加</button></a>
                            </td>
                            </tr>
                            </table>
							</div>
						</div>
						<hr/>
						</div>
						
                        <div class="panel-body">
                            <div class="dataTable_wrapper">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>类别名称</th>							
                                            <th>操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="productType" items="${tlist}" varStatus="rowStatus">   
                                        <tr class="gradeC">
                                            <td><c:out value="${productType.tname}"/></td>
											
                                            <td class="center"><a href="<%=basePath %>type/type_tdelete.action?ttype.tid=${productType.tid}">删除</a>||<a href="<%=basePath %>type/type_teditui.action?ttype.tid=${productType.tid}">编辑</a></td>
                                        </tr>  
                                      </c:forEach>                
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                       	 </form>
                    </div>
                    
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>

        </div>
	</div>


    <!-- jQuery -->
    <script src="<%=basePath %>bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%=basePath %>bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- DataTables JavaScript -->
    <!-- Metis Menu Plugin JavaScript -->
    <script src="<%=basePath %>bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="<%=basePath %>bower_components/jquery.dataTables.min.js"></script>
    <script src="<%=basePath %>bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>
 
    
    
    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
                responsive: true
        });
    });
    </script>
</body>
</html>
