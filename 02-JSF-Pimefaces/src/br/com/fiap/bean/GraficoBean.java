package br.com.fiap.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.CategoryAxis;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.LineChartSeries;
import org.primefaces.model.chart.PieChartModel;

import br.com.fiap.bo.AlunoBO;
import br.com.fiap.dao.AlunoDAO;
import br.com.fiap.dao.impl.AlunoDAOImpl;

@ManagedBean
public class GraficoBean {

	private PieChartModel pizza;
	private LineChartModel line;
	private AlunoBO bo;
	
	@PostConstruct
	private void init(){
		bo = new AlunoBO();
		pizza = new PieChartModel();
		pizza.set("Otimo", bo.contarPorRating(0, 4));
		pizza.set("Regular", bo.contarPorRating(5, 7));
		pizza.set("rUIM", bo.contarPorRating(8, 10));
		pizza.setShowDataLabels(true);
		pizza.setLegendPosition("e");
		
		line = new LineChartModel();
		line.setLegendPosition("w");
		line.setTitle("Alunos por m�s");
		line.getAxes().put(AxisType.X, new CategoryAxis("Meses"));
		LineChartSeries serie1 = new LineChartSeries();
		serie1.setLabel("ALunos");
		for(int i = 1; i <= 12; i++){
			serie1.set(i, bo.contarPorMes(i));
		}
		line.addSeries(serie1);
	}

	public PieChartModel getPizza() {
		return pizza;
	}

	public void setPizza(PieChartModel pizza) {
		this.pizza = pizza;
	}

	public LineChartModel getLine() {
		return line;
	}

	public void setLine(LineChartModel line) {
		this.line = line;
	}
	
	
	
	
}
