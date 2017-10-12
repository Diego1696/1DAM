<html>
<head><title></title>
<style>
</style>
</head>
<body style="background-color:#25BADA;">
	<?php
		include("conexion.php");
	?>
	<form name="alumnos" id="alumnos" background="red" method="post" action="InsAlumnos.php">
		<table align="center" width="60%">
			<tr>
				<td colspan="2"><img src="./imagenes/logosz.jpg" width="500px"></td>
			</tr>
			<tr>
				<td>DNI:</td>
				<td><input type="text" name="dnd="dni" placeholder="Dni"></td>
			</tr>
			<tr>
				<td>Nombre y Apellidos:</td>
				<td><input type="text" name="nombre" id="nombre" placeholder="Apellidos y Nombre"></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input type="email" name="correo" id="correo" placeholder="Correo Electronico"></td>
			</tr>
			<tr>
				<td>Telefono:</td>
				<td><input type="text" name="telefono" id="telefono" placeholder="Movil"></td>
			</tr>
			<tr>
				<td>Estudios:</td>
				<td><select name="estudios" id="estudios">
					<option value="">
						<?php
							$sql="SELECT * FROM estudios";
							$registros=mysqli_query($conexion,$sql);
							while ($linea=mysqli_fetch_array($registros)) {
								echo "<option value='$linea[idestudio]'>$linea[estudio]";
							}
						?>
					</option>
				</select>
			</td>
			</tr>
			<tr>
				<td>Emsa:</td>
				<td><select name="empresa" id="empresa">
					<option value="">
						<?php
							$sql="SELECT * FROM empresas";
							$registros=mysqli_query($conexion,$sql);
							while ($linea=mysqli_fetch_array($registros)) {
								$nif=$linea['nif'];
								$empresa=$linea['empresa'];
								echo "<option value='$nif'>$empresa";
							}
						?>

					</option>
				</select>
			</td>
			</tr>
			<tr>
				<td><input type="submit" value="Enviar"></td>
			</tr>
		</table>
	</form>

</body>
</html>