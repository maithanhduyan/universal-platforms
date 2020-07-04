## For Dev

# Guide for Dev
## Database 
### Database migration
- Tạo file migrate trong database/migrations
~~~~
php artisan make:migration create_product_table --create=product
php artisan make:migration create_product_category_table --create=product_category
php artisan make:migration create_product_role_table --create=role
php artisan make:migration create_customer_table --create=customer
php artisan make:migration create_customer_group_table --create=customer_group
php artisan make:migration create_order_table --create=order
php artisan make:migration create_order_detail_table --create=order_detail
php artisan make:migration create_currency_table --create=currency
~~~~
- Tạo bảng trong database lần đầu (Xóa các bảng nếu tồn tại)
~~~~
php artisan migrate:fresh
~~~~
Only migrate 1 table
> php artisan migrate --path=/database/migrations/2020_06_17_081259_create_company_table.php
> php artisan migrate:fresh --path=/database/migrations/2020_06_17_081259_create_company_table.php
### Database seeding
- Tạo Seeder
~~~~
php artisan make:seeder UserSeeder
php artisan make:seeder ProductSeeder
php artisan make:seeder ProductCategorySeeder
php artisan make:seeder CustomerSeeder
php artisan make:seeder CustomerGroupSeeder
php artisan make:seeder OrderSeeder
php artisan make:seeder OrderDetailSeeder
php artisan make:seeder RoleSeeder
php artisan make:seeder CurrencySeeder
~~~~
- Thêm dữ liệu vào database từ file Seeder
~~~~
php artisan db:seed
php artisan db:seed --class=RoleSeeder
php artisan db:seed --class=CurrencySeeder
~~~~
### Create Models from database
- Install package Krlove

> composer require krlove/eloquent-model-generator --dev

Using : 
~~~~
php artisan krlove:generate:model Users --table-name=users
or
php artisan krlove:generate:model Company --output-path=Models --table-name=company
php artisan krlove:generate:model User --output-path=Models --table-name=users
php artisan krlove:generate:model Role --output-path=Models --table-name=role
php artisan krlove:generate:model Product --output-path=Models --table-name=product
php artisan krlove:generate:model ProductCategory --output-path=Models --table-name=product_category
php artisan krlove:generate:model Customer --output-path=Models --table-name=customer
php artisan krlove:generate:model CustomerGroup --output-path=Models --table-name=customer_group
php artisan krlove:generate:model Order --output-path=Models --table-name=order
php artisan krlove:generate:model OrderDetail --output-path=Models --table-name=order_detail
php artisan krlove:generate:model Currency --output-path=Models --table-name=currency

~~~~
### Create Controller
  * Create controller with default function (index, create, store, show, edit, update, detroy) for Web
  ~~~~
   php artisan make:controller HomeController --resource
   php artisan make:controller ProductController --resource
  ~~~~
  - Api with default function (index, store, show, update, detroye)
~~~~
 php artisan make:controller Api\CompanyApiController --api 
 php artisan make:controller Api\UserApiController --api 
 php artisan make:controller Api\RoleApiController --api 
 php artisan make:controller Api\LoginApiController --api 
 php artisan make:controller Api\ProductApiController --api 
 php artisan make:controller Api\ProductCategoryApiController --api 
 php artisan make:controller Api\CustomerApiController --api 
 php artisan make:controller Api\CustomerGroupApiController --api 
 php artisan make:controller Api\OrderApiController --api 
 php artisan make:controller Api\OrderDetailApiController --api 
 php artisan make:controller Api\HealthCheckApiController --api 
~~~~

### [Laravel Passport]('https://laravel.com/docs/7.x/passport')
> composer require laravel/passport

> php artisan migrate

> php artisan passport:install

> php artisan passport:install --uuids

When deploying Passport to your production servers for the first time, you will likely need to run the passport:keys command.
> php artisan passport:keys
### Validation Request 
#### References 
[Sanitizer]('https://github.com/Waavi/Sanitizer')
[Validation]('https://medium.com/@kamerk22/the-smart-way-to-handle-request-validation-in-laravel-5e8886279271')
- Create Custom Request:
> php artisan make:request BaseFormRequest
> php artisan make:request RegisterRequest
> php artisan make:request LoginRequest
### Error Handling
You may publish Laravel's error page templates using the vendor:publish Artisan command. Once the templates have been published, you may customize them to your liking:
~~~~
php artisan vendor:publish --tag=laravel-errors
~~~~
### Session table
~~~~
php artisan session:table
~~~~
## Heroku Deploy

- Open command promt :
~~~~
heroku login
~~~~
- Run bash command
~~~~
heroku login
heroku run bash -a APPNAME
$ cd app
~~~~
- Create .env configuaration file 
~~~~
copy .env.example .env
~~~~
## First time deploy laravel 
~~~~
php artisan cache:clear
php artisan clear-compiled
chmod -R 777 storage
chmod -R 777 bootstrap/cache/
composer dump-autoload
php artisan key:generate
php artisan optimize
~~~~
## Connect Postgresql Database (.env file)
Open php.ini configuaration file and uncomment 
~~~~
extension=php_pgsql.dll
extension=php_pdo_pgsql.dll
~~~~

## SSL config
on file .env add new variable 
>ASSET_URL=https://yourdomain

## GIT branching model - Operational policy 
[Document](https://nvie.com/posts/a-successful-git-branching-model/)
### Rules
Rules for creating branches
In the case of new development, create it on a screen basis
Naming convention: feature/[screen ID/screen name]
Commit: Make it functional unit
ex:
Branch name: feature/customer_registration_screen
Commit: [feat] customer registration function development
Commit: [feat] Develop customer registration part of external system

When releasing, create a branch for release (created and merged each time at the time of release)
Naming convention: release_yyyymmdd_[environment]
Commit: Make it functional unit
release_yyyymmdd_[environment]
ex:
release_yyyymmdd_production
release_yyyymmdd_staging
##Operational policy 
- Commit message prefix
- Prefix 
| feat          | (formatting, missing semi colons, etc; no production code change)       | 
| fix           | (bug fix for the user, not a fix to a build script)                     |
| docs          | (changes to the documentation)                                          |
| style         | (formatting, missing semi colons, etc; no production code change)       |
| refactor      | (refactoring production code, eg. renaming a variable)                  |
| test          | (adding missing tests, refactoring tests; no production code change)    |
| chore         | chore (updating grunt tasks etc; no production code change)             |
    
##Git Branch Naming Conventions
- The main branches :
    - master
    - develop 
    - feature
    - release
- Branch naming convention:
    - anything except master, develop, release-*, or hotfix-*
    - hotfix-*
    - release-*


### Facade in Laravel Application
References: https://medium.com/@shishirthedev/facade-in-laravel-application-d2a3053f5a71
 - Step 1: Create a facade root
 in app\Helpers\CompanyHelper.php
 ~~~~
namespace App\Helpers;

use App\Models\Company;

class CompanyHelper
{

    public function getName()
    {
        return 'Shopping Mall';
    }

}
 ~~~~
 - Step 2: Create Facade Class and override getFacadeAccessor() method
 ~~~~
  namespace App\Facades;

use Illuminate\Support\Facades\Facade;

class CompanyFacade extends Facade
{
    public static function getFacadeAccessor()
    {
        return 'company';
    }
}
 ~~~~
 - Step 3: Create a Service Provider class and bind your class to the service provider.
 Command line :
 > php artisan make:provider 'FacadeServiceProvider'

 FacadeServiceProvider.php was created in app\Providers
 ~~~~
 <?php

namespace App\Providers;

use Illuminate\Support\ServiceProvider;

class FacadeServiceProvider extends ServiceProvider
{
    /**
     * Register services.
     *
     * @return void
     */
    public function register()
    {
        $this->app->bind('company', function () {
            return new \App\Helpers\CompanyHelper;
        });
    }

    /**
     * Bootstrap services.
     *
     * @return void
     */
    public function boot()
    {
        //
    }
}
 ~~~~
 - Step 4: Register Service Provider and alias.
 in 'config\app.php' add new line :
 > App\Providers\FacadeServiceProvider::class,
 > 'Company' => App\Facades\CompanyFacade::class,
 ~~~~
<?php

return [

    ... 

    'providers' => [

       ... // orthers Providers
        /*
         * Shop Service Providers...
         */
        App\Providers\FacadeServiceProvider::class,

    ],

    'aliases' => [

        ... //orthers Aliases

        /*
         * Shop Aliases.
         */
        'Company' => App\Facades\CompanyFacade::class,
    ],

];
 ~~~~
 - Step 5: Use the facade.
In view anywhere using
 ~~~~
{{Company::getName()}}
 ~~~~
 
### Listeners
> php artisan make:listener RegisterListener

### Broadcasting
> php artisan make:channel RegisterChannel
### Console
>php artisan make:command RegisterCommand
### Events
>php artisan make:event DailyEvent
### Jobs
> php artisan make:job DepositeJob
### Mail
> php artisan make:mail CustomerBirthDay
### Notifications 
> php artisan make:notification SMSNotificate
### Policies
> php artisan make:policy CustomerPolicy
### Rules 
> php artisan make:rule StoreProductRule
 
## Vue JS

> composer require laravel/ui

> php artisan ui vue

> php artisan ui vue --auth

> npm install

> npm run dev

### Gzip in php.ini
~~~~
; http://php.net/output-handler
output_handler = Off

; http://php.net/zlib.output-compression
zlib.output_compression=On

; http://php.net/zlib.output-compression-level
zlib.output_compression_level = 9

; http://php.net/zlib.output-handler
zlib.output_handler =ob_gzhandler

~~~~