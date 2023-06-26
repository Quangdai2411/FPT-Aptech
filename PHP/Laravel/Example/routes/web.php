<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\HomeController;
use App\Http\Controllers\userController;
use App\Post;
use App\Models\student;
use Illuminate\Support\Facades\DB;

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

// Route::get('/', function () {
//     return 'hello';
// });


// Route::get('welcome', function (){
//     return 'alo';
// });

Route::get('/about', [HomeController::class, 'showController']);

Route::get('user/{id}/{name}/{comment}', function($id, $name, $comment) {
    echo "ID của user là : " . $id;
    echo "<br>Tên của user là : " . $name;
    echo "<br> Comment của user: " . $comment;
});


Route::get('/insertt', function(){
    DB::insert('insert into student(TenSV, LopHoc, SoDienThoai, Email) values(?, ?, ?, ?)', ['Đỗ Quang Đại', 'T2208M', '0123456789', 'doquangdai24@gmail.com']);
    return 'Done!';
});

Route::get('/updatee', function(){
    DB::update('update student set SoDienThoai = "0987654321" where MaSV = ?', [1]);
    return 'Update Done!';
});

Route::get('/deletee', function(){
    DB::delete('delete from student where MaSV = ?', [1]);
    return 'Delete Done!';
});

Route::get('/insertORM', function(){
    $a = new student;
    $a->TenSV = 'Magnus';
    $a->LopHoc = 'T2208M';
    $a->SoDienThoai = '014234535';
    $a->Email = 'dai03@gmail.com';
    $a->save();
});

Route::get('/student', [userController::class, 'index'])-> name('student.index');
Route::get('/student/insert', [userController::class, 'insert'])-> name('student.insert');
Route::post('/student', [userController::class, 'students'])-> name('student.students');
Route::get('/student/{student}/edit', [userController::class, 'edit'])-> name('student.edit');
Route::post('/student/{student}/update', [userController::class, 'update'])-> name('student.update');
Route::get('/student/{student}/delete', [userController::class, 'delete'])-> name('student.delete');
