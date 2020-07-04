<?php

namespace App\Http\Controllers\Admin\Api;

use App\Http\Controllers\Controller;
use App\Models\Product;
use App\Services\ProductService;
use Illuminate\Http\Request;

class ProductController extends Controller
{
    private $product;
    public function __construct(ProductService $productService)
    {
        $this->product = $productService;
    }

    public function list(Request $request)
    {
        // Data Request
        $pageRequest  = $request->start;
        $lengthRequest  = $request->length;
        $searchRequest  = $request->search;
        $orderRequest = $request->order;
        $columnsReqest = $request->columns;
        $drawRequest = $request->draw;

        // DataResponse
        $totalRecordResponse = $this->product->datatableCount($searchRequest);
        $dataResponse = $this->product->datatableRender($pageRequest, $lengthRequest, $searchRequest, $orderRequest, $columnsReqest);
        $drawResponse  = $drawRequest;
        return response()->json([
            'recordsTotal' => $totalRecordResponse,
            'draw' => $drawResponse,
            'recordsFiltered' => $totalRecordResponse,
            'data' =>   $dataResponse,
        ], 200);
    }
}
