<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

/**
 * @property integer $id
 * @property string $name
 * @property string $brand_name
 * @property string $logo_url
 * @property string $address
 * @property int $active
 * @property string $user_create_id
 * @property string $created_at
 * @property string $updated_at
 */
class Company extends Model
{
    /**
     * The table associated with the model.
     * 
     * @var string
     */
    protected $table = 'company';

    /**
     * The "type" of the auto-incrementing ID.
     * 
     * @var string
     */
    protected $keyType = 'integer';

    /**
     * @var array
     */
    protected $fillable = ['name', 'brand_name', 'logo_url', 'address', 'active', 'user_create_id', 'created_at', 'updated_at'];
}
