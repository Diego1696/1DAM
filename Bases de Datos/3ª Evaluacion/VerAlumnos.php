<html>
<head><title></title>
<style>
</style>
</head>
<body>
	<?php
	include("conexion.php")
//creamos la consulta
	$sql="SELECT a.dni, a.alumnos,a.email,a.telefono,emp.empresas,es.estudios FROM alumnos as a, empresas as emp, estudios as es WHERE a.nifempresa=emp.empresa AND a.idestudios= es.idestudio";
//ejecutamos la consulta
	$registos=mysqli_query($conexion,$sql);
//leemos el contenido de $registros
	while ($linea=mysqli_fetch_array($registros) {
		echo "<tr>
		<td>$linea[dni]</td>
		<td>$linea[alumno]</td>
		<td>$linea[email]</td>
		<td>$linea[telefono]</td>
		<td>$linea[empresa]</td>
		<td>$linea[estudios]</td>
		</tr>";	
	}
	mysqli_close($conexion);	

	?>
</body>
</html>