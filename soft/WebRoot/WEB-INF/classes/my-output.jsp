<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="javax.management.modelmbean.ModelMBeanInfoSupport" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<title>欢迎进入发布中心</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<style media="all" type="text/css">@import "css/all.css";</style>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!-- Tell the browser to be responsive to screen width -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<!-- Favicon icon -->
	<link rel="icon" type="image/png" sizes="16x16" href="assets/images/favicon.png">
	<title>Material Pro Admin Template - The Most Complete & Trusted Bootstrap 4 Admin Template</title>
	<!-- Bootstrap Core CSS -->
	<link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet">
	<!-- Custom CSS -->
	<link href="css/backstage.css" rel="stylesheet">
	<!-- You can change the theme colors from here -->
	<link href="css/colors/blue.css" id="theme" rel="stylesheet">
</head>
<body class="fix" class="fix-header fix-sidebar card-no-border">
	<div class="preloader">
		<svg class="circular" viewBox="25 25 50 50">
			<circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="2" stroke-miterlimit="10"></circle> </svg>
	</div>
	<!-- ============================================================== -->
	<!-- Main wrapper - style you can find in pages.scss -->
	<!-- ============================================================== -->
	<div id="main-wrapper">
		<!-- ============================================================== -->
		<!-- Topbar header - style you can find in pages.scss -->
		<!-- ============================================================== -->
		<header class="topbar">
			<nav class="navbar top-navbar navbar-toggleable-sm navbar-light">
				<!-- ============================================================== -->
				<div class="navbar-collapse">
					<!-- ============================================================== -->
					<!-- toggle and nav items -->
					<!-- ============================================================== -->
					<!-- ============================================================== -->
					<!-- User profile and search -->
					<!-- ============================================================== -->
					<ul class="navbar-nav my-lg-0">
						<!-- ============================================================== -->
						<!-- Profile -->
						<!-- ============================================================== -->
						<li class="nav-item dropdown">
							<a class="nav-link dropdown-toggle text-muted waves-effect waves-dark" href="" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
								我的发布
							</a>
						</li>
					</ul>
				</div>
			</nav>
		</header>
		<!-- ============================================================== -->
		<!-- End Topbar header -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->
		<aside class="left-sidebar">
			<!-- Sidebar scroll-->
			<div class="scroll-sidebar">
				<!-- Sidebar navigation-->
				<nav class="sidebar-nav">
					<ul id="sidebarnav">
						<li> <a class="waves-effect waves-dark" href="#" aria-expanded="false"><i class="mdi mdi-gauge"></i><span class="hide-menu">我的发布</span></a>
						</li>
						<li> <a class="waves-effect waves-dark" href="putout.jsp" aria-expanded="false"><i class="mdi mdi-account-check"></i><span class="hide-menu">活动发布</span></a>
						</li>
						<li> <a class="waves-effect waves-dark" href="index2.jsp" aria-expanded="false"><i class="mdi mdi-table"></i><span class="hide-menu">回到首页</span></a>
						</li>
					</ul>
				</nav>
				<!-- End Sidebar navigation -->
			</div>
			<!-- End Sidebar scroll-->
			<!-- Bottom points-->
			<div class="sidebar-footer">
				<!-- item--><a href="" class="link" data-toggle="tooltip" title="Settings"><i class="ti-settings"></i></a>
				<!-- item--><a href="" class="link" data-toggle="tooltip" title="Email"><i class="mdi mdi-gmail"></i></a>
				<!-- item--><a href="" class="link" data-toggle="tooltip" title="Logout"><i class="mdi mdi-power"></i></a> </div>
			<!-- End Bottom points-->
		</aside>
		<!-- ============================================================== -->
		<!-- End Left Sidebar - style you can find in sidebar.scss  -->
		<!-- ============================================================== -->
		<!-- ============================================================== -->
		<!-- Page wrapper  -->
		<!-- ============================================================== -->
		<div class="page-wrapper">
			<!-- ============================================================== -->
			<!-- Container fluid  -->
			<!-- ============================================================== -->
			<div class="container-fluid">
				<!-- Start Page Content -->
				<!-- ============================================================== -->
				<div class="row">
					<!-- column -->
					<div class="col-lg-12">
						<div class="card">
							<div class="card-block">
								<h4 class="card-title">我的发布</h4>
								<div class="table-responsive">
									<table class="table">
										<thead>
										<tr>
											<th>活动名称</th>
											<th>活动时间</th>
											<th>活动地点</th>
											<th>状态</th>
										</tr>
										</thead>
										<tbody>
										<c:forEach var="list" items="${mylist}">
											<tr>
											<tr class="bg">
												<td class="first style1"> ${list.infoTitle} </td>
												<td>${list.infoDate1}</td>
												<td>${list.infoPlace}</td>
												<c:if test="${list.infoState eq '0'}">
													<td class="last">
														未审核
													</td>
												</c:if>
												<c:if test="${list.infoState eq '1'}">
													<td class="last">
														已审核
													</td>
												</c:if>
											</tr>
										</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- ============================================================== -->
				<!-- End PAge Content -->
				<!-- ============================================================== -->
			</div>
			<!-- ============================================================== -->
			<!-- End Container fluid  -->
			<!-- ============================================================== -->
			<!-- ============================================================== -->
			<!-- ============================================================== -->
		</div>
		<!-- ============================================================== -->
		<!-- End Page wrapper  -->
		<!-- ============================================================== -->
	</div>
	<script src="assets/plugins/jquery/jquery.min.js"></script>
	<!-- Bootstrap tether Core JavaScript -->
	<script src="assets/plugins/bootstrap/js/tether.min.js"></script>
	<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
	<!-- slimscrollbar scrollbar JavaScript -->
	<script src="js/jquery.slimscroll.js"></script>
	<!--Wave Effects -->
	<script src="js/waves.js"></script>
	<!--Menu sidebar -->
	<script src="js/sidebarmenu.js"></script>
	<!--stickey kit -->
	<script src="assets/plugins/sticky-kit-master/dist/sticky-kit.min.js"></script>
	<!--Custom JavaScript -->
	<script src="js/custom.min.js"></script>
</body>
</html>
