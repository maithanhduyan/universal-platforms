<?php

use Illuminate\Database\Seeder;
use Illuminate\Support\Facades\DB;

class CompanySeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('company')->delete();

        $pham = array(
            array('id' => '1', 'name' => 'TAYAFOOD', 'brand_name' => 'TAYA', 'logo_url' => '/images/logo/company-logo.jpg', 'address' => '276/3/66 Mã Lò <br>Phường Bình Trị Đông, Quận Bình Tân<br>TP.Hồ Chí Minh, Việt Nam <br><br>', 'phone' => '+84 989214800', 'email' => 'info@tayafood.com'),

        );

        DB::table('company')->insert($pham);
    }
}
