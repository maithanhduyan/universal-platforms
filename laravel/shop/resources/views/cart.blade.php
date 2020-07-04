@extends('layouts.app')

@section('title', 'Have Fun Shopping')
@push('page-styles')
<style></style>
@endpush

@section('content')
<br>
<br>
<div class="row">
    <div class="col-lg-9 mb-3">
        <div class="card" data-aos="zoom-in">
            <div class="card-header">
                <h6>Giỏ Hàng</h6>
            </div>
            <div class="card-body">
                <table>
                    <thead>
                        <th></th>
                        <th>Sản Phẩm</th>
                        <th>Số Lượng</th>
                        <th>Tạm Tính</th>
                    </thead>
                    <tbody>
                        <tr></tr>
                        <tr></tr>
                        <tr></tr>
                    </tbody>
                    <tfoot>
                        <th></th>
                        <th></th>
                        <th></th>
                    </tfoot>
                </table>

            </div>
            <div class="card-footer"></div>
        </div>

    </div>
    <!-- /.col-lg-9 -->
    <div class="col-lg-3 mb-3">
        <div class="card" data-aos="fade-left">
            <div class="card-header">
                <h6>Thông tin đơn hàng</h6>
            </div>
            <div class="card-body">
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>
                <br>Phí Giao Hàng:
                <br>Tổng Cộng:
                <br>
            </div>
            <div class="card-footer">
                <a>Hình Thức Thanh Toán</a>
            </div>
        </div>
    </div>
    <!-- /.col-lg-3 -->
</div>
<!-- /.row -->
<hr>
@endsection

@push('page-scripts')
<!-- Custom this page scripts -->
<script></script>
@endpush