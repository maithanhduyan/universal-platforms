<?php

namespace App\Http\Controllers\Admin;

use App\Http\Controllers\Controller;
use App\Http\Requests\LoginRequest;
use Illuminate\Foundation\Auth\AuthenticatesUsers;
use Illuminate\Support\Facades\Auth;

class LoginController extends Controller
{
    use AuthenticatesUsers;

    protected $redirectTo  = 'admin/dashboard';

    public function __construct()
    {
    }
    public function index()
    {
        return view('admin.auth.login');
    }

    public function doLogin(LoginRequest $request)
    {
        // Validate
        $login = $request->all();
        if (Auth::attempt(['email' => $request->email, 'password' => $request->password])) {
            return view('admin.dashboard.index');
        } else {
            return view('admin.auth.login', ['error' => 'base on role']);
        }
    }

    public function doLogout()
    {
        Auth::logout();
    }
}
