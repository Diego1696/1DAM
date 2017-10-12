<html>
<head><title>02-Recibe.php</title>
<style>
</style>
</head>
<body>
<?php
//Recuperamos los valores del formulario
	$nom=$_POST['nombre'];
	$cla=$_POST['clave'];
	echo "<h2>Tu nombre es $nom y tu clave es $cla </h2>";
	//echo "<h2>Tu nombre es $_POST[nombre] y tu clave es $_POST[clave]</h2>";
	//echo "<h2>Tu nombre es $_POST['nombre']. y tu clave es $_POST['clave'].</h2>";	
	echo "<a href= '02-Formulario.php'>Volver</a>";
?>

</body>
</html>