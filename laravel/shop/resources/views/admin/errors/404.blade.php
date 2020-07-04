@extends('admin.errors.layouts.app')
@section('title','404')

@section('admin-errors-content')
<main>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-6">
                <div class="text-center mt-4">
                    <img class="mb-4 img-error" src="{{asset('admin/img/error-404-monochrome.svg')}}" />
                    <p class="lead">This requested URL was not found on this server.</p>
                    <a href="{{route('admin.dashboard')}}"><i class="fas fa-arrow-left mr-1"></i>Return to Dashboard</a>
                </div>
            </div>
        </div>
    </div>
</main>
@endsection