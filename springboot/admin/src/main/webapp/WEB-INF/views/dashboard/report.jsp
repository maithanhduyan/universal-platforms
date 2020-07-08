<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@include file="/WEB-INF/views/layouts/_header.jsp"%>
<!-- DataTables -->
<link rel="stylesheet" href="/adminlte/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet" href="/adminlte/plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
<title>Report</title>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="/WEB-INF/views/layouts/_navbar.jsp"%>

		<!-- Main Sidebar Container -->
		<%@include file="/WEB-INF/views/layouts/_sidebar.jsp"%>

		<!-- Main Content -->
		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<div class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1 class="m-0 text-dark">Report</h1>
						</div>
						<!-- /.col -->
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
								<li class="breadcrumb-item active">Report</li>
							</ol>
						</div>
						<!-- /.col -->
					</div>
					<!-- /.row -->
				</div>
				<!-- /.container-fluid -->
			</div>
			<!-- /.content-header -->

			<!-- Main content -->
			<section class="content">
				<div class="container-fluid">
					<!-- Main row -->
					<div class="row">
						<div class="col-12">
							<div class="card">
								<div class="card-header">
									<h3 class="card-title">Report</h3>
								</div>
								<!-- /.card-header -->
								<div class="card-body">
									
								</div>
								<!-- /.card-body -->
							</div>
							<!-- /.card -->
						</div>
					</div>
					<!-- /.row (main row) -->
				</div>
				<!-- /.container-fluid -->
			</section>
			<!-- /.content -->
		</div>
		<!-- /.content-wrapper -->

		<!-- Footer -->
		<%@include file="/WEB-INF/views/layouts/_footer.jsp"%>

		<!-- Control Sidebar -->
		<aside class="control-sidebar control-sidebar-dark">
			<!-- Control sidebar content goes here -->
		</aside>

	</div>

	<!-- Back to Top button -->
	<a href="#" class="back-to-top"><i class="fas fa-angle-up"></i></a>
	<%@include file="/WEB-INF/views/layouts/_js.jsp"%>
	<!-- DataTables -->
	<script src="/adminlte/plugins/datatables/jquery.dataTables.min.js"></script>
	<script src="/adminlte/plugins/datatables-bs4/js/dataTables.bootstrap4.min.js"></script>
	<script src="/adminlte/plugins/datatables-responsive/js/dataTables.responsive.min.js"></script>
	<script src="/adminlte/plugins/datatables-responsive/js/responsive.bootstrap4.min.js"></script>
	<!-- page script -->
	<script>
     
    </script>
</body>
</html>