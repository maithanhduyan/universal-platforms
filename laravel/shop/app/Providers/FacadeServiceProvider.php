<?php

namespace App\Providers;

use Illuminate\Support\ServiceProvider;

class FacadeServiceProvider extends ServiceProvider
{
    /**
     * Register services.
     *
     * @return void
     */
    public function register()
    {
        $this->app->bind('company', function () {
            return new \App\Helpers\CompanyHelper;
        });
        $this->app->bind('product', function () {
            return new \App\Helpers\ProductHelper;
        });
        $this->app->bind('shop', function () {
            return new \App\Helpers\ShopHelper;
        });
    }

    /**
     * Bootstrap services.
     *
     * @return void
     */
    public function boot()
    {
        //
    }
}
