<?php
// Recuperamos valores del formulario
$fn=$_POST['full_name'];
$us=$_POST['user'];
$ps=MD5($_POST['pass']);
$ma=$_POST['mail'];
$ph=$_POST['phone'];
$ci=$_POST['ciudad'];

include("conexion_bd.php");

// consulta sql
$sql="INSERT INTO usuarios(usuario, password, nombreCompleto, email, telefono, ciudad) VALUES ('$us', '$ps', '$fn', '$ma', '$ph', $ci)";
mysql_query($sql) or die(mysql_error());

mysql_close($conexion);
header("location:index.php");
?>







s