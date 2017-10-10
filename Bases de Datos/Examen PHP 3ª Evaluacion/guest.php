<?php
session_start();

$usu = 'invitado';
$cla = 'invitado';

include("conexion_bd.php");

$registros=mysql_query($sql);
$total = mysql_num_rows($registros);
mysql_query($sql);
$_SESSION['usuario'] =$usu;
header("location:tienda.php");




