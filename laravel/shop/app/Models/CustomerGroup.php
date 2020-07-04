<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

/**
 * @property string $id
 * @property string $name
 * @property string $description
 * @property int $active
 * @property string $user_create_id
 * @property string $created_at
 * @property string $updated_at
 */
class CustomerGroup extends Model
{
    /**
     * The table associated with the model.
     * 
     * @var string
     */
    protected $table = 'customer_group';

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
    protected $fillable = ['name', 'description', 'active', 'user_create_id', 'created_at', 'updated_at'];
}
