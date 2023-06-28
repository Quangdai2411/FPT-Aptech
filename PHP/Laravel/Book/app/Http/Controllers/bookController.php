<?php

namespace App\Http\Controllers;
use App\Models\book;


use Illuminate\Http\Request;

class bookController extends Controller
{
    public function index(){
        $book = book::all();
        return view('book.index', ['book' => $book]);
    }

    public function create(){
        return view('book.create');
    }

    public function creates(Request $request){
        $data = $request->validate([
            'authorID' => 'required',
            'title' => 'required',
            'ISBN' => 'required',
            'pub_year' => 'required',
            'available' => 'required',
        ]);

        $newBook = book::create($data);

        return redirect(route('book.index'));
    }

    public function find(){
        $search = $_GET['search'];
        if($search != ""){
            $book = book::where('title', 'LIKE','%'.$search.'%')->get();

            return view('book.index', compact('book'));
        }
        
    }
}
