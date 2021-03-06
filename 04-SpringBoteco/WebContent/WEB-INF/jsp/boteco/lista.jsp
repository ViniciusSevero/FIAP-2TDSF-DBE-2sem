<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<tag:template title="Lista de Botecos">
	<table class="table">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Endere�o</th>
				<th>Entrada</th>
				<th>Taxa de Servi�o</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lista}" var="boteco">
				<tr>
					<td>${boteco.nome}</td>
					<td>${boteco.endereco}</td>
					<td>${boteco.entrada}</td>
					<td>${boteco.taxaServico}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</tag:template>
