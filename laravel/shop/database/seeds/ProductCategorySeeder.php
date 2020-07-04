<?php

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class ProductCategorySeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('product_category')->delete();

        $product_category = array(
            array('id' => 'a6ad4828-5355-446a-8e1c-0dab50ec097a', 'name' => 'Bia Rượu', 'short_name' => 'bia-ruou', 'description' => 'Bia Rượu', 'user_create_id' => 'SYSTEM'),
            array('id' => '2d6efdc1-fbff-4e76-8477-6a53db0d5d9b', 'name' => 'Gia Dụng', 'short_name' => 'gia-dung', 'description' => 'Gia Dụng', 'user_create_id' => 'SYSTEM'),
            array('id' => 'f78edbf2-031e-4432-bc1a-e8221e02a45e', 'name' => 'Nước giải khát', 'short_name' => 'nuoc-giai-khat',  'description' => 'Nước giải khát', 'user_create_id' => 'SYSTEM'),
            array('id' => 'f274dd0d-2cb3-4ec9-b27a-a532d1f85290', 'name' => 'Sách truyện', 'short_name' => 'sach-truyen',  'description' => 'Sách truyện', 'user_create_id' => 'SYSTEM'),
            array('id' => '6973aca1-eeee-4d9c-880a-ebc9ce492974', 'name' => 'Thực phẩm dinh dưỡng', 'short_name' => 'thuc-pham-dinh-duong',  'description' => 'Thực phẩm dinh dưỡng', 'user_create_id' => 'SYSTEM'),
        );

        DB::table('product_category')->insert($product_category);
    }
}
