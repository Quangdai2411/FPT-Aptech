<?php
$student = array("sdt1" => array("name" => "Đại", "age" => 20, "scores" => 70),
                 "sdt2" => array("name" => "Giáp", "age" => 19, "scores" => 50),
                 "sdt3" => array("name" => "Đức", "age" => 19, "scores" => 60),
                 "sdt4" => array("name" => "Hùng", "age" => 19, "scores" => 40));

                 
foreach($student as $value){
    $a = $value["scores"] > 40 ? "Học sinh thi đỗ là {$value["name"]} <br>" : "Học sinh không đỗ là {$value["name"]}";
    echo $a; 
}