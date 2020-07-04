<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>@yield('title')</title>
    <!-- Animate On Scroll CSS -->
    <link href="{{asset('libs/aos/aos.css')}}" rel="stylesheet">
    <script src="{{asset('/libs/font-awesome-v5.1/js/all.min.js')}}" crossorigin="anonymous"></script>
    <link href="{{asset('admin/css/styles.css')}}" rel="stylesheet" />
    @stack('admin-page-styles')
</head>

<body class="sb-nav-fixed">
    @include('admin.layouts.navbar')

    <div id="layoutSidenav">
        @include('admin.layouts.sidebar')

        <div id="layoutSidenav_content">
            @yield('admin-content')

            @include('admin.layouts.footer')
        </div>
    </div>
    <!-- Back to Top button -->
    <a href="#" class="back-to-top"><i class="fas fa-angle-up"></i></a>
    <script src="{{asset('libs/jquery/jquery.min.js')}}"></script>
    <!-- Animate On Scroll Library -->
    <script src="{{asset('libs/aos/aos.js')}}"></script>
    <!-- Jquery Easing -->
    <script src="{{asset('libs/jquery.easing/jquery.easing.min.js')}}"></script>
    <script src="{{asset('libs/bootstrap/js/bootstrap.bundle.min.js')}}"></script>
    <script src="{{asset('admin/js/scripts.js')}}"></script>
    @stack('admin-page-scripts')
</body>

</html>