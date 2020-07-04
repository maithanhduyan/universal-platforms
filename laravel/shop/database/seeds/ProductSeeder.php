<?php

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class ProductSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('product')->delete();

        $product = array(
            array('id' => 'dcee9aa2-9c1c-4163-9b0b-3440864ecb2f', 'name' => 'Đèn bàn LED Điện Quang ĐQ LDL02 5W', 'code' => '8934578150039', 'category_id' => 'dien tu', 'unit_id' => 'dvt', 'cost_price' => 950000, 'sale_price' => 980000, 'user_create_id' => 'SYSTEM'),
            array('id' => '1328241f-7460-42e6-934f-4b607561c107', 'name' => 'Máy xay sinh tố MX - 196', 'code' => '8936010060012', 'category_id' => 'dien tu', 'unit_id' => 'dvt', 'cost_price' => 25000, 'sale_price' => 280000, 'user_create_id' => 'SYSTEM'),
            array('id' => '67676faa-736a-4131-9c47-36d80f80729f', 'name' => 'Đậu Phộng Vị BBQ 30g', 'code' => '8934661115679', 'category_id' => 'd8d0ec61-1563-474a-8c55-2a5175b0e9d0', 'unit_id' => '107e98e0-7374-4c7d-a26c-da8f88d7863a', 'cost_price' => 0, 'sale_price' => 5500, 'user_create_id' => 'SYSTEM'),
            array('id' => '0f495e65-c5b7-4e75-856e-0ffbb034f122', 'name' => 'Đậu Hòa Lan Wasabi 100g', 'code' => '8934661116928', 'category_id' => 'd8d0ec61-1563-474a-8c55-2a5175b0e9d0', 'unit_id' => '26f2cd66-326c-4df1-ae52-c086935c4e5e', 'cost_price' => 0, 'sale_price' => 29000, 'user_create_id' => 'SYSTEM'),
            array('id' => '6535189b-0b1c-4d71-a476-345ae67b4583', 'name' => 'Bàn chải lipzo Ruby', 'code' => '3760073620082', 'category_id' => 'c0b39a53-f3e4-4856-9419-b14ebb8b13da', 'unit_id' => 'e249579d-9d01-46d4-b0e6-d075dbdb2bf1', 'cost_price' => 0, 'sale_price' => 21300, 'user_create_id' => 'SYSTEM'),
            array('id' => '52be4265-102c-415d-99ec-1d828a991686', 'name' => 'SCHICK DAO CAO SCHICK2 3', 'code' => '4891228430283', 'category_id' => 'c0b39a53-f3e4-4856-9419-b14ebb8b13da', 'unit_id' => '107e98e0-7374-4c7d-a26c-da8f88d7863a', 'cost_price' => 10000, 'sale_price' => 12000, 'user_create_id' => 'SYSTEM'),
        );

        DB::table('product')->insert($product);
    }
}
