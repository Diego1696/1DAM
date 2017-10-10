<?php
// Recuperamos valores del formulario
$fn=$_POST['full_name'];
$us=$_POST['user'];
$ps=MD5($_POST['pass']);
$ma=$_POST['mail'];
$ph=$_POST['phone'];
$idpais=$_POST['idpais'];

include("conexion_bd.php");

// consulta sql
$sql="INSERT INTO usuarios(usuario, password, nombreCompleto, email, telefono, idpais) VALUES ('$us', '$ps', '$fn', '$ma', '$ph', '$idpais')";
mysql_query($sql) or die(mysql_error());

mysql_close($conexion);
header("location:index.php");
?>







