@extends('admin.errors.layouts.app')
@section('title','500')

@section('admin-errors-content')
<main>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-lg-6">
                <div class="text-center mt-4">
                    <h1 class="display-1">401</h1>
                    <p class="lead">Unauthorized</p>
                    <p>Access to this resource is denied.</p>
                    <a href="{{route('admin.dashboard')}}"><i class="fas fa-arrow-left mr-1"></i>Return to Dashboard</a>
                </div>
            </div>
        </div>
    </div>
</main>
@endsection