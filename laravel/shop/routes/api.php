<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

// url: http://127.0.0.1:8000/api/healthcheck
Route::get('healthcheck', 'Api\HealthCheckApiController@index')->name('api.healthcheck');

// url: http://127.0.0.1:8000/api/login
Route::post('login', 'Api\LoginApiController@login')->name('api.login');

// Company
Route::get('company', 'Api\CompanyApiController@index')
    ->name('api.company.index');

Route::group(['middleware' => 'auth:api'], function () {
    // Product
    Route::post('product', 'Api\ProductApiController@index')
        ->name('api.product.index');
});

/*
|--------------------------------------------------------------------------
| API Routes for ADMIN
|--------------------------------------------------------------------------
|
| Register Api for ADMINISTRATOR
|
*/
Route::prefix('admin')->group(function () {
    Route::post('product', 'Admin\Api\ProductController@list')
        ->name('api.admin.product');
});
