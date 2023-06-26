<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <title>Document</title>
    <style>
        body{
            width: 80%;
            margin: 0 auto;
        }
    </style>
</head>
<body>
        <div class="page-header clearfix">
            <h2 class="pull-left">Students List</h2>
            <a href="{{route('student.insert')}}" class="btn btn-success pull-right">Create New</a>
        </div>
        <table class="table table-striped">
            <thead>
              <tr>
                <th scope="col">Created At</th>
                <th scope="col">Mã Sinh Viên</th>
                <th scope="col">Tên Sinh Viên</th>
                <th scope="col">Lớp Học</th>
                <th scope="col">Số Điện Thoại</th>
                <th scope="col">Email</th>
                <th scope="col">Trạng thái</th>
              </tr>
            </thead>
            <tbody>
                @foreach ($students as $student)
              <tr>
                <td>{{$student->created_at}}</td>
                <td>{{$student->id}}</td>
                <td>{{$student->TenSV}}</td>
                <td>{{$student->LopHoc}}</td>
                <td>{{$student->SoDienThoai}}</td>
                <td>{{$student->Email}}</td> 
                <td><a href="{{route('student.edit', $student->id)}}" class="glyphicon glyphicon-pencil"></a> &nbsp;
                    <a href="{{route('student.delete', $student->id)}}" class="glyphicon glyphicon-trash"></a> &nbsp;
                    {{-- <a href="{{route()}}" class="glyphicon glyphicon-eye-open"></a>; --}}
                </td>
              </tr>
              @endforeach
            </tbody>
          </table>
</body>
</html>