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
    <h1>Thêm Sinh Viên</h1>
    <form method="POST" action="{{route('student.students')}}">
        @csrf
        @method('post')
        <div class="form-group">
            <label>Tên Sinh Viên</label>
            <input type="text" name="TenSV" class="form-control">
        </div>
        <div class="form-group">
            <label>Lớp Học</label>
            <input type="text" name="LopHoc" class="form-control">
        </div>
        <div class="form-group">
            <input type="color" class="form-control">
        </div>
        <div class="form-group">
            <label>Số Điện Thoại</label>
            <input type="text" name="SoDienThoai" class="form-control">
        </div>
        <div class="form-group">
            <label>Email</label>
            <input type="text" name="Email" class="form-control">
        </div>
        <input type="submit" class="btn btn-primary" value="Submit">
    </form>
</body>
</html>