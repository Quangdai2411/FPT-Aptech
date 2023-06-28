<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
    <title>Thêm</title>
    <style>
        body{
            width: 50%;
            margin: 0 auto;
        }
    </style>
</head>
<body>
    <h1>Thêm sách</h1>
    <form method="POST" action="{{route('book.creates')}}">
        @csrf
        @method('post')
        <div class="form-group">
            <label>ID Tác Giả</label>
            <input type="text" name="authorID" class="form-control">
        </div>
        <div class="form-group">
            <label>Tên sách</label>
            <input type="text" name="title" class="form-control">
        </div>
        <div class="form-group">
            <label>Mã số</label>
            <input type="text" name="ISBN" class="form-control">
        </div>
        <div class="form-group">
            <label>Năm sản xuất</label>
            <input type="text" name="pub_year" class="form-control">
        </div>
        <div class="form-group">
            <label>Số lượng</label>
            <input type="text" name="available" class="form-control">
        </div>
        <input type="submit" class="btn btn-primary" value="Submit">
    </form>
</body>
</html>