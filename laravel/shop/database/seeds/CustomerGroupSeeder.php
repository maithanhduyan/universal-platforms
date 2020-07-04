<?php

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class CustomerGroupSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('customer_group')->delete();

        $customer_group = array(
            array('id' => 'e43889fa-8c7c-416c-9bd5-739e7e144402', 'name' => 'Khách Lẻ', 'description' => 'Khách Lẻ', 'user_create_id' => 'SYSTEM'),

        );

        DB::table('customer_group')->insert($customer_group);
    }
}
