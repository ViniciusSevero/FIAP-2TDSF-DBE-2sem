<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tag:template title="Lista de Cervejas">
	<table class="table">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Marca</th>
				<th>Valor</th>
				<th>Teor Alcólico</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lista}" var="cerveja">
				<tr>
					<td>${cerveja.nome}</td>
					<td>${cerveja.marca}</td>
					<td>${cerveja.valor}</td>
					<td>${cerveja.teorAlcolico}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</tag:template>
