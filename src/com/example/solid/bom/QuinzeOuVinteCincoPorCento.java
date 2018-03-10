package com.example.solid.bom;

public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo{

	public double calcula(Funcionario employee) {
		if(employee.getSalarioBase() > 2000.0) {
			return employee.getSalarioBase() * 0.75;
		}else {
			return employee.getSalarioBase() * 0.85;
		}
	}
}
