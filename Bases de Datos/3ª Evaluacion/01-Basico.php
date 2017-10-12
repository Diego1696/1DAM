<html>
<head><title>01-Basico.php</title>
<style>
</style>
</head>
<body>
		<?php
			$Imagenes=array();
			$Imagenes[0]="./Imagenes/enero.jpg";
			$Imagenes[1]="./Imagenes/febrero.jpg";
			$Imagenes[2]="./Imagenes/marzo.jpg";
			$Imagenes[3]="./Imagenes/abril.jpg";
			$Imagenes[4]="./Imagenes/mayo.jpg";
			$Imagenes[5]="./Imagenes/junio.jpg";
			for ($c=0; $c <=5 ; $c++) { 
				echo "<td><img width=100 height=100 src='$Imagenes[$c]'></t>";
			}
		?>
		<br>


			<?php
			echo "<table border='1'";
			for ($c=0; $c <=10 ; $c++){
				echo "<tr><td>$c</td></tr>";
			}  
			echo "</table>";
			?>
			<br>
	<select name="edad" id="edad">
	<?php
	for ($c=0; $c<=100 ; $c++) 
		echo"<option value=$c>$c";
	?>	
	</select>
		
	<?php
	for ($c=1; $c<=100 ; $c++)
		echo"<h1> Bienvenidos a esta pagina $c </h1>";
	?>
</body>
</html>