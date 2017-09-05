<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>

<tag:template title="Cadastro de Boteco">

	<div class="row">
		<h2>Cadastrar</h2>
	</div>

	<div class="row">
		<form method="POST" action="cadastrar">
			<div class="form-group">
				<label for="nome">Nome</label> <input type="text" id="nome"
					name="nome" class="form-control" />
			</div>
			<div class="form-group">
				<label for="endereco">Endereco</label> <input type="text"
					id="endereco" name="endereco" class="form-control" />
			</div>
			<div class="form-group">
				<label for="taxa">Taxa Servi�o</label> <input type="checkbox"
					id="taxa" name="taxa" />
			</div>
			<div class="form-group">
				<label for="entrada">Entrada</label> <input type="text" id="entrada"
					name="entrada" class="form-control" />
			</div>
			<div class="form-group">
				<input type="submit" value="Enviar" class="btn btn-success" />
			</div>
		</form>

	</div>

</tag:template>