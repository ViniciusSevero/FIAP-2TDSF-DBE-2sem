<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Unic�rnios</title>
</head>
<body>
	<h1>Cadastro de Unic�rnios</h1>
	
	<form method="post" action="cadastrar">
		<div>
			<label>Nome</label>
			<input type="text" name="nome">
		</div>
		<div>
			<label>Altura</label>
			<input type="text" name="altura">
		</div>
		<div>
			<label>Peso</label>
			<input type="text" name="peso">
		</div>
		<div>
			<input type="submit" value="Cadastrar">
		</div>
	</form>	
</body>
</html>