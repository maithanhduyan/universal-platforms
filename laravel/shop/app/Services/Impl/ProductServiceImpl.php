<?php

namespace App\Services\Impl;

use App\Services\ProductService;
use Exception;
use Illuminate\Support\Facades\DB;

class ProductServiceImpl implements ProductService
{
    function findByPage($start, $end)
    {
        try {
            return DB::table('product')
                ->select('name', 'code', 'sale_price', 'image', 'description')
                ->where('active', 1)
                ->limit(10)
                ->get();
        } catch (Exception $e) {
            throw $e;
        }
    }

    /**
     * For Admin using datatable
     */
    public function datatableRender($page, $length, $search, $order, $column)
    {
        try {
            return DB::table('product')
                ->select('name', 'code', 'sale_price', 'cost_price', 'in_stock')
                ->where('active', 1)
                ->where('name', 'LIKE', '%' . $search["value"] . '%')
                ->orWhere('code', 'LIKE', '%' . $search["value"] . '%')
                ->orWhere('sale_price', 'LIKE', '%' . $search["value"] . '%')
                ->orWhere('cost_price', 'LIKE', '%' . $search["value"] . '%')
                ->skip($page)
                ->take($length)
                ->orderBy($column[$order[0]['column']]['data'] ?? '', $order[0]['dir'] ?? '')
                ->get();
        } catch (Exception $e) {
            throw $e;
        }
    }
    public function datatableCount($search)
    {
        try {
            return DB::table('product')
                ->where('active', 1)
                ->where('name', 'LIKE', '%' . $search["value"] . '%')
                ->orWhere('code', 'LIKE', '%' . $search["value"] . '%')
                ->orWhere('sale_price', 'LIKE', '%' . $search["value"] . '%')
                ->orWhere('cost_price', 'LIKE', '%' . $search["value"] . '%')
                ->count();
        } catch (Exception $e) {
            throw $e;
        }
    }
}
