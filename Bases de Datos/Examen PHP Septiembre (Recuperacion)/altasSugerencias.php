<?php 
session_start();
// Recuperamos datos del formulario
$usuario=$_SESSION['usuario'];
$sugerencias=$_POST['sugerencias'];
// conectamos con la BD
include("conexion_bd.php");
// creamos consulta
$sql="INSERT INTO sugerencias(usuario, descripcion, fecha) VALUES ('$usuario','$sugerencias', now())";
// ejecutamosla consulta
mysql_query($sql) or die("Error en la consulta de insercion $sql");
mysql_close($conexion);
//
header("location:tienda.php");
?>