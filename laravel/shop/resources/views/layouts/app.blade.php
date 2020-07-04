<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>@yield('title')</title>

    <!-- Bootstrap core CSS -->
    <link href="{{asset('libs/bootstrap/css/bootstrap.min.css')}}" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="{{asset('libs/font-awesome-v5.1/css/all.min.css')}}" rel="stylesheet">
    <!-- iconfont CSS -->
    <link href="{{asset('libs/icofont/icofont.min.css')}}" rel="stylesheet">
    <link href="{{asset('libs/boxicons/css/boxicons.min.css')}}" rel="stylesheet">
    <!-- Animate On Scroll CSS -->
    <link href="{{asset('libs/aos/aos.css')}}" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="{{asset('css/style.css')}}" rel="stylesheet">
    <!-- Scripts -->
    <script src="{{ asset('js/app.js') }}" defer></script>
    <!-- Styles -->
    <!-- <link href="{{ asset('css/app.css') }}" rel="stylesheet"> -->
    @stack('page-styles')
</head>

<body>
    <!-- Facebook plugin -->

    <!-- Navigation -->
    @include('layouts.navbar')

    <!-- Page Content -->
    <div class="container">

        <!-- Main Content -->
        @yield('content')

    </div>
    <!-- /.container -->

    <!-- Footer -->
    @include('layouts.footer')
    <!-- Back to Top button -->
    <a href="#" class="back-to-top"><i class="fas fa-angle-up"></i></a>
    <!-- Bootstrap core JavaScript -->
    <script src="{{asset('libs/jquery/jquery.min.js')}}"></script>
    <script src="{{asset('libs/bootstrap/js/bootstrap.bundle.min.js')}}"></script>
    <!-- Animate On Scroll Library -->
    <script src="{{asset('libs/aos/aos.js')}}"></script>
    <!-- Jquery Easing -->
    <script src="{{asset('libs/jquery.easing/jquery.easing.min.js')}}"></script>
    <!-- Custom script -->
    <script src="{{ asset('js/app.js') }}" defer></script>
    <script src="{{asset('js/main.js')}}"></script>
    <!-- Global site tag (gtag.js) - Google Analytics -->
    <script>
        // Create our number formatter.
        // Using formatter.format(2500) //2.500
        var formatter = new Intl.NumberFormat('vi-VN', {
            style: 'currency',
            currency: '{{Shop::currency()->code}}',
        });
    </script>
    @stack('page-scripts')
</body>

</html>