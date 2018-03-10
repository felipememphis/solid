package com.example.solid.bom;

public class DezOuVintePorCento implements RegraDeCalculo {

	public double calcula(Funcionario employee) {
		if(employee.getSalarioBase() > 3000.0) {
			return employee.getSalarioBase() * 0.8;
		}else {
			return employee.getSalarioBase() * 0.9;
		}
	}
}
