<?php

namespace App\Http\Controllers\Admin;

use App\Http\Controllers\Controller;
use Illuminate\Foundation\Auth\AuthenticatesUsers;

class AdminController extends Controller
{

    use AuthenticatesUsers;

    /**
     * Where to redirect users after login.
     *
     * @var string
     */
    protected $redirectTo = '/admin/dashboard';

    public function __construct()
    {
        $this->middleware('auth');
    }

    public function viewDashboard()
    {
        return view('admin.dashboard.index');
    }

    public function viewProduct()
    {
        return view('admin.products.index');
    }

    public function viewProductCategory()
    {
        return view('admin.products.category');
    }

    public function viewProductAddNew()
    {
        return view('admin.products.addnew');
    }

    public function viewCustomer()
    {
        return view('admin.customers.index');
    }

    public function viewInvoice()
    {
        return view('admin.invoices.index');
    }
}
