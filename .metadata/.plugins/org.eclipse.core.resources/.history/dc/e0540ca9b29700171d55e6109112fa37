<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>

<tag:template title="Lista de Boteco">
	<div class="row">
		<h2>Listar</h2>
	</div>

	<div class="row">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Nome</th>
					<th>Endereço</th>
					<th>Taxa Serviço</th>
					<th>Entrada</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${botecos }" var="item">
					<tr>
						<td>${item.codigo}</td>
						<td>${item.nome}</td>
						<td>${item.endereco}</td>
						<td>${item.taxaServico}</td>
						<td>${item.entrada}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</tag:template>