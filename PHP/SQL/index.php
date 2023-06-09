<?php
$myDB = new mysqli('localhost', 'root', '', 'student1');
if($myDB->error){
    die('Connect Error (' . $myDB->connect_errno . ') ' . $myDB->connect_error);
}
$sql = "select * from sinhvien";
$result = $myDB->query($sql);
?>

<table cellSpacing="2" cellPadding="6" align="center" border="1">
    <tr>
        <td colspan="4">
            <h3 align="center">List of students</h3>
        </td>
    </tr>
    <tr>
        <td align="center">TenSV</td>
        <td align="center">LopHoc</td>
        <td align="center">Diem</td>
    </tr>
<?php
while($row = $result->fetch_assoc()){
    echo "<tr>";
    echo "<td>";

    echo stripcslashes($row["TenSV"]);
    echo "</td><td align='center'>";
    echo $row["LopHoc"];
    echo "</td><td>";
    echo $row["Diem"];
    echo "</td>";
    echo "</tr>";
}    
?>
</table>