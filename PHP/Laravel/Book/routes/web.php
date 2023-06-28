<?php

use Illuminate\Support\Facades\Route;
use illuminate\Models\book;
use App\Http\Controllers\bookController;



/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider and all of them will
| be assigned to the "web" middleware group. Make something great!
|
*/



Route::get('/book', [bookController::class, 'index'])->name('book.index');
Route::get('/book/create', [bookController::class, 'create'])->name('book.create');
Route::post('/book', [bookController::class, 'creates'])->name('book.creates');
Route::get('/book/find', [bookController::class, 'find'])->name('book.find');