<?php

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Str;

class UserSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('users')->delete();

        $users = array(
            array('id' => 'b64258aa-b1bf-4b3f-8927-24876008171f', 'name' => 'admin', 'email' => 'admin@example.com', 'password' => bcrypt('admin'), 'role_id' => 'dcee9aa2-9c1c-4163-9b0b-3440864ecb2f'),
            array('id' => 'abd33951-c7db-4eef-8a5c-1600edac3ed1', 'name' => 'user', 'email' => 'user@example.com', 'password' => bcrypt('user'), 'role_id' => '27c433d4-bc6a-4128-9481-9feaeb58d2a3'),
            // array('id' => Str::uuid(), 'name' => 'employee', 'email' => 'employee@example.com', 'password' => bcrypt('employee')),
            // array('id' => Str::uuid(), 'name' => 'customer', 'email' => 'customer@example.com', 'password' => bcrypt('customer')),

        );

        DB::table('users')->insert($users);
    }
}
