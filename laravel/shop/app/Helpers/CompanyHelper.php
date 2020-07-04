<?php

namespace App\Helpers;

use App\Models\Company;

class CompanyHelper
{

    public function getName()
    {
        return 'Shopping Mall';
    }

    public function getModel()
    {
        return Company::first();
    }
}
