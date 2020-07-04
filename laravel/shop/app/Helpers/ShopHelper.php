<?php

namespace App\Helpers;

use Illuminate\Support\Facades\DB;

class ShopHelper
{
    public function currency()
    {
        return DB::table('currency')
            ->select('code', 'name', 'symbol')
            ->where('code', 'VND')
            ->first();
    }
}
