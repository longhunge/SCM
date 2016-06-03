<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ page isELIgnored="false" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<title>供应链后台管理系统</title>

    <!-- Bootstrap Core CSS -->
    <link href="<%=basePath %>bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="<%=basePath %>dist/css/sb-admin-2.css" rel="stylesheet">
    <!-- Custom Fonts -->
    <link href="<%=basePath %>bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
	<link rel="stylesheet" href="<%=basePath %>js/bootstrapDatepickr-1.0.0.css">
	<script src="<%=basePath %>js/jquery-1.7.2.min.js"></script>
	<script>
			$(document).ready(function() {
				$("#calendar").bootstrapDatepickr({date_format: "Y-d-m"});
			});
	</script>	
	
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
                <a class="navbar-brand" href="###############">后台管理系统</a>
            </div>
            <!-- /.navbar-header -->
            <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
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
                            <a href="#">
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
                            <a href="#">
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
                            <a class="text-center" href="#">
                                <strong>查看所有信息</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
                </li>

                <!-- /.dropdown -->
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-user fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#"><i class="fa fa-user fa-fw"></i> 用户信息</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> 设置</a>
                        </li>
                        <li class="divider"></li>
                        <li><a href="login.html"><i class="fa fa-sign-out fa-fw"></i> 退出</a>
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
                            <a href="table.html"><i class="fa fa-dashboard fa-fw"></i> -主页</a>
                        </li>
						<li>
                            <a href="table_product.html"><i class="fa fa-pencil fa-fw"></i> -商品管理</a>
                        </li>
                        <li>
                            <a href="table_user.html"><i class="fa fa-bar-chart-o fa-fw"></i> -用户管理</span></a>
                        </li>
						<li>
                            <a href="table_company.html"><i class="fa fa-truck fa-fw"></i> -物流公司管理</a>
                        </li>
						<li>
                            <a href="table_manager.html"><i class="fa fa-android fa-fw"></i> -管理员账户管理</a>
                        </li>
                        <li>
                            <a href="table_order"><i class="fa fa-table fa-fw"></i> -订单管理</a>
                        </li>
						<li>
                            <a href="table_pinglun"><i class="fa fa-linux fa-fw"></i> -评论管理</a>
						</li>
	
                    </ul>
                </div>
            </div>
        </nav>

		<!-------------------#######strart#########------------------------>
		<div id="page-wrapper">
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">添加物流公司</div>

						<div class="panel-body">
							<div class="row">
								<div class="col-lg-6">
									<form role="form" action="<%=basePath%>logitics/logitics_add.action" method="post" enctype="multipart/form-data">										
										<div class="form-group">
											<label>公司名称: </label> <input class="form-control" type="text"
												name="logitics.lname">
										</div>
										<button type="submit" class="btn btn-default">添加</button>
										<button type="reset" class="btn btn-default">取消</button>
									</form>
								</div>
							</div>
							<!-- /.row (nested) -->
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
		</div>
		<!-- /#page-wrapper -->
	</div>
	
	<!-- jQuery -->
	<script src="<%=basePath %>bower_components/jquery/dist/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<%=basePath %>bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=basePath %>bower_components/metisMenu/dist/metisMenu.min.js"></script>
	
	<!-- 日期选择 -->
	<script src="<%=basePath %>dist/bootstrapDatepickr-1.0.0.min.js"></script>
</body>

</html>
