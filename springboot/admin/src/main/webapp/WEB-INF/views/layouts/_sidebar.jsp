<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- Main Sidebar Container -->
<aside class="main-sidebar sidebar-dark-primary elevation-4">
	<!-- Brand Logo -->
	<a href="index3.html" class="brand-link"> <img src="/adminlte/dist/img/AdminLTELogo.png" alt="AdminLTE Logo"
			class="brand-image img-circle elevation-3" style="opacity: .8"> <span
			class="brand-text font-weight-light">Quản Lý SHOP</span>
	</a>

	<!-- Sidebar -->
	<div class="sidebar">
		<!-- Sidebar user panel (optional) -->
		<div class="user-panel mt-3 pb-3 mb-3 d-flex">
			<div class="image">
				<img src="/adminlte/dist/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
			</div>
			<div class="info">
				<a href="#" class="d-block">Mai Thành Duy An</a>
			</div>
		</div>

		<!-- Sidebar Menu -->
		<nav class="mt-2">
			<ul class="nav nav-pills nav-sidebar flex-column nav-flat nav-child-indent text-sm" data-widget="treeview"
				role="menu" data-accordion="false">
				<!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
				<li class="nav-item has-treeview"><a href="#" class="nav-link"> <i
							class="nav-icon fas fa-tachometer-alt"></i>
						<p>
							Dashboard <i class="right fas fa-angle-left"></i>
						</p>
					</a>

					<ul class="nav nav-treeview">
						<li class="nav-item"><a href="/dashboard/index.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Insight</p>
							</a></li>
						<li class="nav-item"><a href="/dashboard/todo.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Todo</p>
							</a></li>
						<li class="nav-item"><a href="/dashboard/report.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Report</p>
							</a></li>
					</ul>
				</li>
				<li class="nav-item has-treeview"><a href="#" class="nav-link"><i class="nav-icon fas fa-cubes"></i>
						<p>
							Mặt Hàng <i class="right fas fa-angle-left"></i>
						</p>
					</a>
					<ul class="nav nav-treeview">
						<li class="nav-item"><a href="/product/index.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Danh Mục Mặt Hàng</p>
							</a></li>
						<li class="nav-item"><a href="/product/category.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Nhóm Hàng</p>
							</a></li>
						<li class="nav-item"><a href="/product/add.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Thêm Mới</p>
							</a></li>
					</ul>
				</li>
				<li class="nav-item has-treeview"><a href="#" class="nav-link"> <i class="nav-icon fas fa-users"></i>
						<p>
							Khách Hàng <i class="fas fa-angle-left right"></i> <span
								class="badge badge-info right">6</span>
						</p>
					</a>
					<ul class="nav nav-treeview">
						<li class="nav-item"><a href="/customer/index.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Danh sách</p>
							</a></li>
						<li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Nhóm Khách Hàng</p>
							</a></li>
						<li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Khách Hàng Thân Thiết</p>
							</a></li>
						<li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Report</p>
							</a></li>
					</ul>
				</li>
				<li class="nav-item has-treeview"><a href="#" class="nav-link"> <i
							class="nav-icon fas fa-chart-pie"></i>
						<p>
							Bán Hàng<i class="right fas fa-angle-left"></i>
						</p>
					</a>
					<ul class="nav nav-treeview">
						<li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Hóa Đơn Bán Hàng</p>
							</a></li>
						<li class="nav-item"><a href="pages/charts/inline.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Quản Lý Bán Hàng</p>
							</a></li>
						<li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Thống Kê Doanh Thu</p>
							</a></li>
						<li class="nav-item"><a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Thống Kê Mặt Hàng Bán</p>
							</a></li>
					</ul>
				</li>
				<li class="nav-item has-treeview"><a href="#" class="nav-link"> <i class="nav-icon fas fa-chalkboard-teacher"></i>
						<p>
							Nhân Sự <i class="fas fa-angle-left right"></i>
						</p>
					</a>
					<ul class="nav nav-treeview">
						<li class="nav-item"><a href="/nhanvien/danhmuc.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Danh Mục Nhân Viên</p>
							</a></li>
						<li class="nav-item"><a href="/nhanvien/calamviec.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Danh Mục Ca Làm Việc</p>
							</a></li>
						<li class="nav-item"><a href="/nhanvien/tamungluong.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Tạm Ứng Lương</p>
							</a></li>
						<li class="nav-item"><a href="/nhanvien/thuongphat.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Thưởng Phạt</p>
							</a></li>
						<li class="nav-item"><a href="/nhanvien/chamcong.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Chấm Công</p>
							</a></li>
						<li class="nav-item"><a href="/nhanvien/tinhluong.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Tính Lương</p>
							</a></li>
					</ul>
				</li>
				<li class="nav-item has-treeview"><a href="#" class="nav-link"> <i class="nav-icon fas fa-store-alt"></i>
						<p>
							Kho Hàng <i class="fas fa-angle-left right"></i>
						</p>
					</a>
					<ul class="nav nav-treeview">
						<li class="nav-item"><a href="pages/forms/general.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Danh Mục Kho Hàng</p>
							</a></li>
						<li class="nav-item"><a href="pages/forms/advanced.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Danh Mục Nhà Cung Cấp</p>
							</a></li>
						<li class="nav-item"><a href="pages/forms/editors.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Nhập Hàng Vào Kho</p>
							</a></li>
						<li class="nav-item"><a href="pages/forms/validation.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Xuất Hàng</p>
							</a></li>
						<li class="nav-item"><a href="pages/forms/validation.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Chuyển Kho</p>
							</a></li>
						<li class="nav-item"><a href="pages/forms/validation.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Kiểm Kê</p>
							</a></li>
						<li class="nav-item"><a href="pages/forms/validation.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Tồn Kho</p>
							</a></li>
						<li class="nav-item"><a href="pages/forms/validation.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Tồn Nhiều Kho</p>
							</a></li>
					</ul>
				</li>
				<li class="nav-header">CÁ NHÂN</li>
				<li class="nav-item"><a href="pages/calendar.html" class="nav-link"> <i
							class="nav-icon far fa-calendar-alt"></i>
						<p>
							Calendar <span class="badge badge-info right">2</span>
						</p>
					</a></li>
				<li class="nav-item"><a href="pages/gallery.html" class="nav-link"> <i
							class="nav-icon far fa-image"></i>
						<p>Gallery</p>
					</a></li>
				<li class="nav-item has-treeview"><a href="#" class="nav-link"> <i class="nav-icon far fa-envelope"></i>
						<p>
							Mailbox  <i class="fas fa-angle-left right"></i>
							<span
								class="badge badge-info right">6</span>
						</p>
					</a>
					<ul class="nav nav-treeview">
						<li class="nav-item"><a href="pages/mailbox/mailbox.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Inbox</p>
							</a></li>
						<li class="nav-item"><a href="pages/mailbox/compose.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Compose</p>
							</a></li>
						<li class="nav-item"><a href="pages/mailbox/read-mail.html" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>Read</p>
							</a></li>
					</ul>
				</li>
				
				<li class="nav-header">TRỢ GIÚP</li>
				<li class="nav-item"><a href="https://adminlte.io/docs/3.0" class="nav-link"> <i
							class="nav-icon fas fa-file"></i>
						<p>Documentation</p>
					</a></li>
				<li class="nav-header">HỆ THỐNG</li>
				<li class="nav-item has-treeview"><a href="#" class="nav-link"> <i class="nav-icon fas fa-circle"></i>
						<p>
							Cấu Hình <i class="right fas fa-angle-left"></i>
						</p>
					</a>
					<ul class="nav nav-treeview">
						<li class="nav-item">
							<a href="#" class="nav-link"> <i class="far fa-circle nav-icon"></i>
								<p>Chỉ Tiêu Doanh Thu</p>
							</a>
						</li>
						
						<li class="nav-item has-treeview"><a href="#" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>
									Phân Quyền<i class="right fas fa-angle-left"></i>
								</p>
							</a>
							<ul class="nav nav-treeview">
								<li class="nav-item"><a href="#" class="nav-link"> <i
											class="far fa-dot-circle nav-icon"></i>
										<p>Nhóm</p>
									</a></li>
								<li class="nav-item"><a href="#" class="nav-link"> <i
											class="far fa-dot-circle nav-icon"></i>
										<p>Thêm Quyền</p>
									</a></li>
								<li class="nav-item"><a href="#" class="nav-link"> <i
											class="far fa-dot-circle nav-icon"></i>
										<p>Lưu Vết</p>
									</a></li>
							</ul>
						</li>
						<li class="nav-item has-treeview"><a href="#" class="nav-link"> <i
									class="far fa-circle nav-icon"></i>
								<p>
									Dữ Liệu<i class="right fas fa-angle-left"></i>
								</p>
							</a>
							<ul class="nav nav-treeview">
								<li class="nav-item"><a href="#" class="nav-link"> <i
											class="far fa-dot-circle nav-icon"></i>
										<p>Sao Lưu</p>
									</a></li>
								<li class="nav-item"><a href="#" class="nav-link"> <i
											class="far fa-dot-circle nav-icon"></i>
										<p>Xuất File</p>
									</a></li>
								<li class="nav-item"><a href="#" class="nav-link"> <i
											class="far fa-dot-circle nav-icon"></i>
										<p>Máy Chủ</p>
									</a></li>
							</ul>
						</li>
					</ul>
				</li>
				<li class="nav-header"></li>
				<li class="nav-item"><a href="#" class="nav-link"> <i class="nav-icon far fa-circle text-danger"></i>
						<p class="text">Important</p>
					</a>
				</li>
				<li class="nav-item"><a href="/lockscreen.html" class="nav-link"> <i class="nav-icon far fa-circle text-warning"></i>
						<p>Khóa Màn Hình</p>
					</a></li>
				<li class="nav-item"><a href="#" class="nav-link"
						onclick="event.preventDefault();document.getElementById('logout-form').submit();"> <i
							class="nav-icon far fa-circle text-info"></i>
						<p>Đăng Xuất</p>
					</a>
					<form id="logout-form" action="/logout" method="POST"></form>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">Phiên bản 1.0</a>
				</li>
			</ul>
		</nav>
		<!-- /.sidebar-menu -->
	</div>
	<!-- /.sidebar -->
</aside>