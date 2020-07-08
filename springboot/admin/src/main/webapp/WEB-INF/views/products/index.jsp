<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@include file="/WEB-INF/views/layouts/_header.jsp"%>
<!-- DataTables -->
<link rel="stylesheet" href="/adminlte/plugins/datatables-bs4/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet" href="/adminlte/plugins/datatables-responsive/css/responsive.bootstrap4.min.css">
<title>Mặt Hàng</title>
</head>
<body class="hold-transition sidebar-mini layout-fixed">
	<div class="wrapper">
		<!-- Navbar -->
		<%@include file="/WEB-INF/views/layouts/_navbar.jsp"%>
		<!-- /.navbar -->
		
		<!-- Main Sidebar Container -->
		<%@include file="/WEB-INF/views/layouts/_sidebar.jsp"%>

		<!-- Content Wrapper. Contains page content -->
		<div class="content-wrapper">
			<!-- Content Header (Page header) -->
			<div class="content-header">
				<div class="container-fluid">
					<div class="row mb-2">
						<div class="col-sm-6">
							<h1 class="m-0 text-dark">Mặt Hàng</h1>
						</div>
						<!-- /.col -->
						<div class="col-sm-6">
							<ol class="breadcrumb float-sm-right">
								<li class="breadcrumb-item"><a href="#">Home</a></li>
								<li class="breadcrumb-item active">Mặt Hàng</li>
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
									<h3 class="card-title">Danh mục Mặt Hàng</h3>
								</div>
								<!-- /.card-header -->
								<div class="card-body">
									<table id="datatable" class="table table-bordered table-hover table-striped">
										<thead>
											<tr>
												<th></th>
												<th>Tên Mặt Hàng</th>
												<th>Mã Vạch</th>
												<th>Giá Bán</th>
												<th>Nhóm</th>
												<th>Tồn</th>
												<th></th>
											</tr>
										</thead>
										<tbody>
										</tbody>
										<tfoot>
											<tr>
												<th></th>
												<th>Tên Mặt Hàng</th>
												<th>Mã Vạch</th>
												<th>Giá Bán</th>
												<th>Nhóm</th>
												<th>Tồn</th>
												<th></th>
											</tr>
										</tfoot>
									</table>
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
	$(document).ready(function(){
		var t = $('#datatable').DataTable({
				"processing": true,
		        "serverSide": true,
		        "ajax": {
		            "url": "/api/product/findAll",
		            "type": "POST",
		            "data":function(d) {
	                    var table = $('#datatable').DataTable()
	                    d.page = (table != undefined)?table.page.info().page:0
	                }
		        },
		        "columns": [
		            { "": "" },
	                { "data": "name" },
	                { "data": "code" },
	                { "data": "salePrice" },
	                { "data": "category.name" },
	                { "data": "inStock" },
	                { "": "" }
	            ],
	            "pagingType": "full_numbers",
	            "language": {
		            processing: "Loading..."
		         },
		         "columnDefs": [
		            	{"data": null,  "targets": 0, "searchable": false, "orderable": false},
		            	{ "data": null, "targets": -1, "defaultContent":"", "searchable": false, "orderable": false},
		            ],
		         "order": [[ 1, 'asc' ]],
		         "autoWidth": false,
		         "responsive": true,
			});

			t.on( 'draw.dt', function () {
			    var PageInfo = $('#datatable').DataTable().page.info();
		         	t.column(0, { page: 'current' }).nodes().each( function (cell, i) {
		            cell.innerHTML = i + 1 + PageInfo.start;
		        } );
		    } );
		
		});
    </script>
</body>
</html>