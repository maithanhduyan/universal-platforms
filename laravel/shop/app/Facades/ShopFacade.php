<?php

namespace App\Facades;

use Illuminate\Support\Facades\Facade;

class ShopFacade extends Facade
{
    public static function getFacadeAccessor()
    {
        return 'shop';
    }
}
