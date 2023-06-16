<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.css">
    <style>
        .wrapper{
            width: 500px;
            margin: 0 auto;
        }
    </style>
</head>
<body>
<div class="wrapper">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-12">
                <div class="page-header">
                    <h2>Create Record</h2>
                </div>
                <form action="includes/insert.php" action="<?php echo htmlspecialchars(basename($_SERVER['REQUEST_URI'])); ?>" method="post">
                    <div class="form-group <?php echo (!empty($tenkhoahoc_err)) ? 'has-error' : ''; ?>">
                        <label>Tên khóa học</label>
                        <input type="text" name="tenkhoahoc" class="form-control" value="<?php echo $tenkhoahoc; ?>">
                        <span class="help-block"><?php echo $tenkhoahoc_err; ?></span>
                    </div>
                    <div class="form-group <?php echo (!empty($tengiangvien_err)) ? 'has-error' : ''; ?>">
                        <label>Tên giảng viên</label>
                        <input type="text" name="tengiangvien" class="form-control" value="<?php echo $tengiangvien; ?>">
                        <span class="help-block"><?php echo $tengiangvien_err; ?></span>
                    </div>
                    <div class="form-group <?php echo (!empty($mota_err)) ? 'has-error' : ''; ?>">
                        <label>Mô tả</label>
                        <textarea name="mota" class="form-control">?php echo $mota; ?></textarea>
                        <span class="help-block"><?php echo $mota_err; ?></span>
                    </div>
                    <div class="form-group <?php echo (!empty($kienthuc_err)) ?'has-error' : ''; ?>">
                        <label>Kiến thức</label>
                        <textarea name="kienthuc" class="form-control"><?php echo $kienthuc; ?></textarea>
                        <span class="help-block"><?php echo $kienthuc_err; ?></span>
                    </div>
                    <div>
                        <input type="file" name="file">
                    </div>
                    <div class="form-group <?php echo (!empty($giaten_err)) ? 'has-error' : ''; ?>">
                        <label>Giá tiền</label>
                        <input type="number" name="giaten" class="form-control" value="<?php echo $giatien; ?>">
                        <span class="help-block"><?php echo $giaten_err; ?></span>
                    </div>
                    <div class="form-group <?php echo (!empty($giaotrinh_err)) ? 'has-error' : ''; ?>">
                        <label>Giáo trình</label>
                        <input type="text" name="giaotrinh" class="form-control" value="<?php echo $giaotrinh; ?>">
                        <span class="help-block"><?php echo $giaotrinh_err; ?></span>
                    </div>
                    <input type="submit" class="btn btn-primary" value="Submit">
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>