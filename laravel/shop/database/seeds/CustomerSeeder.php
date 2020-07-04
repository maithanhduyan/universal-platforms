<?php

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class CustomerSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('customer')->delete();

        $customer = array(
            array('id' => 'b1ae9707-17d1-4773-a7eb-d82acf8b9b5d', 'name' => 'Lê Thị Mỹ Hạnh', 'code' => 'KL', 'group_id' => 'e43889fa-8c7c-416c-9bd5-739e7e144402', 'email' => 'le@example.com', 'phone' => '0913336769', 'address' => 'Q1', 'user_create_id' => 'SYSTEM'),

        );

        DB::table('customer')->insert($customer);
    }
}
