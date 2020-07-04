<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

/**
 * @property string $id
 * @property string $name
 * @property string $code
 * @property string $group_id
 * @property string $email
 * @property string $phone
 * @property string $address
 * @property int $active
 * @property string $user_create_id
 * @property string $created_at
 * @property string $updated_at
 */
class Customer extends Model
{
    /**
     * The table associated with the model.
     * 
     * @var string
     */
    protected $table = 'customer';

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
    protected $fillable = ['name', 'code', 'group_id', 'email', 'phone', 'address', 'active', 'user_create_id', 'created_at', 'updated_at'];
}
