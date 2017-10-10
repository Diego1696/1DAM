<?php 
session_start();
// Recuperamos datos del formulario
$usuario=$_SESSION['usuario'];
// conectamos con la BD
include("conexion_bd.php");
// creamos consulta
$sql="INSERT INTO valoraciones(fecha, idusuario) VALUES (now(), '$usuario')";
// ejecutamosla consulta
mysql_query($sql) or die("Error en la consulta de insercion $sql");
mysql_close($conexion);
//
header("location:tienda.php");
?>