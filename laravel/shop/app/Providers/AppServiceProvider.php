<?php

namespace App\Providers;

use Illuminate\Support\Facades\Schema;
use Illuminate\Support\ServiceProvider;

class AppServiceProvider extends ServiceProvider
{
    /**
     * Register any application services.
     *
     * @return void
     */
    public function register()
    {
        // Services
        $this->app->singleton(\App\Services\CompanyService::class, function () {
            return new \App\Services\Impl\CompanyServiceImpl();
        });
        $this->app->singleton(\App\Services\ProductService::class, function () {
            return new \App\Services\Impl\ProductServiceImpl();
        });
    }

    /**
     * Bootstrap any application services.
     *
     * @return void
     */
    public function boot()
    {
        Schema::defaultStringLength(191);
    }
}
