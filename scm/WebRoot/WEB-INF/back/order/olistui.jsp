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
	<script type="text/javascript">

		function doImportExcel(){
	  		document.forms[0].action = "<%=basePath %>back/user_importExcel.action";
	  		document.forms[0].submit();
	  	}
		function doExportExcel(){
			document.forms[0].action = "<%=basePath %>back/user_exportExcel.action";
	  		document.forms[0].submit();
		}
		function doDeleteAll(){
      		document.forms[0].action = "<%=basePath %>product/product_deleteSelected.action";
      		document.forms[0].submit();
      	}
		
	   function funCheckAll(obj){  
	    var items = document.getElementsByTagName("input");  
	    for(var i=0;i<items.length;i++){  
	        if(items[i].type=="checkbox"&& items[i].name=="selectRaw")  
	            items[i].checked = obj.checked;  
	    	}  
		}		
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
                        <li><a href="<%=basePath %>#"><i class="fa fa-user fa-fw"></i>用户信息</a>
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
                            	订单管理
                        </div>
						<form name="form1" action="" method="post" enctype="multipart/form-data">
						<div class="panel-body col-lg-12">
						<div class="row show-grid from-group">
						<div class="input-group  col-lg-6">
						<table cellspacing="4px">
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
										<th><label class="checkbox-inline"><input type="checkbox" onclick="funCheckAll(this);">全选</label></th>
                                            <th>商品名</th>
											<th>姓名</th>
                                            <th>类别</th>
                                            <th>品牌</th>
                                            <th>数量</th>
											<th>状态</th>
											<th>操作</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="order" items="${olist}" varStatus="rowStatus">
                                    <c:forEach var="product" items="${plist}" varStatus="rowStatus">  
                                    <c:if test="${product.pid eq order.pid }">
                                        <tr class="gradeC">
										    <td><input class="checkbox" name ="selectRaw" value="${product.pid}"type="checkbox"></td>
                                            <td><c:out value="${product.pname}"/></td>
                                            <td>
                                   
                                            <c:forEach var="tuser" items="${ulist}" varStatus="rowStatus">
                                            	<c:if test="${order.uid eq tuser.u_id}" >
                                            		<c:out value="${tuser.u_name}"/>
                                            	</c:if>
                                            </c:forEach>
                                          
											</td>
											<td>
											<c:forEach var="ttype" items="${tlist}"
												varStatus="rowStatus">
												<c:if test="${ttype.tid eq product.tid}">													
														<c:out value="${ttype.tname}" />
												</c:if>
											</c:forEach>
											</td>
											<td>
											<c:forEach var="brand" items="${blist}"
												varStatus="rowStatus">
												<c:if test="${brand.bid eq product.bid}">													
														<c:out value="${brand.bname}" />
												</c:if>
											</c:forEach>
											</td>
											<td>
												<c:out value="${order.pnum}" />
											</td>  
											<td>
												<c:out value="${order.ostatus}" />
											</td>                                          
                                            <td class="center"><a href="<%=basePath %>order/order_delete.action?order.oid=${order.oid}">删除</a></td>
                                        </tr> 
                                        </c:if>  
                                      </c:forEach> 
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
