<?php

namespace App\Http\Controllers;

use App\Services\ProductService;

class MyOrderController extends Controller
{
    public function __construct(ProductService $injPoductService)
    {
        $this->middleware('auth');
        $this->productService = $injPoductService;
    }

    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        return view('my_order');
    }
}
