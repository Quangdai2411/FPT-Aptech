<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <title>Book</title>
</head>
<body>
    <style>
        body{
            width: 80%;
            margin: 0 auto;
        }
    </style>
    <div class="page-header clearfix">
        <h2 class="pull-left">Book Details</h2>
        <a href="{{route('book.create')}}" class="btn btn-success pull-right">Create New</a>
    </div>
    <div class="page-header clearfix">
        <form class="form-inline my-2 my-lg-0 " action="{{route('book.find')}}" method="GET">
            <input class="form-control mr-sm-2" name="search" placeholder="Search" aria-label="Search">
            <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
          </form>
    </div>
    <table class="table">
        <thead class="thead-light">
          <tr>
            <th scope="col">Book ID</th>
            <th scope="col">Author ID</th>
            <th scope="col">Title</th>
            <th scope="col">ISBN</th>
            <th scope="col">Pub_year</th>
            <th scope="col">Avaiable</th>
          </tr>
        </thead>
        <tbody>
            @foreach ($book as $books)
          <tr>
            <th>{{$books->bookID}}</th>
            <td>{{$books->authorID}}</td>
            <td>{{$books->title}}</td>
            <td>{{$books->ISBN}}</td>
            <td>{{$books->pub_year}}</td>
            <td>{{$books->available}}</td>
          </tr>
          @endforeach
        </tbody>
      </table>
</body>
</html>