<?php

namespace App\Helpers;

use App\Models\Product;
use App\Models\ProductCategory;

class ProductHelper
{
    public function getCategory()
    {
        return ProductCategory::where('active', 1)
            ->limit(6)
            ->get();
    }

    public function countCategory()
    {
        return ProductCategory::where('active', 1)->count();
    }
}
