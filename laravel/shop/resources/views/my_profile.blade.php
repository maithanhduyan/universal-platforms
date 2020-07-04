@extends('layouts.app')

@section('title', 'My Profile')
@push('page-styles')
<style></style>
@endpush

@section('content')
<br>
<br>
<br>
<div class="row">
    <div class="col-lg-3 mb-3">
        <div class="card" data-aos="fade-right">
            <div class="card-header"></div>
            <div class="card-body">
                <img class="card-img-top avatar" src="http://placehold.it/64x64" alt="Card image cap" sizes="30">
                <p class="card-text">{{Auth::user()->name}}</p>
                <p>Email: {{Auth::user()->email}}</p>
            </div>
            <ul class="list-group list-group-flush">
                <li class="list-group-item">Phone: 0987077077</li>
                <li class="list-group-item">Date of Bird: 02/07/2020</li>
                <li class="list-group-item">Male</li>
            </ul>
        </div>
    </div>
    <div class="col-lg-9 mb-3">

        <nav>
            <div class="nav nav-tabs" id="nav-tab" role="tablist">
                <a class="nav-item nav-link active" id="nav-home-tab" data-toggle="tab" href="#nav-home" role="tab" aria-controls="nav-home" aria-selected="true">Profile</a>
                <a class="nav-item nav-link" id="nav-profile-tab" data-toggle="tab" href="#nav-profile" role="tab" aria-controls="nav-profile" aria-selected="false">Address</a>
                <a class="nav-item nav-link" id="nav-contact-tab" data-toggle="tab" href="#nav-contact" role="tab" aria-controls="nav-contact" aria-selected="false">Change Password</a>
            </div>
        </nav>
        <div class="tab-content" id="nav-tabContent">
            <div class="tab-pane fade show active" id="nav-home" role="tabpanel" aria-labelledby="nav-home-tab">
                Mobile Phone: 0988 123 123
            </div>
            <div class="tab-pane fade" id="nav-profile" role="tabpanel" aria-labelledby="nav-profile-tab">
                <Address> 13th Street. 47 W 13th St, New York, NY 10011, USA.</Address>
            </div>
            <div class="tab-pane fade" id="nav-contact" role="tabpanel" aria-labelledby="nav-contact-tab">
                <br>
                <div class="card" data-aos="zoom-in">
                    <div class="card-header">Change new password</div>
                    <div class="card-body">
                        <form method="POST" action="{{route('change.password')}}">
                            @csrf
                            <div class="form-group row">
                                <label for="oldPassword" class="col-md-4 col-form-label text-md-right">{{__('Old Password')}}</label>
                                <div class="col-md-6">
                                    <input id="oldPassword" type="password" class="form-control @error('oldPassword') is-invalid @enderror" required autofocus>
                                    @error('oldPassword')
                                    <span class="invalid-feedback" role="alert">
                                        <strong>{{ $message }}</strong>
                                    </span>
                                    @enderror
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="newPassword" class="col-md-4 col-form-label text-md-right">{{__('New Password')}}</label>
                                <div class="col-md-6">
                                    <input id="newPassword" type="password" class="form-control @error('newPassword') is-invalid @enderror" required autofocus>
                                    @error('newPassword')
                                    <span class="invalid-feedback" role="alert">
                                        <strong>{{ $message }}</strong>
                                    </span>
                                    @enderror
                                </div>
                            </div>
                            <div class="form-group row">
                                <label for="confirmNewPassword" class="col-md-4 col-form-label text-md-right">{{__('Confirm New Password')}}</label>
                                <div class="col-md-6">
                                    <input id="confirmNewPassword" type="password" class="form-control @error('confirmNewPassword') is-invalid @enderror" required autofocus>
                                    @error('confirmNewPassword')
                                    <span class="invalid-feedback" role="alert">
                                        <strong>{{ $message }}</strong>
                                    </span>
                                    @enderror
                                </div>
                            </div>
                            <div class="form-group row mb-0">
                                <div class="col-md-6 offset-md-4">
                                    <button type="submit" class="btn btn-primary">
                                        {{ __('Change') }}
                                    </button>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<hr>
@endsection

@push('page-scripts')
<!-- Custom this page scripts -->
<script></script>
@endpush