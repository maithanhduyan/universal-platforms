@extends('layouts.app')

@section('title', 'Have Fun Shopping')
@push('page-styles')
<style></style>
@endpush

@section('content')
<div class="row">
    <!-- Sidebar -->
    <div class="col-lg-3" data-aos="fade-right">
        @include('layouts.sidebar')
    </div><!-- /.col-lg-3 -->

    <!-- Carosel on content header -->
    <div class="col-lg-9">
        @include('layouts.carosel')
    </div><!-- /.col-lg-9 -->
</div>
<br>
<div class="row">
    <div class="col-lg">

        <!-- Show Product  -->
        <div class="row">
            @if(!empty($product))
            @foreach($product as $item)
            <div class="col-lg-3 col-md-4 mb-3" data-aos="zoom-in">
                <div class="card h-100">
                    <a href="#"><img class="card-img-top" src="{{$item->image ?? 'http://placehold.it/700x600'}}" alt=""></a>
                    <div class="card-body">
                        <h5 class="card-title">
                            <a href="#">{{$item->name}}</a>
                        </h5>

                        <h6 class="currency">{{$item->sale_price}}</h6>
                        <p class="card-text">{{$item->description ?? ''}}</p>
                    </div>
                    <div class="card-footer">
                        <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
                    </div>
                </div>
            </div>

            @endforeach
            @endif

        </div>
        <!-- /.row -->

    </div>
    <!-- /.col-lg-9 -->
</div>

@endsection

@section('newsletter')
@include('layouts.footer-newsletter')
@endsection

@push('page-scripts')
<!-- Custom this page scripts -->
<script>
    $(document).ready(function() {
        var bf_currency = $('.currency');
        for (var i = 0; i < bf_currency.length; i++) {
            bf_currency[i].innerHTML = formatter.format(bf_currency[i].innerHTML)
            // console.log(bf_currency[i].innerHTML)
        }
    });
</script>
@endpush