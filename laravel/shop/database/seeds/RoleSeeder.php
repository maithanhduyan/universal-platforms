<?php

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Str;

class RoleSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('role')->delete();

        $roles = array(
            array('id' => 'dcee9aa2-9c1c-4163-9b0b-3440864ecb2f', 'name' => 'ADMIN'),
            array('id' => '27c433d4-bc6a-4128-9481-9feaeb58d2a3', 'name' => 'USER'),
            array('id' => Str::uuid(), 'name' => 'employee'),
            array('id' => Str::uuid(), 'name' => 'customer'),

        );

        DB::table('role')->insert($roles);
    }
}
