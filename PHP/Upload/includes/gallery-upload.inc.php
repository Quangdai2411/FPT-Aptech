<?php
if(isset($_POST['submit'])){
    $newFileName = $_POST['filename'];
    if(empty($newFileName)){
        $newFileName = "gallery";
    }else{
        $newFileName = strtolower(str_replace(" ", "-", $newFileName));
    }

    $imageTittle = $_POST['filetitle'];
    $imageDesc = $_POST['filedesc'];

    $file = $_FILES['file'];

    $fileName = $file['name'];
    $fileType = $file['type'];
    $fileTempName = $file['tmp_name'];
    $fileError = $file["error"];
    $fileSize = $file['size'];

    $fileExt = explode(".", $fileName);
    $fileActualExt = strtolower(end($fileExt));

    $allowed = array("png", "jpg", "jpeg");

    if(in_array($fileActualExt, $allowed)){
        if($fileError === 0){
            if($fileSize < 5000000){
                $imageFullName = $newFileName. "." . uniqid("", true). "." . $fileActualExt;
                $fileDestination = "../img/gallery/" . $imageFullName;

                include_once "dbh.inc.php";
                if(empty($imageTittle) || empty($imageDesc)){
                    header("Location:../gallery.php?upload=empty");
                    exit();
                }else{
                    $sql = "select * from gallery";
                    $stmt = mysqli_stmt_init($conn);
                    if(!mysqli_stmt_prepare($stmt, $sql)){
                        echo "SQL statement failed!";
                    }else{
                        mysqli_stmt_execute($stmt);
                        $result = mysqli_stmt_get_result($stmt);
                        $rowCount = mysqli_num_rows($result);
                        $setImageOrder = $rowCount + 1;

                        $sql = "insert into gallery(titleGallery, descGallery, imgFullNameGallery, orderGallery) values (?, ?, ?, ?)";
                        if(!mysqli_stmt_prepare($stmt, $sql)){
                            echo "SQL statement failed!";
                        }else{
                            mysqli_stmt_bind_param($stmt, "ssss", $imageTittle, $imageDesc, $imageFullName, $setImageOrder);
                            mysqli_stmt_execute($stmt);

                            move_uploaded_file($fileTempName, $fileDestination);

                            header("Location:../gallery.php?upload=success");   
                        }
                    }
                }
            }else{
                echo "File size is to big!";
                exit();
            }
        }else{
            echo "You had an error";
            exit();
        }
    }else{
        echo "You need to upload a proper file type!!";
        exit();
    }
}    