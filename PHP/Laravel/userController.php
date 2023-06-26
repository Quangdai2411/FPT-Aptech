<?php

namespace App\Http\Controllers;

use App\Models\student;
use Illuminate\Http\Request;


class userController extends Controller
{
    public function index(){
        $students = student::all();
        return view('student.index', ['students' => $students]);
    }

    public function insert(){
        return view('student.insert');
    }

    public function students(Request $request){
        $data = $request->validate([
            'TenSV' => 'required',
            'LopHoc' => 'required',
            'SoDienThoai' => 'required',
            'Email' => 'required',
        ]);

        $newStudent = student::create($data);

        return redirect(route('student.index'));
    }

    public function edit(student $student){
        return view('student.update', ['student' => $student]);
    }

    public function update(student $student, Request $request){
        $data = $request->validate([
            'TenSV' => 'required',
            'LopHoc' => 'required',
            'SoDienThoai' => 'required',
            'Email' => 'required',
        ]);

        $student->update($data);

        return redirect(route('student.index'));
    }

    public function delete(student $student){
        $student->delete();
        return redirect(route('student.index'));
    }
}
