<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

/**
 * @property string $id
 * @property string $name
 * @property string $code
 * @property string $category_id
 * @property float $cost_price
 * @property float $sale_price
 * @property string $image
 * @property string $description
 * @property string $unit_id
 * @property int $in_stock
 * @property int $max_in_stock
 * @property int $min_in_stock
 * @property string $active
 * @property string $user_create_id
 * @property string $created_at
 * @property string $updated_at
 */
class Product extends Model
{
    /**
     * The table associated with the model.
     * 
     * @var string
     */
    protected $table = 'product';

    /**
     * The "type" of the auto-incrementing ID.
     * 
     * @var string
     */
    protected $keyType = 'string';

    /**
     * Indicates if the IDs are auto-incrementing.
     * 
     * @var bool
     */
    public $incrementing = false;

    /**
     * @var array
     */
    protected $fillable = ['name', 'code', 'category_id', 'cost_price', 'sale_price', 'image', 'description', 'unit_id', 'in_stock', 'max_in_stock', 'min_in_stock', 'active', 'user_create_id', 'created_at', 'updated_at'];
}
