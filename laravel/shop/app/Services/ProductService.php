<?php

namespace App\Services;

interface ProductService
{
    function findByPage($start, $end);

    function datatableRender($page, $length, $search, $order, $column);

    function datatableCount($search);
}
