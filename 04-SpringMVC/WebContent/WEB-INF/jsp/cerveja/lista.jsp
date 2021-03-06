<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags"%>

<tag:template title="Lista de Cerveja">
	<div class="row">
		<h2>Lista de Cerveja</h2>
	</div>

	<c:if test="${not empty msg}">
	    ${msg}
	</c:if>

	<div class="row">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>#</th>
					<th>Nome</th>
					<th>Marca</th>
					<th>Valor</th>
					<th>Teor Alc.</th>
					<th></th>
				</tr>
			</thead>

			<tbody>
				<c:forEach items="${cervejas }" var="item">
					<tr>
						<td>${item.codigo}</td>
						<td>${item.nome}</td>
						<td>${item.marca}</td>
						<td>${item.valor}</td>
						<td>${item.teorAlcoolico}</td>
						<td>
							<a href="<c:url value="/cerveja/alterar/${item.codigo}" />">Editar</a>
							<a href="<c:url value="/cerveja/excluir/${item.codigo}" />">Excluir</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</tag:template>