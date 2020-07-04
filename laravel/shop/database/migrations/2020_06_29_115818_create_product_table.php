<?php

use Illuminate\Database\Migrations\Migration;
use Illuminate\Database\Schema\Blueprint;
use Illuminate\Support\Facades\Schema;

class CreateProductTable extends Migration
{
    /**
     * Run the migrations.
     *
     * @return void
     */
    public function up()
    {
        Schema::create('product', function (Blueprint $table) {
            $table->string('id')->primary()->max;
            $table->string('name')->unique();
            $table->string('code')->unique();
            $table->string('category_id');
            $table->double('cost_price')->default(0);
            $table->double('sale_price')->default(0);
            $table->string('image')->nullable();
            $table->string('description', 2000)->nullable();
            $table->string('unit_id');
            $table->integer('in_stock')->default(1);
            $table->integer('max_in_stock')->default(10);
            $table->integer('min_in_stock')->default(1);
            $table->integer('active')->default(1);
            $table->string('user_create_id')->nullable();
            $table->timestamp('created_at')->useCurrent();
            $table->timestamp('updated_at')->useCurrent();
        });
    }

    /**
     * Reverse the migrations.
     *
     * @return void
     */
    public function down()
    {
        Schema::dropIfExists('product');
    }
}
