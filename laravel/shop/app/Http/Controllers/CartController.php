<?php

namespace App\Http\Controllers;

use App\Services\ProductService;

class CartController extends Controller
{
    public function __construct(ProductService $injPoductService)
    {
        $this->productService = $injPoductService;
    }

    /**
     * Display a listing of the resource.
     *
     * @return \Illuminate\Http\Response
     */
    public function index()
    {
        return view('cart');
    }
}
