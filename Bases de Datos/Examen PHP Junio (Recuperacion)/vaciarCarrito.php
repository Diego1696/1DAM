<?php
session_start();
include("conexion_bd.php");
$sql="DELETE FROM compras WHERE comprador='$_SESSION[usuario]'";
mysql_query($sql) or die ("Error en el borrado.");
mysql_close($conexion);
header("location:verCarrito.php");
?>