<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>

<tag:template title="Cadastro de Cervejas">
	<form method="post" action="cadastrar">
		<div class="form-group">
			<label for="nome">Nome:</label>
			<input type="text" name="nome" id="nome" class="form-control">
		</div>
		<div class="form-group">
			<label for="marca">Marca:</label>
			<input type="text" name="marca" id="marca" class="form-control">
		</div>
		<div class="form-group">
			<label for="valor">Valor:</label>
			<input type="text" name="valor" id="valor" class="form-control">
		</div>
		<div class="checkbox">
		  	<label><input type="checkbox" name="teorAlcolico"> Teor Alc�lico</label>
		</div>
		<div class="form-group">
			<input type="submit" value="Cadastrar" class="btn btn-primary"/>
		</div>
	</form>
</tag:template>
