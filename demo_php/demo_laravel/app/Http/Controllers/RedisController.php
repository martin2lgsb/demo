<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Redis;

class RedisController extends Controller
{
    //
    public function index()
    {
        Redis::set('name', 'Taylor');
        $ret = Redis::get('name');

        return $ret;
    }

    public function publish()
    {
        Redis::publish('test-channel', 'test-publish-info');
    }
}
