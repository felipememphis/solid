package com.example.solid.ruim;

public class CalculadoraDeSalarioRuim {

	private static final String DESENVOLVEDOR = "Desenvolvedor";
	
	private static final String DBA = "DBA";
	
	private static final String TESTER = "Tester";
	
	public double calcula(Funcionario func) {
		if(DESENVOLVEDOR.equals(func.getCargo())) {
			return dezOuVintePorCento(func);
		}
		
		if(DBA.equals(func.getCargo()) || TESTER.equals(func.getCargo())) {
			return quinzeOuVinteCincoPorCento(func);
		}
		
		throw new RuntimeException("funcionario invalido");
	}
	
	private double dezOuVintePorCento(Funcionario employee) {
		if(employee.getSalarioBase() > 3000.0) {
			return employee.getSalarioBase() * 0.8;
		}else {
			return employee.getSalarioBase() * 0.9;
		}
	}
	
	private double quinzeOuVinteCincoPorCento(Funcionario employee) {
		if(employee.getSalarioBase() > 2000.0) {
			return employee.getSalarioBase() * 0.75;
		}else {
			return employee.getSalarioBase() * 0.85;
		}
	}
	
}
