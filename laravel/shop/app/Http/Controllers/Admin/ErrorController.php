<?php

namespace App\Http\Controllers\Admin;

use App\Http\Controllers\Controller;

class ErrorController extends Controller
{
    public function throw401Error()
    {
        return view('admin.errors.401');
    }
    public function throw404Error()
    {
        return view('admin.errors.404');
    }
    public function throw500Error()
    {
        return view('admin.errors.500');
    }
}
