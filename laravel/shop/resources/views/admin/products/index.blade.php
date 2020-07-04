@extends('admin.layouts.app')

@section('title')
{{__('admin.product')}}
@endsection

@push('admin-page-styles')
<link href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css" rel="stylesheet" crossorigin="anonymous" />
<style></style>
@endpush

@section('admin-content')
<main>
    <div class="container-fluid">
        <h5 class="mt-4">{{__('admin.product')}}</h5>

        <div class="row">

        </div>
        <div class="card mb-4" data-aos="zoom-in">
            <div class="card-header"><i class="fas fa-table mr-1"></i>{{__('admin.list')}} </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>{{__('Tên')}}</th>
                                <th>{{__('Mã')}}</th>
                                <th>{{__('Giá Vốn')}}</th>
                                <th>{{__('Giá Bán')}}</th>
                                <th>{{__('Tồn Kho')}}</th>
                            </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>{{__('Tên')}}</th>
                                <th>{{__('Mã')}}</th>
                                <th>{{__('Giá Vốn')}}</th>
                                <th>{{__('Giá Bán')}}</th>
                                <th>{{__('Tồn Kho')}}</th>
                            </tr>
                        </tfoot>
                    </table>
                </div>
            </div>
            <div class="card-footer"></div>
        </div>
    </div>
</main>
@endsection

@push('admin-page-scripts')
<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js" crossorigin="anonymous"></script>
<script>
    // Call the dataTables jQuery plugin
    $(document).ready(function() {
        var t = $('#dataTable').DataTable({
            "processing": true,
            "serverSide": true,
            "ajax": {
                "url": "{{route('api.admin.product')}}",
                "type": "POST",
                "data": function(d) {
                    var table = $('#dataTable').DataTable()
                    d.page = (table != undefined) ? table.page.info().page : 0
                }
            },
            "columns": [{
                    "data": "name"
                },
                {
                    "data": "code"
                },
                {
                    "data": "cost_price"
                },
                {
                    "data": "sale_price"
                },
                {
                    "data": "in_stock"
                },
            ],
            "pagingType": "full_numbers",
            "language": {
                processing: "loading..."
            },

        });
    });
</script>
@endpush