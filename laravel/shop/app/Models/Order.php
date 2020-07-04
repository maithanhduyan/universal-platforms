<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

/**
 * @property string $id
 * @property string $customer_id
 * @property float $money_total
 * @property float $money_discount
 * @property string $payment_method_id
 * @property int $active
 * @property string $user_create_id
 * @property string $created_at
 * @property string $updated_at
 */
class Order extends Model
{
    /**
     * The table associated with the model.
     * 
     * @var string
     */
    protected $table = 'order';

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
    protected $fillable = ['customer_id', 'money_total', 'money_discount', 'payment_method_id', 'active', 'user_create_id', 'created_at', 'updated_at'];
}
