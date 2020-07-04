<?php

use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', 'ShopController@index')->name('shopping');

Auth::routes();

Route::get('/home', 'HomeController@index')->name('home');
Route::get('/wish-list', 'WishListController@index')->name('wish.list');
Route::get('/cart', 'CartController@index')->name('cart');
Route::get('/my-profile', 'MyProfileController@index')->name('my.profile');
Route::post('/my-profile/change-password', 'MyProfileController@changePassword')->name('change.password');
Route::get('/my-order', 'MyOrderController@index')->name('my.order');

/*
|--------------------------------------------------------------------------
| Amin Web Routes
|--------------------------------------------------------------------------
|
| This routes just for Administrator
| URL: http://127.0.0.1:8000/admin/
|
*/
Route::prefix('/admin')->group(function () {
    Route::get('/login', 'Admin\LoginController@index')->name('admin.login');
    Route::post('/login', 'Admin\LoginController@doLogin')->name('admin.doLogin');
    Route::get('/logout', 'Admin\LoginController@doLogout')->name('admin.doLogout');
    Route::get('/dashboard', 'Admin\AdminController@viewDashBoard')->name('admin.dashboard');
    // 
    Route::get('/product', 'Admin\AdminController@viewProduct')->name('admin.product');
    Route::get('/product-category', 'Admin\AdminController@viewProductCategory')->name('admin.product.category');
    Route::get('/product-addnew', 'Admin\AdminController@viewProductAddNew')->name('admin.product.addnew');
    // 
    Route::get('/customer', 'Admin\AdminController@viewCustomer')->name('admin.customer');
    Route::get('/customer-group', 'Admin\AdminController@viewCustomerGroup')->name('admin.customer.group');
    Route::get('/customer-addnew', 'Admin\AdminController@viewCustomerAddNew')->name('admin.customer.addnew');
    // 
    Route::get('/invoice', 'Admin\AdminController@viewInvoice')->name('admin.invoice');
    //
    Route::get('/401', 'Admin\ErrorController@throw401Error')->name('admin.error.401');
    Route::get('/404', 'Admin\ErrorController@throw404Error')->name('admin.error.404');
    Route::get('/500', 'Admin\ErrorController@throw500Error')->name('admin.error.500');
});
