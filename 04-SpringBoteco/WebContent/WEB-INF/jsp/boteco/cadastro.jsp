<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>

<tag:template title="Cadastro de Botecos">
	<form method="post" action="cadastrar">
		<div class="form-group">
			<label for="nome">Nome:</label>
			<input type="text" name="nome" id="nome" class="form-control">
		</div>
		<div class="form-group">
			<label for="endereco">Endere�o:</label>
			<input type="text" name="endereco" id="endereco" class="form-control">
		</div>
		<div class="checkbox">
		  	<label><input type="checkbox" name="taxaServico"> Taxa de Servi�o</label>
		</div>
		<div class="form-group">
			<label for="entrada">Entrada:</label>
			<input type="text" name="entrada" id="entrada" class="form-control">
		</div>
		<div class="form-group">
			<input type="submit" value="Cadastrar" class="btn btn-primary"/>
		</div>
	</form>
</tag:template>
