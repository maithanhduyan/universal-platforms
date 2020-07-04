<?php

namespace App\Services\Impl;

use App\Models\Company;
use App\Services\CompanyService;
use Illuminate\Support\Facades\DB;

class CompanyServiceImpl implements CompanyService
{
    public function findOne()
    {
        $company = DB::table('company')
            ->select('name', 'brand_name', 'logo_url', 'address')
            ->where('active', 1)
            ->get();
        return $company;
    }
}
