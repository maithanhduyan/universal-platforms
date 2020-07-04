<nav class="navbar navbar-expand-lg  bg-light fixed-top" data-aos="fade-down">
    <div class="container">
        <a><img class="navbar-logo" src="{{asset( Company::getModel()->logo_url ?? '')}}"></a>
        <a class="navbar-brand" href="{{ url('/') }}">{{ Company::getModel()->name ?? ''}}</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <i class="fas fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                @if (Route::has('wish.list'))
                <li class="nav-item">
                    <a class="nav-link" href="{{route('wish.list')}}">
                        <i class="far fa-heart"></i>
                        Wish list
                    </a>
                </li>
                @endif

                @if (Route::has('cart'))
                <li class="nav-item">
                    <a class="nav-link" href="{{route('cart')}}">
                        <i class="fas fa-shopping-cart"></i>
                        Cart
                    </a>
                </li>
                @endif

                <!-- Authentication Links -->
                @guest
                <li class="nav-item">
                    <a class="nav-link" href="{{ route('login') }}">{{ __('shop.login') }}</a>
                </li>

                @if (Route::has('register'))
                <li class="nav-item">
                    <a class="nav-link" href="{{ route('register') }}">{{ __('shop.register') }}</a>
                </li>
                @endif

                @else
                <li class="nav-item dropdown">
                    <a id="navbarDropdown" class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" v-pre>
                        {{ Auth::user()->name }} <span class="caret"></span>
                    </a>

                    <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
                        @if(Route::has('my.order'))
                        <a class="dropdown-item" href="{{route('my.order')}}">
                            <i class="fas fa-receipt"></i>
                            My Order</a>
                        @endif

                        @if(Route::has('my.profile'))
                        <a class="dropdown-item " href="{{route('my.profile')}}">
                            <i class="fas fa-user-cog"></i>
                            My Profile</a>
                        @endif
                        <a class="dropdown-item" href="{{ route('logout') }}" onclick="event.preventDefault();
                                                     document.getElementById('logout-form').submit();">
                            <i class="fas fa-sign-out-alt"></i>
                            {{ __('Logout') }}
                        </a>

                        <form id="logout-form" action="{{ route('logout') }}" method="POST" style="display: none;">
                            @csrf
                        </form>
                    </div>
                </li>
                @endguest

                <!-- /. Authentication Links -->
            </ul>
        </div>

    </div>
</nav>