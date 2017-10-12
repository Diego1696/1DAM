<?php
//Recuperamos datos del formulario
	$dni=$_POST['dni'];
	$nombre=$_POST['nombre'];
	$telefono=$_POST['telefono'];
	$correo=$_POST['correo'];
	$estudios=$_POST['estudios'];
	$empresa=$_POST['empresa'];
//conectamos con la BD
	include("conexion.php");
//creamos consulta
	$sql="INSERT INTO alumnos(dni, alumno, email, telefono, nifempresa, idestudios) VALUES('$dni', '$nombre', '$correo', '$telefono', '$empresa', '$estudios')";
//ejecutamos la consulta
	mysqli_query($conexion,$sql) or die("Error en la consulta de insercion $sql");
//cerramos la conexion	
	mysqli_close($conexion);
//redirigimos a la pagina principal	
	header("Location:Practica1.php");
?>