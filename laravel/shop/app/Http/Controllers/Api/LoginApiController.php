<?php

namespace App\Http\Controllers\Api;

use App\Http\Controllers\Controller;
use App\Http\Requests\LoginRequest;
use Exception;
use Illuminate\Http\Request;


class LoginApiController extends Controller
{
    public function login(LoginRequest $request)
    {
        // Validate
        $login = $request->all();
        try {
            // Fail
            if (!auth()->attempt($login)) {
                return response()->json(['error' => 'UnAuthorised'], 401);
            }
            // Success
            $token = auth()->user()->createToken('SHOP-TK')->accessToken;

            return response()
                ->json(['token' => $token], 200)
                ->withHeaders(['Authorization' => 'Bearer ' . $token]);
        } catch (Exception $e) {
            return response()->json(['error' => $e->getMessage()], 500);
        }
    }
}
