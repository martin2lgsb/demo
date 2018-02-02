<?php

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
*/

Route::get('/', function () {
    return view('welcome');
//    return response('fuck u!', 233)->header('Content-Type', 'text/plain');
});

Auth::routes();

Route::get('/home', 'HomeController@index')->name('home');

Route::get('/redis', 'RedisController@index')->name('redis');

Route::get('/publish', 'RedisController@publish')->name('publish');